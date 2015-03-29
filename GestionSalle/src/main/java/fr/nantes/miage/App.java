package fr.nantes.miage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import fr.nantes.miage.reservation.*;

public class App {
	
	public static void main(String[] args) {
		
		Reservation_friendly resa = new Reservation_friendly();
		

		System.out.println("tesssss");
		
		Salle cuisine = new Salle("Cuisine");
				
		resa.addReservable(cuisine);
		
		Period p = null;
		
		try {
			p = Period.buildPeriod(EasyDate.makeDate(1, 1, 2000), EasyDate.makeDate(1, 1, 2000));
		} catch (NonValidPeriodException e) {
			e.printStackTrace();
		}
		
		if ( p == null) return;
		
		resa.reserver(cuisine ,p);
		resa.reserver(cuisine ,p);
		
				
	}

}
