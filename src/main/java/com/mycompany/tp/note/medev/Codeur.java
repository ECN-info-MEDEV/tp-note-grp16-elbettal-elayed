/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
package com.mycompany.tp.note.medev;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author samar
 */
public class Codeur extends Joueur {
    
    private ArrayList<Pion> ListPion = new ArrayList<>();

    public Codeur() {
        super() ;
    }
    
    
    public void choix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Codeur : choisit 4 pions: J pour Jaune, R pour Rouge, B pour Bleu, V pour Vert");
        for (int i = 0; i < 4; i++) {
            System.out.println(i+1  + " ");
            String str = sc.nextLine();

            Pion P = new Pion(str);
            ListPion.add(P); 
            

        }

    }

    public ArrayList<Pion> getListPion() {
        return ListPion;
    }


    
}
