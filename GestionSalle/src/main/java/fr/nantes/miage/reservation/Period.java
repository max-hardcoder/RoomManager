package fr.nantes.miage.reservation;

import java.util.Date;

public class Period {
	
	public Date date_debut;
	public Date date_fin;
	
	
	public static Period buildPeriod (Date date_debut, Date date_fin) throws NonValidPeriodException {
		
		
			if ( date_debut.getTime() > date_fin.getTime()) {
				throw new NonValidPeriodException();

			} else {
				return new Period(date_debut, date_fin);
			}
			
		
	}
	private Period(Date date_debut, Date date_fin) {
		super();
		
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}
	
	
	
	public boolean isIn(Period p) {
		
		// test on debut valeur
		
		long debut = date_debut.getTime();
		long fin = date_fin.getTime();
		
		
		long ddebut = p.date_debut.getTime();
		long ffin = p.date_fin.getTime();
		
		
		// si c est bon 
		if ( ffin < debut) return false;
		if ( ddebut > fin) return false;
		
		return true;
		
		
			
		
	}
	
	

}
