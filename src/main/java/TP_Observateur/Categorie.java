package TP_Observateur;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Categorie implements Observateur{
    Nom_categorie nom_categorie;
    List<Abandon> abandons;

    public Categorie(Nom_categorie nom_categorie) {
        this.nom_categorie = nom_categorie;
        abandons = new ArrayList<Abandon>();
    }




    @Override
    public void actualise(Observable observable) {
        DirectionCourse direction = (DirectionCourse) observable ;
        Abandon abandon = direction.getDernierAbandon();
        System.out.println("actualise" + abandon.getClasse().equals(nom_categorie.toString()));
        if (abandon.getClasse().equals(this.nom_categorie.toString())) {
            abandons.add(abandon);
        }

    }
    public String toString(){
        return nom_categorie + " " + abandons.size();
    }
}
