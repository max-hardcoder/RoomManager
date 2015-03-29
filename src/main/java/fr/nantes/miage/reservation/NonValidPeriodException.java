package fr.nantes.miage.reservation;


/**
 * Created by E14D247Q on 10/04/15.
 */

public class NonValidPeriodException extends Exception {

    private static final long serialVersionUID = 1L;

    public NonValidPeriodException() {
        super("la date debut ne peut pas etre superieur a la date de fin");
        // TODO Auto-generated constructor stub
    }

}