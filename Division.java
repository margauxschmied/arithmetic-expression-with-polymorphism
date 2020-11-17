public class Division extends Operation {

    private final Expression gauche;
    private final Expression droite;


    public Division(Expression gauche,Expression droite) {
        super(gauche, droite);
        this.gauche= gauche;
        this.droite=droite;
    }



    public double calcule (double g, double d) throws DivisionParZeroException{
        if (d == 0) {
            throw new DivisionParZeroException(droite);
        }
        return g/d;

    }

    public char getSymb() {

        return '/';
    }

}
