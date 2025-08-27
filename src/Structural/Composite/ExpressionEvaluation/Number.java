package Structural.Composite.ExpressionEvaluation;

public class Number implements ArithmeticExpression {
    public int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
