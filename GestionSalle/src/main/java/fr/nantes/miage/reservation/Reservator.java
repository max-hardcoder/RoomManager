package fr.nantes.miage.reservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Reservator implements Systemable {
	
	HashMap<Reservable , List<Period>> reservable;
	
	private Logger log;
	
	public Reservator() {
		init();
	}
	
	public boolean reserver(Reservable resa, Period period ) {
		
		if ( !reservable.containsKey(resa)) {
			// notFoundReservableException
			// reservable not added in the list
			log.severe(resa.getName() + ": Reservable not added");
			return false;
		}
		
		List<Period> res = reservable.get(resa);
		
		if ( res.isEmpty()) { // list empty -> no reservation
			log.info(resa.getName() + ": Booked");
			return res.add(period);	
			
		} else {
			
			for ( Period p : res) {
				if ( period.isIn(p)) {
					log.severe(resa.getName() + ": Already bokked for this period");
					return false;
				}
			}
			log.info(resa.getName() + ": Booked");
			return res.add(period);	
		}
			
	}
	/*
	public void annuler(Reservable resa) {
		
		if (reservation.remove(resa)) {
			log.info(resa+" annule");
		} else {
			log.severe(resa+" Erreur lors de l'annulation");

		}
	}*/

	
	
	@Override
	public void init() {
		reservable = new HashMap<Reservable , List<Period>>();

		// initialisation logger
		 log=Logger.getLogger(this.getClass().getName());
		  Handler conHdlr=new ConsoleHandler();
		  conHdlr.setFormatter(new Formatter(){
		    public String format(    LogRecord record){
		      return new Date() + " " + this.getClass().getName() + " " + record.getLevel() + "  :  "+ record.getMessage()+ "\n";
		    }
		  }
		);
		  log.setUseParentHandlers(false);
		  log.addHandler(conHdlr);
		  log.setLevel(Level.INFO);
	}

	@Override
	public void quit() {
		reservable.clear();
		
	}
	


	public ArrayList<Reservable> getSuggestions(Period p) {
		
		ArrayList<Reservable> suggestions = new ArrayList<Reservable>();/*
		suggestions.addAll(reservable);
		
		for ( Reservation resa : reservation) {
			if ( resa.date_debut)
		}
		
		
		
		suggestions.removeAll(reservation);*/
		return suggestions;
		
		
	}


	public void add(Reservable reservable) {
		this.reservable.put(reservable, new ArrayList<Period>());
		
	}
	
	

}
