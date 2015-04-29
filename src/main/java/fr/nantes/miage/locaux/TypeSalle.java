package fr.nantes.miage.locaux;

/**
 * Created by Maxime on 27/04/2015.
 */
public class TypeSalle {

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
