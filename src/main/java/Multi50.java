/**
 * La classe Multi50 représente un type de multicoque spécifique.
 * Elle hérite de la classe Multicoque et permet de créer un bateau
 * de type Multi50 avec un nom et un skipper.
 *
 */
public class Multi50 extends Multicoque {

    /**
     * Constructeur qui crée un bateau Multi50 avec un nom et un skipper.
     *
     * @param nom     Le nom du bateau.
     * @param skipper Le nom du skipper.
     */
    public Multi50(String nom, String skipper) {
        super(nom, skipper);
    }

    /**
     * Retourne une représentation textuelle de l'objet Multi50.
     *
     * @return Une chaîne de caractères contenant "Multi50" suivi des informations du multicoque.
     */
    @Override
    public String toString() {
        return "Multi50" + super.toString();
    }
}
