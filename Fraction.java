public class Fraction{

    /** Numerateur */
    private int numerateur;
    
    /** Denominateur */
    private int denominateur;

    /**
     * Initialise une fraction avec un numerateur et un denominateur 
     * 
     * @param numerateur	numerateur de la fraction
     * @param denominateur	denominateur de la fraction
     */
    public Fraction(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }
    
    /**
     * Retourne une chaîne de caractères représentant la fraction
     * Le format utilisé est "numerateur/denominateur".
     * 
     * @return une chaîne contenant le prénom suivi du nom de l'employé
     */
    @Override
    public String toString() {
        return numerateur + "/" + denominateur;
    }
}
