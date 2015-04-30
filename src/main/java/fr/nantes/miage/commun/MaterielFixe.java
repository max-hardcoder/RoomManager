package fr.nantes.miage.commun;

/**
 * Classe qui représente un materiel fixe
 */
public class MaterielFixe extends Materiel {


    public MaterielFixe(int numeroMateriel, double prix, String descritpion) {
        super(numeroMateriel, prix, descritpion);
    }

    @Override
    public double payment() {

        return prix;

    }


}
