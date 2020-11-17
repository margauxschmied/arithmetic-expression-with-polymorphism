class Test {
    public static void main(String[] args) throws ExpressionException {

        Expression expression = new Addition(
                new Division(
                        new Division(
                                new Multiplication(
                                        new Division(new Multiplication(new Constante(9), new Constante(7)), new Constante(6)),
                                        new Constante(4)
                                ),
                                new Constante(2)
                        ),
                        new Division(
                                new Constante(6),
                                new Constante(2)
                        )
                ),
                new Division(
                        new Multiplication(
                                new Soustraction(
                                        new Multiplication(
                                                new Soustraction(new Multiplication(
                                                        new Soustraction(new Constante(2), new Constante(6)),
                                                        new Constante(4)
                                                ), new Constante(6)),
                                                new Constante(4)
                                        ), new Constante(6)),
                                new Constante(4)
                        ),
                        new Multiplication(
                                new Soustraction(new Constante(2), new Constante(6)),
                                new Constante(1)
                        )
                )
        );

        /*Expression expression = new Division(new Addition(new Constante(1),
                                                        new Constante(2)),
                                            new Addition(new Constante(3),
                                                        new Constante(4)));*/

        /*Expression expression = new Addition(
                new Division(
                        new Division(
                                new Multiplication(
                                        new Soustraction(new Addition(new Constante(1), new Constante(2)), new Constante(3)),
                                        new Constante(4)
                                ),
                                new Constante(5)
                        ),
                        new Division(
                                new Constante(6),
                                new Constante(7)
                        )
                ),
                new Division(
                        new Multiplication(
                                new Soustraction(
                                        new Multiplication(
                                                new Soustraction(new Multiplication(
                                                        new Soustraction(new Constante(8), new Constante(9)),
                                                        new Constante(10)
                                                ), new Constante(11)),
                                                new Constante(12)
                                        ), new Constante(13)),
                                new Constante(14)
                        ),
                        new Multiplication(
                                new Soustraction(new Constante(15), new Constante(16)),
                                new Variable(0)
                        )
                )
        );*/



        //System.out.printf("%s = %f", expression.toString(), expression.evalue(2));

        /*String eString = expression.toString();
        double p = 0;
        for (int i = 0; i < eString.length(); i++) {
            if (eString.charAt(i) == '(' || eString.charAt(i) == ')') {
                p += 1;
            }
        }
        try {
            System.out.printf("%s = %.3f p = %f", eString, expression.evalue(1), p);
        } catch (ExpressionException e) {
            System.out.printf("%s -> %s", e.toString(), e.expression.toString());
        }*/

        long startTime = System.currentTimeMillis();
        String eString = expression.toString();
        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime);
        System.out.printf("%d ms%n", duration);
        /*
        try {
            System.out.printf("%s = %.2f ", expression.toString(), expression.evalue(1));
        } catch (ExpressionException e) {
            System.out.printf("%s: Erreur dans %s", e.toString(), e.expression.toString());
        }*/
    }
}

