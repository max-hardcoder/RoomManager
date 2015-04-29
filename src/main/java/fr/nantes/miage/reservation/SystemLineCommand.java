package fr.nantes.miage.reservation;


import java.util.LinkedList;

/**
 * Created by E14D247Q on 16/03/15.
 */
public class SystemLineCommand implements System {

    LinkedList<String> manifestations = new LinkedList<String>();
    LinkedList<String> origineDemandeurs = new LinkedList<String>();
    LinkedList<String> titreDemandeurs = new LinkedList<String>();
    LinkedList<String> typeSalle = new LinkedList<String>();
    LinkedList<String> typeMateriel = new LinkedList<String>();

    public static void main(String[] args) {

        SystemLineCommand sys = new SystemLineCommand();
        sys.initialize();
        sys.run();


    }

    public void run() {

        // Salle s1 = new Salle(100, 150);

      /*  Salle s2 = new Salle(101, 100);

        LinkedList<Salle> listeSalle = new LinkedList<Salle>();
        listeSalle.add(s1);
        listeSalle.add(s2);


        Batiment b1 = new Batiment(1, listeSalle, "68", "rue Préfet Bonnefoy", "44000", "NANTES");

        listeSalle.remove(s1);*/


        // Reservation r1 = new Reservation(1, s1, new Date(), 12, 14, 150, "test");
        //System.out.println(r1.toString());

    }


    @Override
    public void initialize() {

        manifestations.add("réunion");
        manifestations.add("banquet");
        manifestations.add("spectacle");

        origineDemandeurs.add("resident");
        origineDemandeurs.add("non resident");


        titreDemandeurs.add("Particulier");
        titreDemandeurs.add("Association");
        titreDemandeurs.add("Entreprise");


        typeSalle.add("Cuisine");
        typeSalle.add("Vaiselle uniquement");
        typeSalle.add("Video");
        typeSalle.add("Tableau");
        typeSalle.add("Salle amphitheatre");


        typeMateriel.add("Tableau");
        typeMateriel.add("Retro-projecteur");
        typeMateriel.add("Moyens videos");


        // pattern abstract factory
        // ajouter manifestation, type salle, type materiel, demandeur

    }
}
