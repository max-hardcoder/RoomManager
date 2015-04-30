package fr.nantes.miage.locaux;

import fr.nantes.miage.commun.Payement;

/**
 * Classe qui représente un type de salle
 */
public class TypeSalle implements Payement {

    private String type;
    private int prix;


    public TypeSalle(String type, int prix) {
        this.type = type;
        this.prix = prix;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TypeSalle typeSalle = (TypeSalle) obj;

        if (typeSalle.getPrix() == prix && typeSalle.getType().equals(type)) {
            return true;

        }

        return false;
    }

    @Override
    public double payment() {
        return prix;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }


}
