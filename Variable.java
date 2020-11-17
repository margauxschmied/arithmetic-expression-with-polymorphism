public class Variable implements Expression{
    private final int id;

    public Variable(int id) throws IllegalArgumentException{
        if (id<0){
            throw new IllegalArgumentException();
        }

        this.id=id;

    }

    public double evalue(double... variables) throws VariableNonDefinieException {

        if (id > variables.length-1) {
            throw new VariableNonDefinieException(this);
        }



        return variables[id];
    }


    @Override
    public String toString() {
        return String.format("x%d", id);
    }
}
