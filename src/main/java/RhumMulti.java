/**
 * La classe RhumMulti représente un type spécifique de multicoque.
 * Elle hérite de la classe Multicoque et permet de créer un bateau
 * participant à la catégorie Rhum Multi avec un nom et un skipper.
 */
public class RhumMulti extends Multicoque {

    /**
     * Constructeur qui crée un bateau RhumMulti avec un nom et un skipper.
     *
     * @param nom     Le nom du bateau.
     * @param skipper Le nom du skipper.
     */
    public RhumMulti(String nom, String skipper) {
        super(nom, skipper);
    }

    /**
     * Retourne une représentation textuelle de l'objet RhumMulti.
     *
     * @return Une chaîne de caractères contenant "RhumMulti" suivi des informations du multicoque.
     */
    @Override
    public String toString() {
        return "RhumMulti" + super.toString();
    }
}
