package fr.nantes.miage;

/**
 * Created by Maxime on 28/04/2015.
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
