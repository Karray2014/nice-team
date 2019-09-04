/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Karray
 */
public class Partie {

    private Integer idPartie;
    private Map<String, Set<Equipe>> participants;

    public Partie() {
        participants = new HashMap<>();
    }

    public Partie(Integer idPartie) {
        this.idPartie = idPartie;
        participants = new HashMap<>();
    }

    public void ajouterEquipe(String place, Equipe e) {
        if (participants.get(place) == null) {
            Set<Equipe> myTeam = new HashSet<>();
            myTeam.add(e);
            participants.put(place, myTeam);
        } else {
            participants.get(place).add(e);
        }
    }

    public long nbJoueursParEquipe(String r, Equipe p) {
        return participants.get(r).stream()
                //                    .filter(d->d.equals(p))
                //.map(f->f.getTeam())
                .peek(s -> System.out.println(s)).count();
//                    .findAny()
//                    .get();
    }

    public void eliminerJoueur(String place, Joueur j1, Joueur j2) {
        for (Equipe e : participants.get(place)) {
            for (Joueur j : e.getTeam()) {
                if (j.equals(j1)) {
                    j.setNbDiamonds(j.getNbDiamonds() + 1);
                }
                if (j.equals(j2)) {
                    j.setVivant(false);
                    j.setNbDiamonds(j.getNbDiamonds() - 1);
                    j.getE().getTeam().remove(j);
                }
            }
        }
    }

    public void maxDiamondJoueurs() {
        participants.values()
                .stream()
                .map(d -> {
                    Set<Joueur> mySet = new HashSet<Joueur>();
                    for (Equipe ep : d) {
                        for (Joueur j : ep.getTeam()) {
                            mySet.add(j);
                        }
                    }
                    return mySet;
                })
                .forEach(System.out::println);

    }

//    public long joueursVivants() {
//        return participants.values().stream()
//                .map(f -> {
//                    Set<Equipe> li = new HashSet<>();
//                    li.addAll(f);
//                    return li;
//                })
//                .count();
//    }
    public List<Joueur> joueursVivants() {
        ArrayList<Joueur> l = new ArrayList();
        participants.values().stream().forEach(ss -> {

            for (Equipe e : ss) {
                for (Joueur j : e.getTeam()) {
                    if (j.isVivant()) {
                        l.add(j);
                    }
                }
            }
        });
        return l;

    }

    public List<Joueur> ListsJoueursMorts() {
        ArrayList<Joueur> l2 = new ArrayList();
        participants.values().stream()
                .reduce((r, t) -> {
                    r.addAll(t);
                    return r;
                }).get().stream()
                .forEach(ss -> {
                    for (Joueur j : ss.getTeam()) {
                        if (j.getNom().startsWith("M")) {
                            if (j.isVivant() == false) {
                                l2.add(j);
                            }
                        }
                    }
                });
        return l2;

    }
}
