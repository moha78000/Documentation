package TP_Observateur;

import java.util.*;

public class DirectionCourse implements Observable{
    private List<Observateur> observateurs;
    private List <Abandon> abandons;

    public DirectionCourse () {
        this.observateurs = new LinkedList<>();
        this.abandons = new LinkedList<>();
    }




    @Override
    public void enregistrerObservateur(Observateur o) {
        observateurs.add(o);
    }

    @Override
    public void desenregistrerObservateur(Observateur o) {
        observateurs.remove(o);

    }

    @Override
    public void informeObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.actualise(this);
        }

    }

    /* observateur va utilisé la dernier abandon

     */
    public Abandon getDernierAbandon() {
        return abandons.getLast();
    }

    public void simulationCourse(HashSet <Abandon> simulation_abandons) {
        for (Iterator <Abandon> iterator = simulation_abandons.iterator(); iterator.hasNext();) {
            this.abandons.add(iterator.next());
            informeObservateurs();
            try {
                Thread.sleep(2*1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
