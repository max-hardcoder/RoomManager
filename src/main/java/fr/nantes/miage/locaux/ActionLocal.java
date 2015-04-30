package fr.nantes.miage.locaux;


import fr.nantes.miage.commun.MaterielFixe;

import java.util.LinkedList;
import java.util.List;

/**
 * Interface qui permet de représenter les actions liées aux locaux
 * */
public interface ActionLocal {


    public boolean ajouterSalle(Batiment batiment, Salle salle);

    public Salle rechercherSalle(int numero);

    public LinkedList<Salle> rechercherSalle(int superficieMin, int superficieMax);

    public boolean SupprimerSalle(Salle salle);

    public boolean ajouterBatiment(Batiment bat);

    public LinkedList<Batiment> rechercherBatiment(String nom, String adresse, String ville, String codePostal);

    public Batiment rechercherBatiment(int numero);

    public boolean modifierBatiment(Batiment bat, String ville, String adresse, String codePostal);

    public boolean supprimerBatiment(Batiment bat);

    public boolean ajouterTypeSalle(TypeSalle typeSalle);

    public boolean supprimerTypeSalle(TypeSalle typeSalle);

    public List<TypeSalle> consulterTypeSalle();

    public boolean ajouterMaterielFixe(Salle salle, MaterielFixe materiel);


}
