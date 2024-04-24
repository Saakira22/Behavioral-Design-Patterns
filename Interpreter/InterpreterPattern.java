public class InterpreterPattern {
    public static void main(String[] args) {
        Expression expression = new SubtractionExpression(
            new AdditionExpression(new NumberExpression(5), new NumberExpression(2)),
            new AdditionExpression(new NumberExpression(3), new NumberExpression(1))
        );

        int result = expression.interpret();
        System.out.println("Result: " + result); 
    }
}
