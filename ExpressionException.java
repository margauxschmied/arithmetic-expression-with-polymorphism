public class ExpressionException extends Exception{
    public Expression expression;
    public ExpressionException(Expression expression) {

        this.expression = expression;
    }
}
