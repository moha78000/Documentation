package TP_Observateur;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ClientdesignPattern {
    public static void main(String[] args) {


        HashSet <Abandon> lesAbandons = new HashSet<>();
        lesAbandons.add(new Abandon("Nexans - Art et Fenêtres" , "IMOCA" , "Fabrice AMEDEO "));
        lesAbandons.add(new Abandon("LEYTON" , "IMOCA" , "Fabrice AMEDEO "));
        lesAbandons.add(new Abandon("Bella Donna - Race For Pure Ocean" , "Rhum_Mono" , "Fabio GENNARI"));

        DirectionCourse sujet1 = new DirectionCourse();
        Categorie categorieImoca = new Categorie(Nom_categorie.IMOCA);
        sujet1.enregistrerObservateur(categorieImoca);
        sujet1.simulationCourse(lesAbandons);
        System.out.println(categorieImoca);




    }
}
