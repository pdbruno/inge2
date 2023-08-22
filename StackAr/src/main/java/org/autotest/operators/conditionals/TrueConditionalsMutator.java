package org.autotest.operators.conditionals;

import org.autotest.operators.MutationOperator;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtElement;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#REMOVE_CONDITIONALS
 *
 * Este operador reemplaza los valores en las condiciones de guardas por true.
 */
public class TrueConditionalsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        return candidate instanceof CtConditional<?> || candidate instanceof CtIf;
    }

    @Override
    public void process(CtElement candidate) {
        CtLiteral<Boolean> verdadero = candidate.getFactory().Code().createLiteral(true);
        if (candidate instanceof CtConditional<?>) {
            ((CtConditional<?>) candidate).setCondition(verdadero);
        } else if (candidate instanceof CtIf) {
            ((CtIf) candidate).setCondition(verdadero);
        }
    }

    @Override
    public String describeMutation(CtElement candidate) {
        if (candidate instanceof CtConditional<?>) {
            CtConditional<?> op = (CtConditional<?>)candidate;
            return this.getClass().getSimpleName() + ": Se reemplazó " +
                    op.getCondition().toString() + " por true" +
                    " en la línea " + op.getCondition().getPosition().getLine() + ".";
        } else if (candidate instanceof CtIf) {
            CtIf op = (CtIf)candidate;
            return this.getClass().getSimpleName() + ": Se reemplazó " +
                    op.getCondition().toString() + " por true" +
                    " en la línea " + op.getCondition().getPosition().getLine() + ".";
        }

        return null;
    }
}
