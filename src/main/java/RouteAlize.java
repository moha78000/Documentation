/**
 * La classe RouteAlize représente une route maritime empruntant les alizés.
 * Elle implémente l'interface SuivreRoute et définit la méthode suivreRoute
 * pour afficher un message indiquant que cette route est suivie.
 */
public class RouteAlize implements SuivreRoute {

    /**
     * Suit la route des alizés en affichant un message.
     */
    public void suivreRoute() {
        System.out.println("Vous empruntez la route des alizés");
    }
}
