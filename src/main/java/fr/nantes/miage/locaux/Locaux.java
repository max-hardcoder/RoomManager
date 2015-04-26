package fr.nantes.miage.locaux;


import locaux.Batiment;

import java.util.HashMap;

/**
 * Created by E14D247Q on 10/04/15.
 */
public interface Locaux {


    public boolean ajouterSalle(Batiment batiment, Salle salle);

    public boolean rechercherSalle(Salle salle);

    public boolean SupprimerSalle(Salle salle);

    public boolean ajouterBatiment(Batiment bat);

    public boolean rechercheBatiment(HashMap<Integer, String> recherche);

    public boolean modificationBatiment(Batiment bat);

    public boolean suppressionBatiment(Batiment bat);


}
