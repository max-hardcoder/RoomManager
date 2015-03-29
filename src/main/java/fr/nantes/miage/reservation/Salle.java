package fr.nantes.miage.reservation;


/**
 * Created by E14D247Q on 16/03/15.
 */
public class Salle {


    private int no_salle;
    private int superficie;
    private boolean disponible;


    public Salle(int salle, int sup, boolean dispo) {
        this.no_salle = salle;
        this.superficie = sup;
        this.disponible = dispo;
    }


    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getNo_salle() {
        return no_salle;
    }

    public void setNo_salle(int no_salle) {
        this.no_salle = no_salle;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String toString() {
        if (isDisponible()) {
            return "Salle : " + no_salle + " | Superficie : " + superficie + " | Disponible ";
        } else {
            return "Salle : " + no_salle + " | Superficie : " + superficie + " | Pas Disponible";
        }

    }

}