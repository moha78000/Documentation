/**
 * La classe abstraite ArmementSupplementaire étend Voilier.
 * Cette classe représente un armement supplémentaire pour un voilier.
 */
public abstract class ArmementSupplementaire extends Voilier {

    /**
     * Le composant du voilier à décorer.
     */
    Voilier composantadecore;

    /**
     * Constructeur de la classe ArmementSupplementaire.
     * @param composantadecore Le composant du voilier à décorer.
     */
    public ArmementSupplementaire(Voilier composantadecore) {
        super();
        this.composantadecore = composantadecore;
    }

    /**
     * Applique la méthode suivre route du composant décoré.
     */
    public void appliqueSuivreRoute() {
        composantadecore.appliquerSuivreRoute();
    }

    /**
     * Définit la méthode suivre route du composant décoré.
     * @param suivreRoute L'objet SuivreRoute à définir.
     */
    public void setSuivreRoute(SuivreRoute suivreRoute) {
        composantadecore.setSuivreRoute(suivreRoute);
    }
}
