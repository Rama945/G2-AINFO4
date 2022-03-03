/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecole;

import java.util.Collections;
import java.util.Vector;

/**
 *
 * @author DELL
 */
public class EspritVector implements University{
    
    Vector<Etudiant> vector;
    public EspritVector() {
        this.vector = new Vector<>();
    }
    
    
    @Override
    public void ajouterEtudiant(Etudiant e) {
       vector.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return vector.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for(int i=0; i<vector.size();i++){
            if(vector.get(i).getNom().equals(nom))
                return true;
        }
        return false;
        
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
       vector.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for(int i=0;i<vector.size();i++){
            System.out.println( vector.get(i).toString());
        }
    }

    @Override
    public void trierEtudiantsParId() {
       Collections.sort(vector, Etudiant.ComparatorId);
    }   

    @Override
    public void trierEtudiantsParNom() {
       Collections.sort(vector, Etudiant.ComparatorNom);
    }
    
}
