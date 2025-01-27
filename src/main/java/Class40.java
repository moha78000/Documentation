/**
 * La classe Class40 étend Monocoque.
 * Cette classe représente un voilier de classe 40.
 */
public class Class40 extends Monocoque {

    /**
     * Constructeur de la classe Class40.
     * @param nom Le nom du voilier.
     * @param skipper Le skipper du voilier.
     */
    public Class40(String nom, String skipper) {
        super(nom, skipper);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'objet Class40.
     * @return Une chaîne de caractères représentant l'objet Class40.
     */
    @Override
    public String toString() {
        return "Class40" + super.toString();
    }
}
