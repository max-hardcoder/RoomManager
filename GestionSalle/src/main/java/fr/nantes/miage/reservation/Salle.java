package fr.nantes.miage.reservation;

import java.util.Date;

public class Salle implements Reservable {
	
	public Salle(String nom) {
		this.nom = nom;
		dateDebut = new Date();
	}

	public String nom;
	
	
	public Date dateDebut;


	@Override
	public String getName() {
		return nom;
	}

}
