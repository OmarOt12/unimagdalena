package com.main;

import com.ed.BasicPila;
import java.util.Scanner;

/**
 *
 * @author omara
 */
public class EdMenu {

    private final Scanner sc;
    private final BasicPila basicPila;
    
    public EdMenu (Scanner sc){
        this.sc = sc;
        this.basicPila = new BasicPila(sc);
    }

    public void viewEdMenu() {
        int opc;

        do {
            System.out.println("""
                           =========================
                                   MENU ED
                           =========================
                           1. EJERCICIO: PILA BASICA.
                           0. VOLVER.
                           """);

            System.out.print("DIGITE SU OPCION: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1 -> basicPila.basicPila();
                case 0 -> System.out.println("Volviendo...");
                default -> System.out.println("Opcion invalida");
            }

        } while (opc != 0);
    }
}
