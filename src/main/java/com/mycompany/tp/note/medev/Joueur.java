/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp.note.medev;

import java.util.ArrayList;

/**
 *
 * @author samar
 */
public abstract class Joueur {
    
    private int score;
    
    private ArrayList<Pion> ListPion = new ArrayList<>();

    public Joueur() {
        this.score = 0;
    }
    
     
    
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<Pion> getListPion() {
        return ListPion;
    }

    public void setListPion(ArrayList<Pion> ListPion) {
        this.ListPion = ListPion;
    }
    
    
}
