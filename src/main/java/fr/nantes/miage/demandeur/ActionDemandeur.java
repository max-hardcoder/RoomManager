package fr.nantes.miage.demandeur;

/**
 * Interface qui permet de manipuler les demandeurs
 */
public interface ActionDemandeur {


    boolean ajouterDemandeur(Demandeur demandeur);

    boolean supprimerDemandeur(Demandeur demandeur);
}
