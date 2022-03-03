
package ecole;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELLlist.
 */
public class Ecole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Etudiant e= new Etudiant(1,"Ahmed","Oueslati");
        Etudiant e1= new Etudiant(0,"Ahmed","Oueslati");
        Etudiant e2= new Etudiant(3,"Ahmed","Oueslati");
        EspritVector ecole=new EspritVector();
        ecole.ajouterEtudiant(e);
        ecole.ajouterEtudiant(e1);
        ecole.ajouterEtudiant(e2);
        ecole.trierEtudiantsParId();
        ecole.displayEtudiants();
    }
    
}
