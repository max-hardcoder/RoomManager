package fr.nantes.miage;

import fr.nantes.miage.demandeur.Demandeur;
import fr.nantes.miage.locaux.Salle;
import fr.nantes.miage.locaux.TypeSalle;
import fr.nantes.miage.reservation.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;


public class TestReservation {

    static GestionReservation gestionReservation;
    static Salle s1;
    static Period periode;
    static Demandeur demandeur;
    static Logger LOG;


    /**
     * Initialisation des variables pour les tests
     */
    @BeforeClass
    public static void init() {

        LOG = Utils.buildTestLogger(TestReservation.class.getSimpleName());

        LOG.info("Preparation tests Reservation");


        gestionReservation = new GestionReservation();
        demandeur = new Demandeur("People", new Titre("titre", 20.0), new Origine("Asso", 14.0));
        s1 = new Salle(101, 100, new TypeSalle("cuisine", 15));

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
        gestionReservation.getReservations().clear();
    }

    /**
     * Test sur la création d'une période, les dates étant équivalentes, l'exception va être levée et donc p sera null
     */
    @Test(expected = NonValidPeriodException.class)
    public void testPeriode() throws NonValidPeriodException {

        LOG.info("TEST periode");

        Period p = null;

        p = Period.buildPeriod(EasyDate.makeDate(1, 1, 2000, 14), EasyDate.makeDate(1, 1, 2000, 12));

        Assert.fail("l'exception NonvalidPeriodException aurait du etre levee");


    }

    /**
     * Test l'ajout d'une résérvation
     */
    @Test
    public void testReservation() {

        LOG.info("TEST Reservation ");

        gestionReservation.ajouterReservation(s1, periode, 10, new Manifestation("", 0.0), demandeur);

        assertTrue(gestionReservation.estReserve(s1, periode));

    }

    /**
     * Test avec plusieurs résérvations
     */
    @Test
    public void testReservations() throws NonValidPeriodException {

        LOG.info("TEST Reservations ");

        //reservation 1

        Period periode1 = null;
        Period periode2 = null;

        periode1 = Period.buildPeriod(EasyDate.makeDate(1, 1, 2000, 8), EasyDate.makeDate(1, 1, 2000, 12));

        Reservation reservation1 = new Reservation(1, s1, periode1, 100, new Manifestation("", 0.0), demandeur);

        // Res 2

        periode2 = Period.buildPeriod(EasyDate.makeDate(1, 1, 2000, 14), EasyDate.makeDate(1, 1, 2000, 18));

        Reservation reservation2 = new Reservation(1, s1, periode2, 100, new Manifestation("", 0.0), demandeur);

        assertTrue(gestionReservation.ajouterReservation(reservation1));
        assertTrue(gestionReservation.ajouterReservation(reservation2));

    }


    /**
     * Test annulation reservation
     */
    @Test
    public void testAnnulationReservation() {

        LOG.info("TEST AnnulationReservation ");

        Reservation resa = new Reservation(10, s1, periode, 10, new Manifestation("", 0.0), demandeur);

        gestionReservation.ajouterReservation(resa);
        gestionReservation.annulerReservation(resa);

        assertTrue(!gestionReservation.estReserve(s1, periode));

    }


    /**
     * Test consultation reservations
     */
    @Test
    public void testConsultationReservationByDemandeur() {

        LOG.info("TEST ConsultationReservationByDemandeur ");

        Reservation resa = new Reservation(10, s1, periode, 10, new Manifestation("", 0.0), demandeur);

        gestionReservation.ajouterReservation(resa);

        assertTrue(gestionReservation.consulterReservation(demandeur).contains(resa));

    }


    /**
     * Test consultation reservations
     */
    @Test
    public void testConsultationReservationBySalle() {

        LOG.info("TEST ConsultationReservationBySalle ");

        Reservation resa = new Reservation(10, s1, periode, 10, new Manifestation("", 0.0), demandeur);

        gestionReservation.ajouterReservation(resa);

        assertTrue(gestionReservation.consulterReservation(s1).contains(resa));

    }


    /**
     * Test consultation reservations
     */
    @Test
    public void testConsultationReservationByPeriod() {

        LOG.info("TEST ConsultationReservationByPeriod ");

        Reservation resa = new Reservation(10, s1, periode, 10, new Manifestation("", 0.0), demandeur);

        gestionReservation.ajouterReservation(resa);

        assertTrue(gestionReservation.consulterReservation(periode).contains(resa));

    }


    /**
     * Test prix reservation
     */
    @Test
    public void testPrixReservation() {

        LOG.info("TEST PrixReservation ");

        Reservation resa = new Reservation(10, s1, periode, 10, new Manifestation("", 2.0), demandeur);

        assertTrue(gestionReservation.calculerPrix(resa) > 0);


    }


    /**
     * Test ajout materiel mobile
     */
    @Test
    public void testAjoutMaterielMobile() {

        LOG.info("TEST AjoutMAterielMobile ");

        MaterielMobile materiel = new MaterielMobile(1, 20.0, "camera");

        Reservation resa = new Reservation(10, s1, periode, 10, new Manifestation("", 2.0), demandeur);

        resa.ajouterMaterielMobile(materiel);

        assertTrue(resa.getMaterielMobiles().contains(materiel));


    }







}
