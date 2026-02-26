/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ed;
import java.util.Scanner;

/**
 *
 * @author omara
 */
public class BasicPila {
    
    private final Scanner sc;       
    public BasicPila(Scanner sc) {
        this.sc = sc;
    }
        
    public void basicPila() {
        //Instanciamos la Pila                
        Pila<Integer> pila = new Pila<>();
        //Instanciamos el menu de ED        
                
        int opc;
        do {

            System.out.println("""
                               =========================
                                      PILA BASICA
                               =========================
                               1. APILAR
                               2. DESAPILAR
                               3. CONSULTAR TOPE DE LA PILA
                               4. CONSULTAR CANTIDAD DE ELEMENTOS EN LA PILA
                               5. VERIFICAR SI LA PILA ESTA VACIA
                               6. MOSTRAR ELEMENTOS DE LA PILA  
                               7. SALIR
                               """);

            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1 -> {
                    System.out.print("Ingrese un numero: ");
                    int num = sc.nextInt();
                    pila.push(num);
                }
                case 2 -> {
                    Integer numPop = pila.pop();
                    if (null != numPop) {
                        System.out.println("Numero eliminado: " + numPop);
                    } else {
                        System.out.println("La pila esta vacia, agregue un Numero...");
                    }
                    sc.nextLine();
                }
                case 3 -> {
                    Integer pilaTop = pila.top();
                    if (pilaTop != null) {
                        System.out.println("El tope de la Pila es: " + pilaTop);
                    } else {
                        System.out.println("La pila esta vacia...");
                    }
                    sc.nextLine();

                }
                case 4 -> {
                    int pilaSize = pila.size();                                                            
                    System.out.println("La Pila tiene " + pilaSize + " elemento/s.");
                    sc.nextLine();
                }
                case 5 -> {

                    if (pila.empty() != true) {
                        System.out.println("La pila no esta vacia.");
                    } else {
                        System.out.println("La pila esta vacia, agregue un Numero...");
                    }
                    sc.nextLine();
                }
                case 6 -> {
                    System.out.println("PILA: ");
                    pila.print_stack();
                    sc.nextLine();
                }
                case 7 -> {
                    System.out.println("Saliendo...");
                }
            }

        } while (opc != 7);
    }

}
