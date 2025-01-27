import java.util.List;

/**
 * La classe InscriptionMonocoque étend InscriptionVoilier.
 * Cette classe représente une inscription spécifique pour les monocoques.
 */
public class InscriptionMonocoque extends InscriptionVoilier {

    /**
     * Constructeur de la classe InscriptionMonocoque.
     */
    public InscriptionMonocoque() {
        super();
    }

    /**
     * Méthode factory pour créer un voilier en fonction de son type.
     * @param nom Le nom du voilier.
     * @param skipper Le skipper du voilier.
     * @param compare Le type de voilier (par exemple, "Class40", "Imoca", "RhumMono").
     * @return Un objet Voilier correspondant au type spécifié, ou null si le type n'est pas reconnu.
     */
    public Voilier factoryMethod(String nom, String skipper, String compare) {
        if (compare.equals("Class40")) {
            return new Class40(nom, skipper);
        }

        if (compare.equals("Imoca")) {
            return new Imoca(nom, skipper);
        }

        if (compare.equals("RhumMono")) {
            return new RhumMono(nom, skipper);
        }

        return null;
    }
}
