package fr.nantes.miage.commun;

/**
 * Classe qui représente un materiel mobile
 */
public class MaterielMobile extends Materiel {


    public MaterielMobile(int numeroMateriel, double prix, String descritpion) {
        super(numeroMateriel, prix, descritpion);
    }

    @Override
    public double payment() {

        return prix;

    }


}
