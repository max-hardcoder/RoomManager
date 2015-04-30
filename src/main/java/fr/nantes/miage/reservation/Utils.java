package fr.nantes.miage.reservation;

import java.util.logging.*;

/**
 * Classe d'outils
 */
public class Utils {


    public static Logger buildTestLogger(String classe) {
        // initialisation logger
        final Logger log = Logger.getLogger(classe);
        Handler conHdlr = new ConsoleHandler();
        conHdlr.setFormatter(new Formatter() {
                                 public String format(LogRecord record) {
                                     // return new Date() + " " + this.getClass().getName() + " " + record.getLevel() + "  :  "+ record.getMessage()+ "\n";
                                     return log.getName() + "  :  " + record.getMessage() + "\n";
                                 }
                             }
        );
        log.setUseParentHandlers(false);
        log.addHandler(conHdlr);
        log.setLevel(Level.INFO);

        return log;
    }

}
