package fr.nantes.miage.commun;

/**
 * Classe abstraite qui permet de representer un materiel, qui peut être facturé
 */
public abstract class Materiel implements Payement {

    protected int numeroMateriel;
    protected double prix;
    protected String description;

    public Materiel(int numeroMateriel, double prix, String descritpion) {
        this.numeroMateriel = numeroMateriel;
        this.description = descritpion;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
