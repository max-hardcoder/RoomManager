package fr.nantes.miage.locaux;

import java.util.LinkedList;

/**
 * Classe qui représente un batiment
 */
public class Batiment {

    private LinkedList<Salle> salles;
    private int num;
    private String nom;
    private String adresse;
    private String codePostal;
    private String ville;


    public Batiment(int num, LinkedList<Salle> listeSalle, String nom, String adresse, String code, String ville) {
        this.salles = (listeSalle == null ? new LinkedList<Salle>() : listeSalle);
        this.num = num;
        this.nom = nom;
        this.adresse = adresse;
        this.codePostal = code;
        this.ville = ville;
    }

    public boolean ajouterSalle(Salle salle) {

        return salles.add(salle);

    }

    public boolean supprimerSalle(Salle salle) {

        return salles.remove(salle);
    }


    public LinkedList<Salle> getSalles() {
        return salles;
    }

    public void setSalles(LinkedList<Salle> salles) {
        this.salles = salles;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String toString() {
        return "Batiment : " + num + ", Salles : " + salles + " , Adresse : " + adresse + " " + codePostal + " " + ville;

    }


}