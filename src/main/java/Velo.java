/**
 * La classe Velo représente un armement supplémentaire pour un voilier.
 * Elle hérite de la classe ArmementSupplementaire et permet d'ajouter un vélo
 * comme équipement supplémentaire à un voilier.
 */
public class Velo extends ArmementSupplementaire {

    /**
     * Constructeur qui ajoute un vélo à un voilier en tant qu'armement supplémentaire.
     *
     * @param composantadecore Le voilier auquel on ajoute le vélo comme armement.
     */
    public Velo(Voilier composantadecore) {
        super(composantadecore);
    }

    /**
     * Retourne une représentation textuelle du voilier avec l'ajout de l'armement vélo.
     *
     * @return Une chaîne de caractères contenant les informations du voilier et l'armement "vélo".
     */
    public String toString() {
        return composantadecore.toString() + " Armement vélo ";
    }
}
