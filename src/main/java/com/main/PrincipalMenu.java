package com.main;
import java.util.Scanner;
/**
 *
 * @author Omar Orozco
 */
public class PrincipalMenu {
    Scanner sc = new Scanner(System.in);
    PooMenu pooMenu = new PooMenu();
    EdMenu edMenu = new EdMenu();
    
    
    public void viewMenu() {
        System.out.println("""
                               =========================
                                          MENU
                               =========================
                               1. PROGRAMACION ORIENTADA A OBJETOS.
                               2. ESTRUCTURA DE DATOS.
                               """);
        
        System.out.print("DIGITE SU OPCION: ");
        int opc = sc.nextInt();
        executeMenu(opc);
        
    }
    public void executeMenu(int opc){
        switch (opc) {
                case 1 -> {
                    pooMenu.viewpooMenu();
            }
                case 2 -> {
                   edMenu.viewEdMenu();
            }
            }
    }
}
