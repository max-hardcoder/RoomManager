package fr.nantes.miage.reservation;


import java.util.LinkedList;

/**
 * Created by E14D247Q on 30/03/15.
 */
public class GestionReservation implements Res {

    private LinkedList<Reservation> reservations = new LinkedList<Reservation>();

    public LinkedList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(LinkedList<Reservation> reservations) {
        this.reservations = reservations;
    }

    @Override
    public boolean ajouterReservation(Reservation r1) {


        if (!estReserve(r1.salle, r1.periode)) {
            return reservations.add(r1);
        }
        return false;

    }

    @Override
    public boolean ajouterReservation(Salle s1, Period periode, int montant, String manifestation) {
        return ajouterReservation(new Reservation(1, s1, periode, montant, manifestation));

    }

    @Override
    public boolean estReserve(Salle s1, Period p) {

        for (Reservation r : reservations) {

            if (r.periode.isIn(p) && r.salle.equals(s1)) return true;

        }
        return false;
    }

    @Override
    public boolean annulerReservation(Reservation r1) {
        return true;
    }


}
