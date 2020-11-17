public class Soustraction extends Operation{

    private final Expression gauche;
    private final Expression droite;


    public Soustraction(Expression gauche,Expression droite) {
        super(gauche, droite);
        this.gauche= gauche;
        this.droite=droite;
    }



    public double calcule (double g, double d){
        return g-d;
    }

    public char getSymb() {

        return '-';
    }


}
