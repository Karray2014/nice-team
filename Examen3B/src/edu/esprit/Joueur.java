/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit;

/**
 *
 * @author Karray
 */
public class Joueur {
    
    private int id;
    private String nom;
    private String gender;
    private int nbDiamonds;
    private boolean vivant;
    private Equipe e;

    public Joueur() {
    }

    public Joueur(int id, String nom, String gender, int nbDiamonds, boolean vivant) {
        this.id = id;
        this.nom = nom;
        this.gender = gender;
        this.nbDiamonds = nbDiamonds;
        this.vivant = vivant;
    }


    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Equipe getE() {
        return e;
    }

    public void setE(Equipe e) {
        this.e = e;
    }

    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbDiamonds() {
        return nbDiamonds;
    }

    public void setNbDiamonds(int nbDiamonds) {
        this.nbDiamonds = nbDiamonds;
    }

    public boolean isVivant() {
        return vivant;
    }

    public void setVivant(boolean vivant) {
        this.vivant = vivant;
    }

    @Override
    public String toString() {
        return "Joueur{" + "id=" + id + ", nom=" + nom + ", gender=" + gender + ", nbDiamonds=" + nbDiamonds + ", vivant=" + vivant + '}';
    }

    
   
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Joueur other = (Joueur) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
