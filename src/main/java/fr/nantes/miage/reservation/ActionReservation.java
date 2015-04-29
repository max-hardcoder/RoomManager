
package fr.nantes.miage.reservation;

import fr.nantes.miage.Manifestation;
import fr.nantes.miage.MaterielMobile;
import fr.nantes.miage.demandeur.Demandeur;
import fr.nantes.miage.locaux.Salle;

import java.util.LinkedList;

/**
 * Created by E14D247Q on 30/03/15.
 */
public interface ActionReservation {
    public boolean ajouterReservation(Salle s1, Period periode, int montant, Manifestation manifestation, Demandeur demandeur);

    public boolean ajouterReservation(Reservation r1);

    public boolean annulerReservation(Reservation r1);

    public boolean estReserve(Salle s1, Period periode);

    public LinkedList<Reservation> consulterReservation(Salle salle);

    public LinkedList<Reservation> consulterReservation(Demandeur demandeur);

    public LinkedList<Reservation> consulterReservation(Period periode);

    public Double calculerPrix(Reservation resa);

    public boolean ajouterMaterielMobile(Reservation resa, MaterielMobile materiel);
}
