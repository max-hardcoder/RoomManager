package fr.nantes.miage.demandeur;

/**
 * Classe qui représente un demandeur
 */
public class Demandeur {

    private String nom;
    private Titre titre;
    private Origine origine;

    public Demandeur(String nom, Titre titre, Origine origine) {
        this.nom = nom;
        this.titre = titre;
        this.origine = origine;
    }


    public Titre getTitre() {
        return titre;
    }

    public void setTitre(Titre titre) {
        this.titre = titre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Origine getOrigine() {
        return origine;
    }

    public void setOrigine(Origine origine) {
        this.origine = origine;
    }

}
