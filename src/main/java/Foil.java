/**
 * La classe Foil étend ArmementSupplementaire.
 * Cette classe représente un armement foil pour un voilier.
 */

public class Foil extends ArmementSupplementaire {

    /**
     * Constructeur de la classe Foil.
     * @param composantadecore Le composant du voilier à décorer.
     */
    public Foil(Voilier composantadecore) {
        super(composantadecore);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'objet Foil.
     * @return Une chaîne de caractères représentant l'objet Foil.
     */
    @Override
    public String toString() {
        return composantadecore.toString() + " Armement foil ";
    }
}
