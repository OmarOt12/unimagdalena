package com.main;

import java.util.Scanner;

/**
 *
 * @author Omar Orozco
 */
public class main {
    
        public static void main(String[] args ){

            try (Scanner sc = new Scanner(System.in)
            ) {
                PrincipalMenu principalMenu = new PrincipalMenu(sc);
                principalMenu.viewMenu();
                // Se cierra al final
            }
        }
    
}
