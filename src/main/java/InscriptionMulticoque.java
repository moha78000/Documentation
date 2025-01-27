/**
 * La classe InscriptionMulticoque étend InscriptionVoilier.
 * Cette classe représente une inscription spécifique pour les multicoques.
 */
public class InscriptionMulticoque extends InscriptionVoilier {

    /**
     * Constructeur de la classe InscriptionMulticoque.
     */
    public InscriptionMulticoque() {
        super();
    }

    /**
     * Méthode factory pour créer un voilier en fonction de son type.
     * @param nom Le nom du voilier.
     * @param skipper Le skipper du voilier.
     * @param compare Le type de voilier (par exemple, "Multi50", "Ultim", "RhumMulti").
     * @return Un objet Voilier correspondant au type spécifié, ou null si le type n'est pas reconnu.
     */
    public Voilier factoryMethod(String nom, String skipper, String compare) {
        if (compare.equals("Multi50")) {
            return new Multi50(nom, skipper);
        }

        if (compare.equals("Ultim")) {
            return new Ultim(nom, skipper);
        }

        if (compare.equals("RhumMulti")) {
            return new RhumMulti(nom, skipper);
        }

        return null;
    }
}
