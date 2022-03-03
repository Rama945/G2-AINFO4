/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecole;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class EspritHashSet  implements GestionEnseignant{

    Set<Enseignant> hashset;

    public EspritHashSet() {
        this.hashset = new HashSet();
    }
    
    @Override
    public void ajouterEnseignant(Enseignant e) {
        hashset.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return hashset.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for(Enseignant e:hashset)
            if(e.getId()==id)
                return true;
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        hashset.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for(Enseignant e:hashset)
            System.out.println(e);
    }
    
}
