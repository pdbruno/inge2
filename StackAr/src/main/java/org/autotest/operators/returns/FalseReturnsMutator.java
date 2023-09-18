package org.autotest.operators.returns;

import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#FALSE_RETURNS
 * <p>
 * Este operador reemplaza los valores de retorno de las funciones que devuelven booleano por false.
 */
public class FalseReturnsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        if (!(candidate instanceof CtReturn)) {
            return false;
        }
        CtReturn op =  (CtReturn) candidate;
        return ! op.getReturnedExpression().toString().equals("false") && op.getReturnedExpression().getType().toString().equals("boolean");
    }

    @Override
    public void process(CtElement candidate) {
        CtReturn op = (CtReturn) candidate;
        op.setReturnedExpression(candidate.getFactory().Code().createLiteral(false));
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtReturn op = (CtReturn) candidate;
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                op.getReturnedExpression().toString() + " por false" +
                " en la línea " + op.getPosition().getLine() + ".";
    }
}
