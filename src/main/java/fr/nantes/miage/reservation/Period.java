package fr.nantes.miage.reservation;


import java.util.Calendar;
import java.util.Date;


/**
 * Classe qui représente  une période comprise de deux dates
 */


public class Period {

    private Date date_debut;
    private Date date_fin;


    private Period(Date date_debut, Date date_fin) {

        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }

    public static Period buildPeriod(Date date_debut, Date date_fin) throws NonValidPeriodException {


        if (date_debut.getTime() >= date_fin.getTime()) {
            throw new NonValidPeriodException();

        } else {
            return new Period(date_debut, date_fin);
        }


    }

    public boolean isIn(Period p) {

        // test on debut valeur

        long debut = date_debut.getTime();
        long fin = date_fin.getTime();


        long ddebut = p.date_debut.getTime();
        long ffin = p.date_fin.getTime();


        // si c est bon
        if (ffin < debut) return false;
        if (ddebut > fin) return false;

        return true;


    }


    public double getDaysBetweenDates() {
        double result = Double.POSITIVE_INFINITY;
        if (date_debut != null && date_fin != null) {
            final long MILLISECONDS_PER_DAY = 1000 * 60 * 60 * 24;
            Calendar aCal = Calendar.getInstance();
            aCal.setTime(date_debut);
            long aFromOffset = aCal.get(Calendar.DST_OFFSET);
            aCal.setTime(date_fin);
            long aToOffset = aCal.get(Calendar.DST_OFFSET);
            long aDayDiffInMili = (date_fin.getTime() + aToOffset) - (date_debut.getTime() + aFromOffset);
            result = ((double) aDayDiffInMili / MILLISECONDS_PER_DAY);
        }
        return result;
    }


}