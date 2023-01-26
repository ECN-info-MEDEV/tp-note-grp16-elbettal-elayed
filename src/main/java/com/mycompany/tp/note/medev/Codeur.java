/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
package com.mycompany.tp.note.medev;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * classe de tour de jeu du codeur, generation de la combinaison du codeur
 * @author samar
 */
public class Codeur extends Joueur {
    
    /**
     * constructeur
     */
    public Codeur() {
        super() ;
    }
     
    /**
     * methode de choi des pions du codeur
     */
    public void choix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Codeur : choisit 4 pions: J pour Jaune, R pour Rouge, B pour Bleu, V pour Vert");
        for (int i = 0; i < 4; i++) {
            System.out.println(i+1  + " ");
            String str = sc.nextLine();

            Pion P = new Pion(str);
            this.getListPion().add(P); 
            

        }

    }

    
}
