package fr.nantes.miage.reservation;


import fr.nantes.miage.commun.MaterielMobile;
import fr.nantes.miage.demandeur.Demandeur;
import fr.nantes.miage.locaux.Salle;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe qui représente la facade qui permet de manipuler les réservations
 */
public class GestionReservation implements ActionReservation, fr.nantes.miage.commun.System {

    private List<Reservation> reservations = new LinkedList<>();


    @Override
    public boolean ajouterReservation(Reservation resa) {

        if (!estReserve(resa.getSalle(), resa.getPeriode())) {
            return reservations.add(resa);
        }
        return false;

    }

    @Override
    public void initialize() {

        return;
    }


    @Override
    public boolean ajouterReservation(Salle s1, Period periode, int montant, Manifestation manifestation, Demandeur demandeur) {
        return ajouterReservation(new Reservation(1, s1, periode, montant, manifestation, demandeur));

    }

    @Override
    public boolean estReserve(Salle s1, Period p) {

        for (Reservation r : reservations) {

            if (r.getPeriode().isIn(p) && r.getSalle().equals(s1)) return true;

        }
        return false;
    }


    @Override
    public boolean estReserve(Salle s1) {

        for (Reservation r : reservations) {

            if (r.getSalle().equals(s1)) return true;

        }
        return false;
    }


    @Override
    public boolean annulerReservation(Reservation resa) {

        return reservations.remove(resa);
    }

    @Override
    public LinkedList<Reservation> consulterReservation(Salle salle) {
        LinkedList<Reservation> listeReservation = new LinkedList<>();

        for (Reservation resa : reservations) {
            if (resa.getSalle().equals(salle)) {
                listeReservation.add(resa);
            }
        }

        return listeReservation;
    }

    @Override
    public LinkedList<Reservation> consulterReservation(Demandeur demandeur) {
        LinkedList<Reservation> listeReservation = new LinkedList<>();

        for (Reservation resa : reservations) {
            if (resa.getDemandeur().equals(demandeur)) {
                listeReservation.add(resa);
            }
        }

        return listeReservation;
    }

    @Override
    public LinkedList<Reservation> consulterReservation(Period periode) {
        LinkedList<Reservation> listeReservation = new LinkedList<>();

        for (Reservation resa : reservations) {
            if (resa.getPeriode().isIn(periode)) {
                listeReservation.add(resa);
            }
        }

        return listeReservation;
    }

    @Override
    public Double calculerPrix(Reservation resa) {

        return resa.payment();

    }

    @Override
    public boolean ajouterMaterielMobile(Reservation resa, MaterielMobile materiel) {

        return resa.ajouterMaterielMobile(materiel);


    }


    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(LinkedList<Reservation> reservations) {
        this.reservations = reservations;
    }

}
