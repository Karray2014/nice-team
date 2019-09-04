/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author Karray
 */
public class Partie2 {

    private Integer idPartie;
    private Map<String, Set<Joueur>> participants;

    public Partie2() {
    }

    public Partie2(Integer idPartie) {
        this.idPartie = idPartie;
        this.participants = new HashMap<>();
    }

    public long nbJoueursParEquipe(String nomEquipe) {
        return participants.get(nomEquipe)
                .stream().count();
    }

    public Map<String, Set<Joueur>> getParticipants() {
        return participants;
    }

    public void test() {
        //for((participants.entrySet()):participants){

        //}
    }

    public long joueursVivants() {
        return participants.values().stream()
                .map(f -> {
                    Set<Joueur> li = new HashSet<>();
                    li.addAll(f);
                    return li;
                })
                .count();
    }

    public List<Joueur> joueursVivants2() {
        ArrayList<Joueur> l = new ArrayList();
        participants.values().stream().forEach(s -> {

            for (Joueur j : s) {
                if (j.isVivant()) {
                    l.add(j);
                }
            }
        });
        return l;

    }
    
//    public void maxD(){
//        Comparator<Joueur> cmp = Comparator.
//                comparing(Joueur::getNbDiamonds);
//        Joueur m = this.participants.entrySet().stream()
//                    .max(cmp);
//    }

    public String joueurGagnant() {
        for(Map.Entry<String,Set<Joueur>> ll : participants.entrySet()){
            String nom="";
            int nb=0;
            for(Joueur d : ll.getValue()){
                if(d.isVivant()==true){
                    nb++;
                    nom=d.getNom();
                }
            }
            if(nb==1) System.out.println("Le joueur vivant: "+nom);
        }
return "";
    }
}

