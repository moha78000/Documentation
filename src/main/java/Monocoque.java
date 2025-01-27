/**
 * La classe Monocoque étend Voilier.
 * Cette classe représente un voilier de type monocoque.
 */
public class Monocoque extends Voilier {

    /**
     * Constructeur de la classe Monocoque avec SuivreRoute.
     * @param nom Le nom du voilier.
     * @param suivreroute L'objet SuivreRoute.
     * @param skipper Le skipper du voilier.
     */
    public Monocoque(String nom, SuivreRoute suivreroute, String skipper) {
        super(nom, suivreroute);
    }

    /**
     * Constructeur de la classe Monocoque sans SuivreRoute.
     * @param nom Le nom du voilier.
     * @param skipper Le skipper du voilier.
     */
    public Monocoque(String nom, String skipper) {
        super(nom, skipper);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'objet Monocoque.
     * @return Une chaîne de caractères représentant l'objet Monocoque.
     */
    @Override
    public String toString() {
        return "Le nom est : " + nom + " Le bateau est de type : Monocoque ";
    }
}
