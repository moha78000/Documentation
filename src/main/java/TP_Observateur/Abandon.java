package TP_Observateur;

public class Abandon {
    String nom_voilier;
    String classe;
    String skipper;

    public Abandon(String nom_voilier, String classe, String skipper) {
        this.nom_voilier = nom_voilier;
        this.classe = classe;
        this.skipper = skipper;
    }

    public String toString() {
        return nom_voilier + " " + classe + " " + skipper;
    }

    public String getClasse() {
        return classe;
    }


}
