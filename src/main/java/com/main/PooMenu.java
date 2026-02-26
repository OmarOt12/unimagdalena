package com.main;

import java.util.Scanner;
import com.poo.CancionBotellasVerdes;

public class PooMenu {

    private final Scanner sc;
    private final CancionBotellasVerdes cancionBotellasVerdes;
    
    public PooMenu (Scanner sc){
        this.cancionBotellasVerdes = new CancionBotellasVerdes();
        this.sc = sc;
        
    }
    
    
    
    public void viewPooMenu() {
        int opc;

        do {
            System.out.println("""
                           =========================
                                   MENU POO
                           =========================
                           1. EJERCICIO: CANCION BOTELLAS VERDES.
                           0. VOLVER.
                           """);

            System.out.print("DIGITE SU OPCION: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1 -> cancionBotellasVerdes.Cancion();
                case 0 -> System.out.println("Volviendo...");
                default -> System.out.println("Opcion invalida");
            }

        } while (opc != 0);
    }
}