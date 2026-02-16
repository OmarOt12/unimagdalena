package com.main;
import java.util.Scanner;
import com.poo.CancionBotellasVerdes;
/**
 *
 * @author omara
 */
public class PooMenu {
    Scanner sc = new Scanner(System.in);
    
    CancionBotellasVerdes cancionBotellasVerdes = new CancionBotellasVerdes();
    
    
    public void viewpooMenu(){        
        System.out.println("""
                               =========================
                                       MENU POO
                               =========================
                               1. EJERCICIO: CANCION BOTELLAS VERDES.
                               """);     
        System.out.print("DIGITE SU OPCION: ");
        int opc = sc.nextInt();
        executePooMenu(opc);
    }
    
    public void executePooMenu(int opc){
        
        switch (opc) {
                case 1 -> {
                    cancionBotellasVerdes.Cancion();
            }
                case 2 -> {
            }
            } 
    }
    
}
