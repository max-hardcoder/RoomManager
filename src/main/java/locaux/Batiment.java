package locaux;

import fr.nantes.miage.locaux.Salle;

import java.util.LinkedList;

public class Batiment {


    public final static int NOM = 0;


    private LinkedList<Salle> listeSalle;
    private int num;
    private String nom;
    private String adresse;
    private String codePostal;
    private String ville;


    public Batiment(int num, LinkedList<Salle> listeSalle, String nom, String adresse, String code, String ville) {
        this.listeSalle = listeSalle;
        this.num = num;
        this.nom = nom;
        this.adresse = adresse;
        this.codePostal = code;
        this.ville = ville;
    }

    public boolean ajouterSalle(Salle salle) {

        return listeSalle.add(salle);

    }


    public LinkedList<Salle> getListeSalle() {
        return listeSalle;
    }

    public void setListeSalle(LinkedList<Salle> listeSalle) {
        this.listeSalle = listeSalle;
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
        return "Batiment : " + num + ", Salles : " + listeSalle + " , Adresse : " + adresse + " " + codePostal + " " + ville;

    }


}
