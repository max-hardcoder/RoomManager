package fr.nantes.miage;

/**
 * Created by Maxime on 28/04/2015.
 */
public abstract class Materiel implements Payement {

    protected int numeroMateriel;
    protected double prix;
    protected String descritpion;

    public Materiel(int numeroMateriel, double prix, String descritpion) {
        this.numeroMateriel = numeroMateriel;
        this.descritpion = descritpion;
        this.prix = prix;
    }

    public abstract double payment();


    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getNumeroMateriel() {
        return numeroMateriel;
    }

    public void setNumeroMateriel(int numeroMateriel) {
        this.numeroMateriel = numeroMateriel;
    }

    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }


}
