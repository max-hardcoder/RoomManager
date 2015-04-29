package fr.nantes.miage;

/**
 * Created by Maxime on 28/04/2015.
 */
public class Manifestation {

    private String nom;
    private Double prix;


    public Manifestation(String nom, Double prix) {
        this.nom = nom;
        this.prix = prix;
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
