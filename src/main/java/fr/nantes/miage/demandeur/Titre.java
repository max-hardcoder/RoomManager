package fr.nantes.miage.demandeur;

import fr.nantes.miage.commun.Payement;

/**
 * Classe qui représente un titre
 */
public class Titre implements Payement {

    private String nom;
    private Double prix;


    public Titre(String nom, Double prix) {
        this.nom = nom;
        this.prix = prix;
    }


    @Override
    public double payment() {

        return prix;
    }



    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
