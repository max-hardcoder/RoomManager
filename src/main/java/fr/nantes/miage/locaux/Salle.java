package fr.nantes.miage.locaux;


/**
 * Created by E14D247Q on 16/03/15.
 */
public class Salle {


    private int numeroSalle;
    private int superficie;

    public Salle(int numeroSalle, int superficie, boolean dispo) {
        this.numeroSalle = numeroSalle;
        this.superficie = superficie;
    }


    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getNumeroSalle() {
        return numeroSalle;
    }

    public void setNumeroSalle(int numeroSalle) {
        this.numeroSalle = numeroSalle;
    }



    public String toString() {
        return "Salle : " + numeroSalle + " | Superficie : " + superficie;


    }

}