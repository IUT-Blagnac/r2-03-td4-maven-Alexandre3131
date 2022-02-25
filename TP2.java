import java.util.logging.Level;
import java.util.logging.Logger;

public class TP2 {

    private static Logger Logger = java.util.logging.Logger.getLogger(TP2.class.getName());

    public static void main(String[] argv) throws Exception {
        Pile maPile = new Pile(2); // Création d'une variable maPile de type Pile contenant un tableau d'entier de taille 2

        try {
            if (maPile.estVide()) { Logger.log(Level.INFO, "La pile est vide"); } // Si la pile est vide, afficher "La pile est vide"
            maPile.empiler(10); // Empiler 10 dans la pile
            maPile.empiler(5);  // Empiler 5 dans la pile
            if (!maPile.estVide()) { Logger.log(Level.INFO, "La pile n'est pas vide"); } // Si la pile n'est pas vide, afficher "La pile n'est pas vide"
            maPile.depiler(); // Depiler une fois
            Logger.log(Level.INFO, "Le sommet de la pile est : "+maPile.Sommet()); // Afficher le sommet de la pile (dans le cas présent, ce sera la premère valeur empilée
            maPile.empiler(30); // Empiler 30 dans la pile
            if (maPile.estPlein()) { Logger.log(Level.INFO, "La pile est pleine"); } // Si la pile est pleine, afficher "La pile est pleine"
            // Tous les programmes (préconditions comprises) fonctionnent comme attendus
        }
        catch (Exception e) {
            Logger.log(Level.INFO, "NOK : " + e);
        }
    }   
}
