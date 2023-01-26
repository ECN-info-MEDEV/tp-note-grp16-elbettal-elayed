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
public class PlateauJeu {

    private String[][] plateau ;
    private ArrayList<Pion> ListPionCodeur = new ArrayList<>();
    private ArrayList<Pion> ListPionDecodeur = new ArrayList<>();
    
    
    public PlateauJeu() {
        plateau = new String[12][4];
    }
    
    public void setColor(int row, int col, String couleur) {
        plateau[row][col] = couleur ;
    }

    public String getColor(int row, int col) {
        return plateau[row][col];
    }
    
    
    public void Manche(){
         Codeur codeur =new Codeur();
         Decodeur decodeur=new Decodeur();
         codeur.choix();
         decodeur.choix();
         ListPionCodeur=codeur.getListPion();
         ListPionDecodeur=decodeur.getListPion();
     
    }
    public void comparaison(){
        if(ListPionCodeur.get(0)==ListPionDecodeur.get(0)){
            
        }
    }
    
}
