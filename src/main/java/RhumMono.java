/**
 * La classe RhumMono représente un type spécifique de monocoque.
 * Elle hérite de la classe Monocoque et permet de créer un bateau
 * participant à la catégorie Rhum Mono avec un nom et un skipper.
 */
public class RhumMono extends Monocoque {

    /**
     * Constructeur qui crée un bateau RhumMono avec un nom et un skipper.
     *
     * @param nom     Le nom du bateau.
     * @param skipper Le nom du skipper.
     */
    public RhumMono(String nom, String skipper) {
        super(nom, skipper);
    }
}
