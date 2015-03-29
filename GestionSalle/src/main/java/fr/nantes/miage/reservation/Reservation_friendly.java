package fr.nantes.miage.reservation;

import java.util.ArrayList;

public class Reservation_friendly {
	
	Reservator reservator = null;
	
	
	public Reservation_friendly() {
		reservator = new Reservator();
	}
		
	
	
	public boolean reserver(Reservable resa, Period p) {
		return reservator.reserver(resa, p);
	}
	
	public ArrayList<Reservable> getSuggestion(Period p) {
		return reservator.getSuggestions(p);
	}



	public void annuler(Reservable resa) {
		//reservator.annuler(resa);
		
	}



	public void addReservable(Reservable reservable) {
		reservator.add(reservable);
		
	}

}
