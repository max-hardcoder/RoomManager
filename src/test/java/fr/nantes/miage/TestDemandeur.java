package fr.nantes.miage;

import fr.nantes.miage.demandeur.Demandeur;
import fr.nantes.miage.demandeur.GestionDemandeur;
import fr.nantes.miage.reservation.Utils;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TestDemandeur {

    static GestionDemandeur gestionDemandeur;
    static Demandeur demandeur;
    static Logger LOG;


    /**
     * Initialisation des variables pour les tests
     */
    @BeforeClass
    public static void init() {

        LOG = Utils.buildTestLogger(TestDemandeur.class.getSimpleName());

        LOG.info("Preparation tests Demandeur");

        gestionDemandeur = new GestionDemandeur(null);
        gestionDemandeur.initialize();

        demandeur = new Demandeur("People", gestionDemandeur.getTitresDemandeur().get(0), gestionDemandeur.getOriginesDemandeur().get(0));


    }

    /**
     * A la fin de chaque test, vide la liste de reservations
     */
    @After
    public void reinitialize() {
        gestionDemandeur.getDemandeurs().clear();
    }


    /**
     * Test ajout d'un demandeur
     */
    @Test
    public void testAjoutDemandeur() {

        LOG.info("TEST ajouterDemandeur");

        gestionDemandeur.ajouterDemandeur(demandeur);
        assertTrue(gestionDemandeur.getDemandeurs().contains(demandeur));

    }

    /**
     * Test suppression d'un demandeur
     */
    @Test
    public void testSupprimerDemandeur() {

        LOG.info("TEST supprimerDemandeur");

        gestionDemandeur.ajouterDemandeur(demandeur);
        gestionDemandeur.supprimerDemandeur(demandeur);
        assertFalse(gestionDemandeur.getDemandeurs().contains(demandeur));

    }


}
