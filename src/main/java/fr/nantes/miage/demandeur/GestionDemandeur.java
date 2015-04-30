package fr.nantes.miage.demandeur;

import fr.nantes.miage.commun.System;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe facade qui permet de manipuler les demandeurs
 */
public class GestionDemandeur implements ActionDemandeur, System {

    private List<Demandeur> demandeurs = null;
    private List<Titre> titresDemandeur = null;
    private List<Origine> originesDemandeur = null;

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

    }

    @Override
    public boolean ajouterDemandeur(Demandeur demandeur) {
        return demandeurs.add(demandeur);
    }

    @Override
    public boolean supprimerDemandeur(Demandeur demandeur) {
        return demandeurs.remove(demandeur);
    }


    public List<Titre> getTitresDemandeur() {
        return titresDemandeur;
    }

    public void setTitresDemandeur(LinkedList<Titre> titresDemandeur) {
        this.titresDemandeur = titresDemandeur;
    }

    public List<Demandeur> getDemandeurs() {
        return demandeurs;
    }

    public void setDemandeurs(LinkedList<Demandeur> demandeurs) {
        this.demandeurs = demandeurs;
    }

    public List<Origine> getOriginesDemandeur() {
        return originesDemandeur;
    }

    public void setOriginesDemandeur(LinkedList<Origine> originesDemandeur) {
        this.originesDemandeur = originesDemandeur;
    }

}

