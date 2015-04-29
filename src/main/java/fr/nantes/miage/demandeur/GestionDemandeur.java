package fr.nantes.miage.demandeur;

import fr.nantes.miage.Origine;
import fr.nantes.miage.Titre;
import fr.nantes.miage.reservation.System;

import java.util.LinkedList;

/**
 * Created by Maxime on 26/04/2015.
 */
public class GestionDemandeur implements ActionDemandeur, System {

    private LinkedList<Demandeur> demandeurs = null;
    private LinkedList<Titre> titresDemandeur = null;
    private LinkedList<Origine> originesDemandeur = null;

    public GestionDemandeur(LinkedList<Demandeur> demandeurs) {
        this.demandeurs = (demandeurs == null ? new LinkedList<Demandeur>() : demandeurs);
        titresDemandeur = new LinkedList<>();
        originesDemandeur = new LinkedList<>();
    }

    @Override
    public void initialize() {


        originesDemandeur.add(new Origine("resident", 10.0));
        originesDemandeur.add(new Origine("non resident", 12.0));


        titresDemandeur.add(new Titre("Particulier", 14.0));
        titresDemandeur.add(new Titre("Association", 10.0));
        titresDemandeur.add(new Titre("Entreprise", 20.0));

        // HashMap<String, Double> aa = new HashMap<>();

        //  aa.get


    }

    @Override
    public boolean ajouterDemandeur(Demandeur demandeur) {
        return demandeurs.add(demandeur);
    }

    @Override
    public boolean supprimerDemandeur(Demandeur demandeur) {
        return demandeurs.remove(demandeur);
    }


    public LinkedList<Titre> getTitresDemandeur() {
        return titresDemandeur;
    }

    public void setTitresDemandeur(LinkedList<Titre> titresDemandeur) {
        this.titresDemandeur = titresDemandeur;
    }

    public LinkedList<Demandeur> getDemandeurs() {
        return demandeurs;
    }

    public void setDemandeurs(LinkedList<Demandeur> demandeurs) {
        this.demandeurs = demandeurs;
    }

    public LinkedList<Origine> getOriginesDemandeur() {
        return originesDemandeur;
    }

    public void setOriginesDemandeur(LinkedList<Origine> originesDemandeur) {
        this.originesDemandeur = originesDemandeur;
    }

}

