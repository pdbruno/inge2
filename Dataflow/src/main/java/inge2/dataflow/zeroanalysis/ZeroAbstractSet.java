package inge2.dataflow.zeroanalysis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * This class represents a mapping of ZeroAbstractValues (BOTTOM, NZ, Z or MZ) to variable names.
 */
public class ZeroAbstractSet {

    /**
     * This map contains the mapping of variable names to ZeroAbstractValues.
     */
    private final HashMap<String, ZeroAbstractValue> map;

    public ZeroAbstractSet() {
        this.map = new HashMap<>();
    }

    /**
     * This method checks if the given variable has a value in the set.
     * @param variable the variable name.
     * @return true if the variable has a value, false otherwise.
     */
    public Boolean hasValue(String variable) {
        return this.map.containsKey(variable);
    }

    /**
     * This method returns the value of the given variable.
     * @param variable the variable name.
     * @return the value of the variable.
     */
    public ZeroAbstractValue getValue(String variable) {
        return this.map.get(variable);
    }

    /**
     * This method sets the value of the given variable.
     * @param variable the variable name.
     * @param value the value of the variable.
     */
    public void setValue(String variable, ZeroAbstractValue value) {
        if (value != null) {
            this.map.put(variable, value);
        }
    }

    /**
     * This method returns the defined variables in this mapping.
     * @return the defined variables in this mapping.
     */
    public Set<String> getDefinedVariables() {
        return this.map.keySet();
    }

    /**
     * This method returns the union of this set with another set.
     * @param another the other set.
     * @return the union of this set with another set.
     */
    public ZeroAbstractSet union(ZeroAbstractSet another) {
        //calculamos la union de ambos conjuntos de variables y mergeamos los valores abstractos para cada nombre de variable
        HashSet<String> all_variables = new HashSet<String>(this.getDefinedVariables());
        all_variables.addAll(another.getDefinedVariables());
        ZeroAbstractSet res = new ZeroAbstractSet();
        for (String variable_name: all_variables) {
            ZeroAbstractValue this_value = this.getValue(variable_name);
            ZeroAbstractValue another_value = another.getValue(variable_name);
            ZeroAbstractValue new_value;

            if (this_value == null) {
                new_value = another_value;
            } else if (another_value == null) {
                new_value = this_value;
            } else {
                new_value = this_value.merge(another_value);
            }
            res.setValue(variable_name, new_value);
        }
        return res;
    }

    /**
     * Clears the set.
     */
    public void clear() {
        this.map.clear();
    }

    /**
     * Copies the values of another set into this set.
     * @param another the other set.
     */
    public void putAll(ZeroAbstractSet another) {
        this.map.putAll(another.map);
    }

    @Override
    public String toString() {
        return "ZeroAbstractSet{" + this.map + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ZeroAbstractSet)) return false;
        ZeroAbstractSet that = (ZeroAbstractSet) o;
        return Objects.equals(this.map, that.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.map);
    }
}
