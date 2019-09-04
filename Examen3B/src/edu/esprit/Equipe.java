/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Karray
 */
public class Equipe {
    private String libelle;
    private Set<Joueur> team;

    public Equipe() {
        team = new HashSet<>();
    }

    public Equipe(String libelle) {
        this.libelle = libelle;
        team = new HashSet<>();
    }
    
    
    public void ajouterJoueur(Joueur j){
        if(team.size()<4){
            team.add(j);
        }
        else
            System.out.println("Equipe complete!");
    }
    
    public void retirerJoueur(Joueur j){
        team.remove(j);
    }
    
 public TreeSet<Joueur> trierListeJoueurs(){
        TreeSet<Joueur> sortedTeam = new TreeSet<>();
        sortedTeam.addAll(team);
        return sortedTeam;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Set<Joueur> getTeam() {
        return team;
    }

    public void setTeam(Set<Joueur> team) {
        this.team = team;
    }
 
    public String toString(){
        String ch="";
        for(Joueur f : team){
            ch+=" \n"+f;
        }
        
        return "Equipe: "+libelle+ch;
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
        final Equipe other = (Equipe) obj;
        if (!Objects.equals(this.libelle, other.libelle)) {
            return false;
        }
        return true;
    }
 
    
}
