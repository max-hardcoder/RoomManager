package fr.nantes.miage.locaux;


import fr.nantes.miage.commun.Materiel;
import fr.nantes.miage.commun.MaterielFixe;
import fr.nantes.miage.commun.Payement;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui représente une salle, qui peut etre facturée
 */
public class Salle implements Payement {

    private int numeroSalle;
    private int superficie;
    private List<MaterielFixe> materiels;
    private TypeSalle typeSalle;

    public Salle(int numeroSalle, int superficie, ArrayList<MaterielFixe> materiels, TypeSalle typeSalle) {
        this.numeroSalle = numeroSalle;
        this.superficie = superficie;
        this.materiels = (materiels == null ? new ArrayList<MaterielFixe>() : materiels);
        this.typeSalle = typeSalle;

        addDefaultMaterials();
    }


    public Salle(int numeroSalle, int superficie, TypeSalle typeSalle) {
        this.numeroSalle = numeroSalle;
        this.superficie = superficie;
        this.materiels = new ArrayList<MaterielFixe>();
        this.typeSalle = typeSalle;

        addDefaultMaterials();
    }

    private void addDefaultMaterials() {

        materiels.add(new MaterielFixe(1, 3, "tableau"));
        materiels.add(new MaterielFixe(2, 10, "ordinateur"));


    }

    @Override
    public double payment() {
        double prix = 0;

        for (Materiel materiel : materiels) {
            prix += materiel.payment();
        }

        prix += superficie / 3;

        prix += typeSalle.payment();

        return prix;
    }

    public boolean ajouterMateriel(MaterielFixe materiel) {
        return this.materiels.add(materiel);
    }




    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }


    public int getNumeroSalle() {
        return numeroSalle;
    }

    public void setNumeroSalle(int numeroSalle) {
        this.numeroSalle = numeroSalle;
    }

    public List<MaterielFixe> getMateriels() {
        return materiels;
    }

    public void setMateriels(List<MaterielFixe> materiels) {
        this.materiels = materiels;
    }

    public TypeSalle getTypeSalle() {
        return typeSalle;
    }

    public void setTypeSalle(TypeSalle typeSalle) {
        this.typeSalle = typeSalle;
    }




    public String toString() {
        return "Salle : " + numeroSalle + " | Superficie : " + superficie;


    }

}