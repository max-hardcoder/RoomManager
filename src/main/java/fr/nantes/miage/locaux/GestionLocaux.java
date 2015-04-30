package fr.nantes.miage.locaux;

import fr.nantes.miage.commun.MaterielFixe;
import fr.nantes.miage.commun.System;

import java.util.LinkedList;

/**
 * Classe qui représente la classe facade permettant de manipuler les locaux ( batiments, salles et type salle)
 */
public class GestionLocaux implements ActionLocal, System {

    private LinkedList<Batiment> batiments = new LinkedList<>();
    private LinkedList<Salle> salles = new LinkedList<>();
    private LinkedList<TypeSalle> typeSalle = new LinkedList<>();


    @Override
    public void initialize() {
        typeSalle.add(new TypeSalle("Cuisine", 15));
        typeSalle.add(new TypeSalle("Vaiselle uniquement", 15));
        typeSalle.add(new TypeSalle("Video", 15));
        typeSalle.add(new TypeSalle("Tableau", 15));
        typeSalle.add(new TypeSalle("Salle amphitheatre", 15));
    }


    @Override
    public boolean ajouterBatiment(Batiment bat) {

        return batiments.add(bat);

    }

    private Batiment findBatimentByNum(int num) {
        for (Batiment bat : batiments) {
            if (bat.getNum() == num) return bat;
        }
        return null;
    }


    @Override
    public LinkedList<Batiment> rechercherBatiment(String nom, String adresse, String ville, String codePostal) {

        LinkedList<Batiment> recherche = new LinkedList<>();

        for (Batiment bat : batiments) {
            if (
                    bat.getVille().isEmpty() || (bat.getVille().equals(ville)) &&
                            bat.getAdresse().isEmpty() || (bat.getAdresse().equals(adresse)) &&
                            bat.getNom().isEmpty() || (bat.getNom().equals(nom)) &&
                            bat.getCodePostal().isEmpty() || (bat.getCodePostal().equals(codePostal))) {

                recherche.add(bat);
            }

        }

        return recherche;
    }


    @Override
    public Batiment rechercherBatiment(int numero) {

        return findBatimentByNum(numero);

    }

    @Override
    public boolean modifierBatiment(Batiment bat, String ville, String adresse, String codePostal) {

        if (ville != null) {
            if (!ville.isEmpty()) {
                bat.setVille(ville);
            }
        }
        if (adresse != null) {
            if (!adresse.isEmpty()) {
                bat.setAdresse(adresse);
            }
        }
        if (codePostal != null) {
            if (!codePostal.isEmpty()) {
                bat.setCodePostal(codePostal);
            }
        }

        return true;

    }


    @Override
    public boolean supprimerBatiment(Batiment bat) {

        //Check si res déjà faites dans le bat à supp
        return batiments.remove(bat);
    }


    // -----------------------------------------------------------

    @Override
    public boolean ajouterSalle(Batiment batiment, Salle salle) {
        for (Batiment bat : batiments) {
            if (bat.equals(batiment)) {
                return bat.ajouterSalle(salle);
            }
        }
        return false;
    }


    private Salle findSalleByNum(int numero) {
        for (Salle salle : salles) {
            if (salle.getNumeroSalle() == numero) {
                return salle;
            }
        }
        return null;
    }



    @Override
    public Salle rechercherSalle(int numero) {

        return findSalleByNum(numero);
    }

    @Override
    public LinkedList<Salle> rechercherSalle(int superficieMin, int superficieMax) {

        LinkedList<Salle> recherche = new LinkedList<>();

        for (Salle salle : salles) {
            if (salle.getSuperficie() >= superficieMin && salle.getSuperficie() <= superficieMax) {

                recherche.add(salle);
            }

        }
        return recherche;
    }


    @Override
    public boolean SupprimerSalle(Salle salle) {


        //Check si res déjà faites dans la salle à supp
        //libere materiel

        //   if ( !estReserve(salle) ){
        return salles.remove(salle);
        //     }


    }


    @Override
    public boolean ajouterTypeSalle(TypeSalle typeSalle) {

        if (this.typeSalle.contains(typeSalle)) {
            return false;
        }

        return this.typeSalle.add(typeSalle);

    }

    @Override
    public boolean supprimerTypeSalle(TypeSalle typeSalle) {

        return this.typeSalle.remove(typeSalle);

    }

    @Override
    public LinkedList<TypeSalle> consulterTypeSalle() {

        return this.typeSalle;

    }

    @Override
    public boolean ajouterMaterielFixe(Salle salle, MaterielFixe materiel) {

        return salle.ajouterMateriel(materiel);
    }


    public LinkedList<TypeSalle> getTypeSalle() {
        return typeSalle;
    }

    public void setTypeSalle(LinkedList<TypeSalle> typeSalle) {
        this.typeSalle = typeSalle;
    }

    public LinkedList<Salle> getSalles() {
        return salles;
    }

    public void setSalles(LinkedList<Salle> salles) {
        this.salles = salles;
    }


    public LinkedList<Batiment> getBatiments() {
        return batiments;
    }

    public void setBatiments(LinkedList<Batiment> batiments) {
        this.batiments = batiments;
    }


}
