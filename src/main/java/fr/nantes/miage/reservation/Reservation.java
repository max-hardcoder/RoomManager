package fr.nantes.miage.reservation;


import fr.nantes.miage.commun.Materiel;
import fr.nantes.miage.commun.MaterielMobile;
import fr.nantes.miage.commun.Payement;
import fr.nantes.miage.demandeur.Demandeur;
import fr.nantes.miage.locaux.Salle;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant une reservation qui peut être facturée
 */
public class Reservation implements Payement {

    private int numeroReservation;
    private int montant;
    private Period periode;
    private Salle salle;
    private List<MaterielMobile> materielMobiles;
    private Manifestation manifestation;
    private Demandeur demandeur;


    public Reservation(int num_resa, Salle salle, Period periode, int montant, Manifestation manifestation, Demandeur demandeur) {
        this.numeroReservation = num_resa;
        this.salle = salle;
        this.montant = montant;
        this.periode = periode;
        this.manifestation = manifestation;
        this.demandeur = demandeur;
        this.materielMobiles = new ArrayList<MaterielMobile>();

    }

    public boolean ajouterMaterielMobile(MaterielMobile materiel) {

        return this.materielMobiles.add(materiel);

    }


    public double payment() {

        Double prix = 0.0;

        for (Materiel materiel : materielMobiles) {
            prix += materiel.payment();
        }

        return prix + salle.payment() * periode.getDaysBetweenDates() + manifestation.payment() + demandeur.getOrigine().payment() + demandeur.getTitre().payment();
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public Manifestation getManifestation() {
        return manifestation;
    }

    public void setManifestation(Manifestation manifestation) {
        this.manifestation = manifestation;
    }

    public Period getPeriode() {
        return periode;
    }

    public void setPeriode(Period periode) {
        this.periode = periode;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Demandeur getDemandeur() {
        return demandeur;
    }

    public void setDemandeur(Demandeur demandeur) {
        this.demandeur = demandeur;
    }

    public int getNumeroReservation() {
        return numeroReservation;
    }

    public void setNumeroReservation(int numeroReservation) {
        this.numeroReservation = numeroReservation;
    }

    public List<MaterielMobile> getMaterielMobiles() {
        return materielMobiles;
    }

    public void setMaterielMobiles(List<MaterielMobile> materielMobiles) {
        this.materielMobiles = materielMobiles;
    }




}
