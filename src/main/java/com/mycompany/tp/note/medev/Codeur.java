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
public class Codeur {
    
    private ArrayList<Pion> ListPion = new ArrayList<>();
    private int score ;

    public Codeur() {
        score = 0 ;
    }
    
    
    public void choix() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("choisit 4 pions: J pour Jaune, R pour Rouge, B pour Bleu, V pour Vert");
            String str = sc.nextLine();

            Pion P = new Pion(str);
            ListPion.add(P); 
            

        }

    }

    public ArrayList<Pion> getListPion() {
        return ListPion;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
}
