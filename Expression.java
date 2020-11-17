public interface Expression {
    /* Evalue et renvoie la valeur de l’expression courante dans un
    contexte d’évaluation. Le nombre variables[i] est la valeur de la
    variable dont l’identifiant est i. */
    double evalue(double... variables) throws ExpressionException;


}
