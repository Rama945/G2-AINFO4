/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecole;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author DELL
 */
public class EspritArrayList  implements University {

    ArrayList<Etudiant> list;

    public EspritArrayList() {
        this.list = new ArrayList<>();
    }
    
    @Override
    public void ajouterEtudiant(Etudiant e) {
        list.add(e);
       }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return list.contains(e);
       }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for(int i=0; i<list.size();i++){
            if(list.get(i).getNom().equals(nom))
                return true;
        }
        return false;
      }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        list.remove(e);
       }

    @Override
    public void displayEtudiants() {
        for(int i=0;i<list.size();i++){
            System.out.println( list.get(i).toString());
        }
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(list, Etudiant.ComparatorId);
    }

    @Override
    public void trierEtudiantsParNom() {
       Collections.sort(list, Etudiant.ComparatorNom);
    }
    
}
