package fr.nantes.miage.reservation;

import java.util.Date;

public class Reservation{
	
	public Reservable reservable;
	public Date date_debut;
	public Date date_fin;
	
	public Reservation(Reservable reservable, Date date_debut, Date date_fin) {
		super();
		this.reservable = reservable;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}
	
	public Date get_duree () {
		
		return new Date(date_fin.getTime() - date_debut.getTime());
	}
	
	

}
