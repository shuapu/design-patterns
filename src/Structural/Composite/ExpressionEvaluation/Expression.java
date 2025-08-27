package Structural.Composite.ExpressionEvaluation;

public class Expression implements ArithmeticExpression{
    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operator operator;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operator operator) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }


    @Override
    public int evaluate() {
        switch (operator){
            case ADD -> {
                return leftExpression.evaluate()+rightExpression.evaluate();
            }
            case MINUS -> {
                return leftExpression.evaluate()-rightExpression.evaluate();
            }
            case MULTIPLY -> {
                return   leftExpression.evaluate() * rightExpression.evaluate();
            }
            case DIVIDE -> {
                return leftExpression.evaluate()/rightExpression.evaluate();
            }

        }
        return 0;
    }

}
