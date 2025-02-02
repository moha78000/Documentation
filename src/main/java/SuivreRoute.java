/**
 * L'interface SuivreRoute définit un contrat pour les différentes routes maritimes.
 * Toute classe qui implémente cette interface doit fournir une implémentation
 * de la méthode suivreRoute, qui permet d'indiquer la route suivie.
 */
public interface SuivreRoute {

    /**
     * Définit le comportement de suivi d'une route maritime.
     * Chaque classe implémentant cette méthode doit spécifier comment suivre la route.
     */
    public void suivreRoute();
}
