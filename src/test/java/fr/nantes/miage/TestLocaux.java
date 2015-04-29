package fr.nantes.miage;

import fr.nantes.miage.locaux.Batiment;
import fr.nantes.miage.locaux.GestionLocaux;
import fr.nantes.miage.locaux.Salle;
import fr.nantes.miage.locaux.TypeSalle;
import fr.nantes.miage.reservation.Period;
import fr.nantes.miage.reservation.Utils;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;


public class TestLocaux {

    static GestionLocaux gestionnaireLocation;
    static Batiment batiment1;
    static Salle salle1;
    static TypeSalle typeSalon;
    static Logger LOG;
    static Period periode;

    /**
     * Initialisation des variables pour les tests
     */
    @BeforeClass
    public static void init() {

        gestionnaireLocation = new GestionLocaux();

        gestionnaireLocation.initialize();
        batiment1 = new Batiment(1, null, "", "", "", "");
        salle1 = new Salle(101, 100, gestionnaireLocation.getTypeSalle().getFirst());
        typeSalon = new TypeSalle("Salon", 15);
        LOG = Utils.buildTestLogger(TestLocaux.class.getSimpleName());

        LOG.info("Preparation tests Locaux");
    }

    /**
     * A la fin de chaque test, vide la liste de reservations
     */
    @After
    public void reinitialize() {

        gestionnaireLocation.getBatiments().clear();
        gestionnaireLocation.getSalles().clear();
    }


    /**
     * Test d'ajout d'une salle
     */
    @Test
    public void testAjoutSalleBatiment() {

        LOG.info("TEST AjoutSalleBatiment");

        batiment1.ajouterSalle(salle1);
        assertTrue(batiment1.getSalles().contains(salle1));


    }

    /**
     * Test lla suppression d'une salle
     */
    @Test
    public void testSupressionSalleBatiment() {

        LOG.info("TEST SupressionSalleBatiment");


        batiment1.ajouterSalle(salle1);
        batiment1.supprimerSalle(salle1);
        assertFalse(batiment1.getSalles().contains(salle1));

    }


    /**
     * Test ajout batiment au gestionnaire
     */
    @Test
    public void testAjoutBatimentGestionnaire() {

        LOG.info("TEST AjoutBatimentGestionnaire");

        gestionnaireLocation.ajouterBatiment(batiment1);
        assertTrue(gestionnaireLocation.getBatiments().contains(batiment1));

    }

    /**
     * Test retrait batiment au gestionnaire
     */
    @Test
    public void testSuppressionBatimentGestionnaire() {

        LOG.info("TEST SuppressionBatimentGestionnaire");


        gestionnaireLocation.ajouterBatiment(batiment1);
        gestionnaireLocation.supprimerBatiment(batiment1);
        assertFalse(gestionnaireLocation.getBatiments().contains(batiment1));

    }


    /**
     * Test ajout type salle
     */
    @Test
    public void testAjouterTypeSalle() {

        LOG.info("TEST AjouterTypeSalle");

        gestionnaireLocation.ajouterTypeSalle(typeSalon);
        assertTrue(gestionnaireLocation.getTypeSalle().contains(typeSalon));


    }

    /**
     * Test retrait type salle
     */
    @Test
    public void testSupprimerTypeSalle() {

        LOG.info("TEST SupprimerTypeSalle");


        gestionnaireLocation.ajouterTypeSalle(typeSalon);
        gestionnaireLocation.supprimerTypeSalle(typeSalon);
        assertFalse(gestionnaireLocation.getTypeSalle().contains(typeSalon));


    }


    /**
     * Test consulter type salle
     */
    @Test
    public void testConsulterTypeSalle() {

        LOG.info("TEST ConsulterTypeSalle");

        gestionnaireLocation.ajouterTypeSalle(typeSalon);
        assertFalse(gestionnaireLocation.consulterTypeSalle().isEmpty());

    }


    /**
     * Test recherche de batiment par numero
     */
    @Test
    public void testRechercheBatimentByNum() {

        LOG.info("TEST RechercheBatimentByNum");

        gestionnaireLocation.ajouterBatiment(batiment1);
        assertEquals(gestionnaireLocation.rechercherBatiment(batiment1.getNum()), batiment1);

    }


    /**
     * Test recherche de batiment par chaine de caractere
     */
    @Test
    public void testRechercheBatimentByChain() {

        LOG.info("TEST RechercheBatimentByChain");

        gestionnaireLocation.ajouterBatiment(batiment1);

        assertTrue(gestionnaireLocation.rechercherBatiment(batiment1.getNom(), batiment1.getAdresse(), batiment1.getVille(), batiment1.getCodePostal()).contains(batiment1));

    }


    /**
     * Test modification d'un batiment
     */
    @Test
    public void testModificationBatiment() {

        LOG.info("TEST ModificationBatiment");

        gestionnaireLocation.ajouterBatiment(batiment1);

        String ville = "choupa";
        String adresse = "choups";
        String codepostal = "50250";

        gestionnaireLocation.modifierBatiment(batiment1, ville, adresse, codepostal);

        assertTrue(batiment1.getVille().equals(ville) && batiment1.getAdresse().equals(adresse) && batiment1.getCodePostal().equals(codepostal));

    }


    /**
     * Test ajout materiel fixe
     */
    @Test
    public void testAjoutMaterielFixe() {

        LOG.info("TEST AjoutMaterielFixe");

        MaterielFixe materiel = new MaterielFixe(1, 20.0, "Bureau");

        gestionnaireLocation.ajouterMaterielFixe(salle1, materiel);


        assertTrue(salle1.getMateriels().contains(materiel));


    }


}
