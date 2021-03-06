package bcu.HubertDAndTillyD.expressiontree;

import java.util.Map;
import java.util.Set;
//Pair programming with Hubert Dudowicz and Tilly Davies
public class SquareRoot extends Expression {
    Expression expression;

    public SquareRoot(Expression expression) {
        this.expression = expression;
    }

    @Override
    public double evaluate(Map<String, Double> variables) {
        return Math.sqrt(expression.evaluate(variables));
    }

    @Override
    public Set<String> freeVariables() {
        return expression.freeVariables();
    }

    @Override
    public String toString() {
        return "sqrt(" + expression.toString() + ")";
    }
}
