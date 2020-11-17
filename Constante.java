public class Constante implements Expression{
    private final double constante;

    public Constante(double constante) {
        this.constante=constante;
    }



    public double evalue(double... variables) {
        return constante;
    }

    @Override
    public String toString() {
        return String.format("%.2f", constante);
    }
}
