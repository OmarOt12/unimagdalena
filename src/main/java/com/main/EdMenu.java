/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main;

import com.ed.BasicPila;
import java.util.Scanner;

/**
 *
 * @author omara
 */
public class EdMenu {
    Scanner sc = new Scanner(System.in);
    
    BasicPila basicPila = new BasicPila();
    
    
    public void viewEdMenu(){        
        System.out.println("""
                               =========================
                                       MENU ED
                               =========================
                               1. EJERCICIO: PILA BASICA.
                               """);     
        System.out.print("DIGITE SU OPCION: ");
        int opc = sc.nextInt();
        executeEdMenu(opc);
    }
    
    public void executeEdMenu(int opc){
        
        switch (opc) {
                case 1 -> {
                    basicPila.basicPila();
            }
                case 2 -> {
            }
            } 
    }
    
    
    
}
