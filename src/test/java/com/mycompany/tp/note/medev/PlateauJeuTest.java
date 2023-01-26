/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tp.note.medev;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author samar
 */
public class PlateauJeuTest {
    
    public PlateauJeuTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    
    /**
     * Test of Manche method, of class PlateauJeu.
     */
    @Test
    public void testManche() {
        System.out.println("Manche");
        PlateauJeu instance = new PlateauJeu();
        instance.Manche();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comparaison method, of class PlateauJeu.
     */
    @Test
    public void testComparaison() {
        System.out.println("comparaison");
        PlateauJeu instance = new PlateauJeu();
        instance.comparaison();
        
    }

    /**
     * Test of trouver method, of class PlateauJeu.
     */
    @Test
    public void testTrouver() {
        System.out.println("trouver");
        PlateauJeu instance = new PlateauJeu();
        boolean expResult = false;
        boolean result = instance.trouver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddCombinaison method, of class PlateauJeu.
     */
    @Test
    public void testAddCombinaison() {
        System.out.println("AddCombinaison");
        ArrayList<Pion> listeP = null;
        int i = 0;
        PlateauJeu instance = new PlateauJeu();
        instance.AddCombinaison(listeP, i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
