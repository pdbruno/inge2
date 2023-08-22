package org.autotest.operators.conditionals;

import org.autotest.operators.MutationOperator;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtElement;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#REMOVE_CONDITIONALS
 * <p>
 * Este operador reemplaza los valores en las condiciones de guardas por false.
 */
public class FalseConditionalsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        return candidate instanceof CtConditional<?> || candidate instanceof CtIf;
    }

    @Override
    public void process(CtElement candidate) {
        CtLiteral<Boolean> falso = candidate.getFactory().Code().createLiteral(false);
        if (candidate instanceof CtConditional<?>) {
            ((CtConditional<?>) candidate).setCondition(falso);
        } else if (candidate instanceof CtIf) {
            ((CtIf) candidate).setCondition(falso);
        }
    }

    @Override
    public String describeMutation(CtElement candidate) {
        if (candidate instanceof CtConditional<?>) {
            CtConditional<?> op = (CtConditional<?>)candidate;
            return this.getClass().getSimpleName() + ": Se reemplazó " +
                    op.getCondition().toString() + " por false" +
                    " en la línea " + op.getCondition().getPosition().getLine() + ".";
        } else if (candidate instanceof CtIf) {
            CtIf op = (CtIf)candidate;
            return this.getClass().getSimpleName() + ": Se reemplazó " +
                    op.getCondition().toString() + " por false" +
                    " en la línea " + op.getCondition().getPosition().getLine() + ".";
        }

        return null;
    }
}
