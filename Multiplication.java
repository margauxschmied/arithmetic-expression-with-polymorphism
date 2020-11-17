public class Multiplication extends Operation{

    private final Expression gauche;
    private final Expression droite;


    public Multiplication(Expression gauche,Expression droite) {
        super(gauche, droite);
        this.gauche= gauche;
        this.droite=droite;
    }



    public double calcule (double g, double d){
        return g*d;
    }

    public char getSymb() {

        return '*';
    }

}
