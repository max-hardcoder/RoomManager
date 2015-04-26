
package fr.nantes.miage.reservation;

import fr.nantes.miage.locaux.Salle;

/**
 * Created by E14D247Q on 30/03/15.
 */
public interface Res {
    public boolean ajouterReservation(Salle s1, Period periode, int montant, String manifestation);

    public boolean ajouterReservation(Reservation r1);

    public boolean annulerReservation(Reservation r1);

    public boolean estReserve(Salle s1, Period periode);
}
