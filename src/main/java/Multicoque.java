/**
 * La classe Multicoque représente un voilier à plusieurs coques.
 * Elle hérite de la classe Voilier et permet d'instancier un multicoque
 * avec un nom et soit un skipper, soit une route à suivre.
 *
 */
public class Multicoque extends Voilier {

    /**
     * Constructeur qui crée un multicoque avec un nom et un skipper.
     *
     * @param nom     Le nom du bateau.
     * @param skipper Le nom du skipper.
     */
    public Multicoque(String nom, String skipper) {
        super(nom, skipper);
    }

    /**
     * Constructeur qui crée un multicoque avec un nom et un itinéraire à suivre.
     *
     * @param nom         Le nom du bateau.
     * @param suivreRoute L'itinéraire que doit suivre le bateau.
     */
    public Multicoque(String nom, SuivreRoute suivreRoute) {
        super(nom, suivreRoute);
    }

    /**
     * Retourne une représentation textuelle de l'objet Multicoque.
     *
     * @return Une chaîne de caractères contenant le nom du bateau et son type.
     */
    @Override
    public String toString() {
        return "le nom est : " + nom + " le type du bateau est : Multicoque";
    }
}
