package fr.nantes.miage;

import fr.nantes.miage.locaux.Salle;
import fr.nantes.miage.reservation.*;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TestReservation {

    static GestionReservation resa;
    static Salle s1;
    static int heureDebut;
    static int heureFin;
    static Period periode;

    /**
     * Initialisation des variables pour les tests
     */
    @BeforeClass
    public static void init() {

        resa = new GestionReservation();
        s1 = new Salle(101, 100, false);

        try {
            periode = Period.buildPeriod(EasyDate.makeDate(1, 1, 2000, 14), EasyDate.makeDate(1, 1, 2000, 18));
        } catch (NonValidPeriodException e) {
            e.printStackTrace();
        }


    }

    /**
     * A la fin de chaque test, vide la liste de reservations
     */
    @After
    public void reinitialize() {
        resa.getReservations().clear();
    }

    /**
     * Test sur la création d'une période, les dates étant équivalentes, l'exception va être levée et donc p sera null
     */
    @Test
    public void testPeriode() {


        Period p = null;

        try {
            p = Period.buildPeriod(EasyDate.makeDate(1, 1, 2000, 14), EasyDate.makeDate(1, 1, 2000, 12));
        } catch (NonValidPeriodException e) {
            //  e.printStackTrace();
        }

        assertTrue(p == null);


    }

    /**
     * Test l'ajout d'une résérvation
     */
    @Test
    public void testReservation() {


        assertFalse(resa.estReserve(s1, periode));

        resa.ajouterReservation(s1, periode, 10, "");

        assertTrue(resa.estReserve(s1, periode));

    }


    /**
     * Test avec plusieurs résérvation
     */
    @Test
    public void testReservations() throws NonValidPeriodException {

        //reservation 1

        Period periode1 = null;
        Period periode2 = null;


        periode1 = Period.buildPeriod(EasyDate.makeDate(1, 1, 2000, 8), EasyDate.makeDate(1, 1, 2000, 12));


        Reservation reservation1 = new Reservation(1, s1, periode1, 100, "");

        // Res 2


        periode2 = Period.buildPeriod(EasyDate.makeDate(1, 1, 2000, 14), EasyDate.makeDate(1, 1, 2000, 18));


        Reservation reservation2 = new Reservation(1, s1, periode2, 100, "");

        assertTrue(resa.ajouterReservation(reservation1));
        assertTrue(resa.ajouterReservation(reservation2));


    }


}
