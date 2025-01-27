import java.util.LinkedList;
import java.util.List;

/**
 * La classe abstraite InscriptionVoilier représente une inscription générique pour les voiliers.
 * Elle permet d'enregistrer et de créer des voiliers.
 */
public abstract class InscriptionVoilier {

    /**
     * Liste statique des voiliers enregistrés.
     */
    static List<Voilier> voiliers;

    /**
     * Constructeur de la classe InscriptionVoilier.
     * Initialise la liste des voiliers.
     */
    public InscriptionVoilier() {
        voiliers = new LinkedList<>();
    }

    /**
     * Méthode pour enregistrer un voilier dans la liste.
     * @param voilier Le voilier à enregistrer.
     */
    public void enregistrerVoilier(Voilier voilier) {
        voiliers.add(voilier);
    }

    /**
     * Méthode factory abstraite pour créer un voilier en fonction de son nom, skipper et catégorie.
     * @param nom Le nom du voilier.
     * @param skipper Le skipper du voilier.
     * @param categorie La catégorie du voilier.
     * @return Un objet Voilier correspondant aux paramètres spécifiés.
     */
    public abstract Voilier factoryMethod(String nom, String skipper, String categorie);
}
