public abstract class Operation implements Expression {
    private final Expression gauche, droite;


    public Operation(Expression gauche, Expression droite) {
        this.gauche = gauche;
        this.droite = droite;
    }

    abstract double calcule(double g, double d) throws ExpressionException;

    abstract public char getSymb();


    @Override
    public double evalue(double... variables) throws ExpressionException {
        return calcule(gauche.evalue(variables), droite.evalue(variables));
    }




    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();



        if(((this instanceof Multiplication || this instanceof Division) &&
                (gauche instanceof Addition || gauche instanceof Soustraction)) ||
                (this instanceof Multiplication && gauche instanceof Division)){
            s1.append("(");
            s1.append(gauche);
            s1.append(")");

        }

        else{
            s1.append(gauche);
        }

        if(this instanceof Division && droite instanceof Operation||
                this instanceof Multiplication && (droite instanceof Addition || droite instanceof Soustraction)){
            s2.append("(");
            s2.append(droite);
            s2.append(")");
        }

        else{
            s2.append(droite);
        }


        s.append(s1);
        s.append(" ");
        s.append(this.getSymb());
        s.append(" ");
        s.append(s2);

        return s.toString();


    }


}