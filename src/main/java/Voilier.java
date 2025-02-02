/**
 * La classe Voilier représente un voilier avec un nom, un skipper, et une route à suivre.
 * Elle sert de base pour les différentes classes de voiliers, en offrant la possibilité
 * de définir un skipper et une route, et d'appliquer la route à suivre en fonction de la stratégie choisie.
 */
public abstract class Voilier {

    String nom;
    SuivreRoute suivreRoute; // Le champ suivreRoute appartient à une classe qui implémente l'interface SuivreRoute
    String skipper;

    /**
     * Constructeur qui initialise un voilier avec un nom et un skipper.
     *
     * @param nom     Le nom du voilier.
     * @param skipper Le nom du skipper.
     */
    public Voilier(String nom, String skipper) {
        this.nom = nom;
        this.skipper = skipper;
    }

    /**
     * Constructeur qui initialise un voilier avec un nom et une route à suivre.
     *
     * @param nom         Le nom du voilier.
     * @param suivreRoute L'objet représentant la route à suivre.
     */
    public Voilier(String nom, SuivreRoute suivreRoute) {
        this.nom = nom;
        this.suivreRoute = suivreRoute;
    }

    /**
     * Constructeur par défaut.
     */
    public Voilier() {
    }

    /**
     * Retourne le nom du voilier.
     *
     * @return Le nom du voilier.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit la route à suivre par le voilier.
     *
     * @param sr L'objet qui implémente l'interface SuivreRoute et définit la route à suivre.
     */
    public void setSuivreRoute(SuivreRoute sr) {
        this.suivreRoute = sr;
    }

    /**
     * Applique la méthode suivreRoute en utilisant l'objet SuivreRoute associé au voilier.
     */
    public void appliquerSuivreRoute() {
        this.suivreRoute.suivreRoute();
    }
}
