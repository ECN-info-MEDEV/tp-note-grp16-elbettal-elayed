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
    private Codeur codeur = new Codeur();
    private Decodeur decodeur = new Decodeur();
    
    /**
     * definiton du plateau de jeu 
     */
    public PlateauJeu() {
        plateau = new String[12][4];
    }

    /**
     *
     * @param row ligne
     * @param col colonne
     * @param couleur couleur a la position
     */
    public void setColor(int row, int col, String couleur) {
        plateau[row][col] = couleur;
    }

    /**
     *
     * @param row ligne
     * @param col colonne
     * @return retourne le string du couleur 
     */
    public String getColor(int row, int col) {
        return plateau[row][col];
    }

    /**
     * methode de tour de jeu
     */
    public void Manche() {
        codeur.choix();
        ListPionCodeur = codeur.getListPion();
        int i = 0;
        boolean trouve = false;
        while (i < 12 && !trouve) {
            decodeur.choix();
            ListPionDecodeur = decodeur.getListPion();
            AddCombinaison( ListPionDecodeur, i) ;
            if (trouver()) {
                trouve = true;
                System.out.println("Vous avez trouvez la combinaison aprés " + i+1 + "tentative(s)");
            } else {
                comparaison();

            }
        }

    }

    /**
     *
     * @return retourne le plateau de jeu 
     */
    public String[][] getPlateau() {
        return plateau;
    }

    /**
     *
     * @param plateau
     */
    public void setPlateau(String[][] plateau) {
        this.plateau = plateau;
    }

    /**
     *
     * @return 
     */
    public ArrayList<Pion> getListPionCodeur() {
        return ListPionCodeur;
    }

    /**
     *
     * @param ListPionCodeur
     */
    public void setListPionCodeur(ArrayList<Pion> ListPionCodeur) {
        this.ListPionCodeur = ListPionCodeur;
    }

    /**
     *
     * @return
     */
    public ArrayList<Pion> getListPionDecodeur() {
        return ListPionDecodeur;
    }

    /**
     *
     * @param ListPionDecodeur
     */
    public void setListPionDecodeur(ArrayList<Pion> ListPionDecodeur) {
        this.ListPionDecodeur = ListPionDecodeur;
    }

    /**
     *
     * @return
     */
    public ArrayList<Pion> getTrousDeMarque() {
        return TrousDeMarque;
    }

    /**
     *
     * @param TrousDeMarque
     */
    public void setTrousDeMarque(ArrayList<Pion> TrousDeMarque) {
        this.TrousDeMarque = TrousDeMarque;
    }

    /**
     *
     * @return
     */
    public Codeur getCodeur() {
        return codeur;
    }

    /**
     *
     * @param codeur
     */
    public void setCodeur(Codeur codeur) {
        this.codeur = codeur;
    }

    /**
     *
     * @return
     */
    public Decodeur getDecodeur() {
        return decodeur;
    }

    /**
     *
     * @param decodeur
     */
    public void setDecodeur(Decodeur decodeur) {
        this.decodeur = decodeur;
    }
 
    /**
     *
     */
    public void comparaison() {
        System.out.println("Trous de Marque :");
        for (int i = 0; i < 4; i++) {
            if (ListPionCodeur.get(i).getColor().equals(ListPionDecodeur.get(i).getColor())) {
                Pion P1 = new Pion("N");
                TrousDeMarque.add(P1);
                System.out.print("  " + P1.getColor());
            }
            for (int j = 0; j < 4; j++) {
                if (ListPionCodeur.get(i).getColor().equals(ListPionDecodeur.get(j).getColor()))  {
                    Pion P2 = new Pion("Bl");
                    TrousDeMarque.add(P2);
                    System.out.print("  " + P2.getColor());
                }
            }
        }
        System.out.println("");
    }

    /**
     *
     * @return
     */
    public boolean trouver() {
        int k = 0;
        for (int i = 0; i < 4; i++) {
            if (ListPionCodeur.get(i).getColor().equals(ListPionDecodeur.get(i).getColor())) {
                k++;
            }
        }
        return k == 4;
    }
    
    /**
     *
     * @param listeP
     * @param i
     */
    public  void AddCombinaison(ArrayList<Pion> listeP, int i){
        for (int k = 0; k < 4; k++) {
            plateau[i][k] = listeP.get(k).getColor() ;
        }
    }

}
