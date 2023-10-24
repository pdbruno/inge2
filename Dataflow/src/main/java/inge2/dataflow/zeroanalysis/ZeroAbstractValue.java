package inge2.dataflow.zeroanalysis;

/**
 * This enum represents the possible values of the zero analysis for a variable.
 */
public enum ZeroAbstractValue {

    /**
     * We don't have information about the variable.
     */
    BOTTOM("bottom"),

    /**
     * The variable is not zero.
     */
    NOT_ZERO("not-zero"),

    /**
     * The variable is zero.
     */
    ZERO("zero"),

    /**
     * The variable may be (or not) zero.
     */
    MAYBE_ZERO("maybe-zero");

    /**
     * The name of the ZeroAbstractValue.
     */
    private final String name;

    @Override
    public String toString() {
        return this.name;
    }

    ZeroAbstractValue(String name) {
        this.name = name;
    }

    /**
     * Returns the result of the addition between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the addition.
     */
    public ZeroAbstractValue add(ZeroAbstractValue another) {
        //version compacta de la tabla de suma de valores abstractos de cero
        if (this == ZeroAbstractValue.BOTTOM || another == ZeroAbstractValue.BOTTOM){
            return  ZeroAbstractValue.BOTTOM;
        } else if (this == ZeroAbstractValue.MAYBE_ZERO || another == ZeroAbstractValue.MAYBE_ZERO) {
            return ZeroAbstractValue.MAYBE_ZERO;
        } else if (this == ZeroAbstractValue.ZERO) {
            return another;
        } else {
            if (another == ZeroAbstractValue.ZERO){
                return ZeroAbstractValue.NOT_ZERO;
            } else {
                return ZeroAbstractValue.MAYBE_ZERO;
            }
        }
    }

    /**
     * Returns the result of the division between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the division.
     */
    public ZeroAbstractValue divideBy(ZeroAbstractValue another) {
        //version compacta de la tabla de division de valores abstractos de cero
        if (this == ZeroAbstractValue.BOTTOM || another == ZeroAbstractValue.BOTTOM || another == ZeroAbstractValue.ZERO){
            return  ZeroAbstractValue.BOTTOM;
        } else if (this == ZeroAbstractValue.ZERO && another == ZeroAbstractValue.NOT_ZERO) {
            return ZeroAbstractValue.ZERO;
        } else if (this == ZeroAbstractValue.NOT_ZERO && another == ZeroAbstractValue.NOT_ZERO) {
            return ZeroAbstractValue.NOT_ZERO;
        } else if (this == ZeroAbstractValue.MAYBE_ZERO && another == ZeroAbstractValue.NOT_ZERO) {
            return ZeroAbstractValue.MAYBE_ZERO;
        } else { // if (another == ZeroAbstractValue.MAYBE_ZERO)
            return ZeroAbstractValue.MAYBE_ZERO;
        }
    }

    /**
     * Returns the result of the multiplication between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the multiplication.
     */
    public ZeroAbstractValue multiplyBy(ZeroAbstractValue another) {
        //version compacta de la tabla de multiplicacion de valores abstractos de cero
        if (this == ZeroAbstractValue.BOTTOM || another == ZeroAbstractValue.BOTTOM){
            return  ZeroAbstractValue.BOTTOM;
        } else if (this == ZeroAbstractValue.ZERO || another == ZeroAbstractValue.ZERO) {
            return ZeroAbstractValue.ZERO;
        } else if (this == ZeroAbstractValue.MAYBE_ZERO || another == ZeroAbstractValue.MAYBE_ZERO) {
            return ZeroAbstractValue.MAYBE_ZERO;
        } else {
            return ZeroAbstractValue.NOT_ZERO;
        }
    }

    /**
     * Returns the result of the subtraction between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the subtraction.
     */
    public ZeroAbstractValue substract(ZeroAbstractValue another) {
        return this.add(another);
    }

    /**
     * Returns the result of the merge between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the merge.
     */
    public ZeroAbstractValue merge(ZeroAbstractValue another) {
        //union de conjuntos suponendo bottom = conjunto vacio y MAYBE_ZERO = top
        if (this == ZeroAbstractValue.BOTTOM) {
            return another;
        } else if (another == ZeroAbstractValue.BOTTOM) {
            return this;
        } else if (this == another) {
            return this;
        } else {
            return ZeroAbstractValue.MAYBE_ZERO;
        }
    }
}
