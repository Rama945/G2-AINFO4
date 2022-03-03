/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecole;

import java.util.Comparator;

/**
 *
 * @author DELL
 */
public class Etudiant {
    int id;
    private String nom;
    private String prenom;

    public Etudiant() {
    }

    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etudiant other = (Etudiant) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public static Comparator<Etudiant> ComparatorId = new Comparator<Etudiant>() {
        @Override
        public int compare(Etudiant e1, Etudiant e2) {
            return (int) (e1.getId() - e2.getId());
        }
    };
    public static Comparator<Etudiant> ComparatorNom = new Comparator<Etudiant>() {
        @Override
        public int compare(Etudiant e1, Etudiant e2) {
            return e1.getNom().compareTo(e2.getNom());
        }
    };
    
    
}
