public abstract class Operation implements Expression {
    private final Expression gauche, droite;


    public Operation(Expression gauche, Expression droite) {
        this.gauche = gauche;
        this.droite = droite;
    }

    abstract double calcule(double g, double d) ;

    abstract public char getSymb();


    @Override
    public double evalue(double... variables)  {
        return calcule(gauche.evalue(variables), droite.evalue(variables));  //redescent l'arbre de calcule jusqu'a trouvé une constante ou une variable
    }                                                                        //puis remonte l'arbre en faisant les calcules




    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        //on cherche les expressions de gauche necessitant des parentheses
        if((this instanceof Multiplication || this instanceof Division) &&
                (gauche instanceof Addition || gauche instanceof Soustraction)) {
            s.append("(");
            s.append(gauche);
            s.append(")");
        }
        //sinon on n'en met pas
        else{
            s.append(gauche);
        }

        s.append(" ");
        s.append(this.getSymb());  //on ajoute le symbole correspondant a l'operation
        s.append(" ");

        //on cherche les expressions de droite necessitant des parentheses
        if(this instanceof Division && droite instanceof Operation||
                this instanceof Multiplication && (droite instanceof Addition || droite instanceof Soustraction)
                || this instanceof Soustraction && droite instanceof Addition){
            s.append("(");
            s.append(droite);
            s.append(")");
        }
        //sinon on n'en met pas
        else{
            s.append(droite);
        }

        return s.toString();

    }

}
