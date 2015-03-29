package fr.nantes.miage.reservation;
/**
 * Created by E14D247Q on 10/04/15.
 */

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by E14D247Q on 30/03/15.
 */
public class GestionLocaux implements Locaux {

    LinkedList<Batiment> batiments = new LinkedList<Batiment>();
    LinkedList<Salle> salles = new LinkedList<Salle>();

    @Override
    public boolean ajouterBatiment(Batiment bat) {

        return batiments.add(bat);

    }

    @Override
    public boolean rechercheBatiment(HashMap<Integer, String> recherche) {

        //LinkedList<Batiments> resultat = new LinkedList<Batiments>();

        return true;


    }

    @Override
    public boolean modificationBatiment(Batiment bat) {

        return true;

    }


    @Override
    public boolean suppressionBatiment(Batiment bat) {

        //Check si res déjà faites dans le bat à supp
        return batiments.remove(bat);
    }


    // -----------------------------------------------------------

    @Override

    public boolean ajouterSalle(Batiment batiment, Salle salle) {
        for (Batiment bat : batiments) {
            if (bat.equals(batiment)) {
                return bat.ajouterSalle(salle);
            }
        }
        return false;
    }


    @Override
    public boolean rechercherSalle(Salle salle) {
        return true;
    }

    @Override
    public boolean SupprimerSalle(Salle salle) {

        //Check si res déjà faites dans la salle à supp

        //   if ( !estReserve(salle) ){
        return salles.remove(salle);
        //   }


    }


}
