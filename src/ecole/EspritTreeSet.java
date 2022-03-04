/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecole;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class EspritTreeSet implements GestionEnseignant{
    
    Set<Enseignant> treeset;

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
