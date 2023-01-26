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
public class Pion {
    private String Color;
    
    public Pion() {
        this.Color = "N";
    }
    
    public Pion(String couleur){
        Couleur Color1=new Couleur();
        for (int i=0;i<6;i++){
            if (couleur == null ? Color1.ListCouleur.get(i) == null : couleur.equals(Color1.ListCouleur.get(i)))
        this.Color=couleur;
    }
        }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
        
    
}
