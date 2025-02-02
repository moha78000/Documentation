/**
 * La classe Ultim représente un type spécifique de multicoque.
 * Elle hérite de la classe Multicoque et permet de créer un bateau
 * participant à la catégorie Ultim avec un nom et un skipper.
 */
public class Ultim extends Multicoque {

    /**
     * Constructeur qui crée un bateau Ultim avec un nom et un skipper.
     *
     * @param nom     Le nom du bateau.
     * @param skipper Le nom du skipper.
     */
    public Ultim(String nom, String skipper) {
        super(nom, skipper);
    }

    /**
     * Retourne une représentation textuelle de l'objet Ultim.
     *
     * @return Une chaîne de caractères contenant "Ultim" suivi des informations du multicoque.
     */
    public String toString() {
        return "Ultim" + super.toString();
    }
}
