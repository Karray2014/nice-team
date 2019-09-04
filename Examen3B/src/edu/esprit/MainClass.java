/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Karray
 */
public class MainClass {
    
    public static void main(String[] args) {
        Joueur j1 = new Joueur(10, "Ben salah", "Male", 2, true);
        Joueur j2 = new Joueur(11, "Sassi", "Male", 24, true);
        Joueur j3 = new Joueur(12, "Didi", "Female", 2, true);
        Joueur j4 = new Joueur(13, "Muradi", "Female", 42, true);
        Joueur j5 = new Joueur(14, "C25D", "Male", 8, true);
        ArrayList<String> mm = new ArrayList();
        mm.add("dd");
        mm.add("ss");
        mm.add("gg");
        if (mm.contains("gjg")) System.out.println("Hello");
        
        else    System.out.println("NOOO");
                
        Equipe e1 = new Equipe("Fighters");
        Equipe e2 = new Equipe("Gunners");
        
        e1.ajouterJoueur(j1);
        e1.ajouterJoueur(j2);
        e1.ajouterJoueur(j3);
        e2.ajouterJoueur(j4);
        e2.ajouterJoueur(j5);
        
        Partie p1 = new Partie(5);
        Partie2 p2 = new Partie2(7);
        System.out.println("==== ESPRIT ESPRIT ====");
        p2.getParticipants().entrySet().stream().forEach(System.out::println);
        System.out.println("==== ESPRIT ESPRIT ====");
        Set<Joueur> mySet = new HashSet<Joueur>();
        mySet.add(j1);
        mySet.add(j2);
        mySet.add(j3);
        p2.getParticipants().put("rim", mySet);
        
        p1.ajouterEquipe("Manar", e1);
        //p1.ajouterEquipe("Manar", e2);
        System.out.println("-------------");
        System.out.println(e1);
        System.out.println("========");
        System.out.println(p1);
        System.out.println("========");
        System.out.println(p1.nbJoueursParEquipe("Manar",e1));
        System.out.println(" XXXXXXXXXXXXXXXXXXXXXXX ");
        System.out.println(p2.nbJoueursParEquipe("rim"));
        System.out.println("+++++////+++///++++++///");
        System.out.println(p2.joueursVivants2());
        //p1.maxDiamondJoueurs();
        
    }
}
