
package ecole;

import java.util.Set;
import java.util.TreeSet;


public class EspritTreeSet implements GestionEnseignant{
    
    Set<Enseignant> treeset;
    
    //modification
    
    public static void main(String[] args) {
    	System.out.println("Ons");

	}

    public EspritTreeSet() {
        this.treeset = new TreeSet();
    }
    
    
    @Override
    public void ajouterEnseignant(Enseignant e) {
        treeset.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return treeset.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for(Enseignant e:treeset)
            if(e.getId()==id)
                return true;
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        treeset.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for(Enseignant e:treeset)
            System.out.println(e);
    }
    
    
}
