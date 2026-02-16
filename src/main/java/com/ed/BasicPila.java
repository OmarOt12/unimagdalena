/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ed;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author omara
 */
public class BasicPila {

    public void basicPila() {      
        //Instanciamos la Pila
        Pila<Integer> pila = new Pila<>();
        Scanner sc = new Scanner(System.in);
        int opc;
        do{

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
                    int pilaTop = pila.top();
                    System.out.println("El tope de la Pila es: " + pilaTop);
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
                case 7 ->{
                    break;
                }
            }

            

        }while(opc != 7);

        

       

    }
    
}

class Pila<T> {

    private ArrayList<T> items;

    public Pila() {
        items = new ArrayList<>();
    }

    public void push(T elemento) {
        items.add(elemento);
    }

    public T pop() {
        if (this.empty()) {
            return null;
        }
        return items.remove(items.size() - 1);
    }

    public void print_stack() {
        for (int i = this.size() - 1; i >= 0; i--) {
            System.out.print(items.get(i) + " | ");
        }
    }

    public boolean empty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public T top() {
        if (this.empty()) {
            return null;
        }
        return items.get(items.size() - 1);
    }
}
