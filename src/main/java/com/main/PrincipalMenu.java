package com.main;

import java.util.Scanner;

/**
 *
 * @author Omar Orozco
 */
public class PrincipalMenu {

    private final Scanner sc;
    private final PooMenu pooMenu; 
    private final EdMenu edMenu;

    public PrincipalMenu(Scanner sc) {
        this.sc = sc;
        this.pooMenu = new PooMenu(sc); 
        this.edMenu = new EdMenu(sc);
    }

    public void viewMenu() {
        int opc;

        do {
            System.out.println("""
                           =========================
                                      MENU
                           =========================
                           1. PROGRAMACION ORIENTADA A OBJETOS.
                           2. ESTRUCTURA DE DATOS.
                           0. SALIR
                           """);

            System.out.print("DIGITE SU OPCION: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1 ->
                    pooMenu.viewPooMenu();
                case 2 ->
                    edMenu.viewEdMenu();
                case 0 ->
                    System.out.println("Hasta luego");
                default ->
                    System.out.println("Opcion invalida");
            }

        } while (opc != 0);
    }
}
