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

    private String[][] plateau;
    private ArrayList<Pion> ListPionCodeur = new ArrayList<>();
    private ArrayList<Pion> ListPionDecodeur = new ArrayList<>();
    private ArrayList<Pion> TrousDeMarque = new ArrayList<>();

    public PlateauJeu() {
        plateau = new String[12][4];
    }

    public void setColor(int row, int col, String couleur) {
        plateau[row][col] = couleur;
    }

    public String getColor(int row, int col) {
        return plateau[row][col];
    }

    public void Manche() {
        Codeur codeur = new Codeur();
        Decodeur decodeur = new Decodeur();
        codeur.choix();
        ListPionCodeur = codeur.getListPion();
        int i = 0;
        boolean trouve = false;
        while (i < 12 && !trouve) {
            decodeur.choix();
            ListPionDecodeur = decodeur.getListPion();
            if (trouver()) {
                trouve = true;
                System.out.println("Vous avez trouvez la combinaison aprés " + i + "tentative(s)");
            } else {
                comparaison();

            }

        }

    }

    public void comparaison() {
        System.out.print("Trous de Marque :");
        for (int i = 0; i < 4; i++) {
            if (ListPionCodeur.get(i) == ListPionDecodeur.get(i)) {
                Pion P1 = new Pion("N");
                TrousDeMarque.add(P1);
                System.out.print("  " + P1.getColor());
            }
            for (int j = 0; j < 4; j++) {
                if (ListPionCodeur.get(i) == ListPionDecodeur.get(j)) {
                    Pion P2 = new Pion("Bl");
                    TrousDeMarque.add(P2);
                    System.out.print("  " + P2.getColor());
                }
            }
        }
    }

    public boolean trouver() {
        int k = 0;
        for (int i = 0; i < 4; i++) {
            if (ListPionCodeur.get(i) == ListPionDecodeur.get(i)) {
                k++;
            }
        }
        return k == 4;
    }

}
