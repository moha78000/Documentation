/**
 * La classe RouteOrthodromie représente une route maritime empruntant l'orthodromie.
 * Elle implémente l'interface SuivreRoute et définit la méthode suivreRoute
 * pour afficher un message indiquant que cette route est suivie.
 */
public class RouteOrthodromie implements SuivreRoute {

    /**
     * Suit la route orthodromique en affichant un message.
     */
    public void suivreRoute() {
        System.out.println("Vous avez emprunté la route orthodromie");
    }
}
