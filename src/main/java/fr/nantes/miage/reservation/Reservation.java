package fr.nantes.miage.reservation;


/**
 * Created by E14D247Q on 16/03/15.
 */
public class Reservation {

    public int num_resa;
    public int montant;

    public Period periode;

    public Salle salle;
    public String manifestation;


    public Reservation(int num_resa, Salle salle, Period periode, int montant, String manifestation) {
        this.num_resa = num_resa;
        this.salle = salle;
        this.montant = montant;
        this.periode = periode;
        this.manifestation = manifestation;

    }


    public int getNum_resa() {
        return num_resa;
    }

    public void setNum_resa(int num_resa) {
        this.num_resa = num_resa;
    }


    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }


    public String getManifestation() {
        return manifestation;
    }

    public void setManifestation(String manifestation) {
        this.manifestation = manifestation;
    }

    public String toString() {
        return "Ref résa : " + num_resa + ", " + salle + " , Manifestation : " + manifestation + ", periode : " + periode + " ";

    }


}
