package com.poo;

/**
 *
 * @author Omar Orozco
 */
public class CancionBotellasVerdes {
    
    
    public void Cancion() {

        String[] numeros = {"una", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};

        for (int i = 10; i > 0; i--) {

            if (i > 2) {
                System.out.println(numeros[i - 1] + " botellas verdes colgando en una pared,");
                System.out.println(numeros[i - 1] + " botellas verdes colgando en una pared,");
                System.out.println("Si una botella verde se llega a caer,");
                System.out.println(numeros[i - 2] + " botellas verdes colgando en una pared.");
            } else if (i > 1) {
                System.out.println(numeros[i - 1] + " botellas verdes colgando en una pared,");
                System.out.println(numeros[i - 1] + " botellas verdes colgando en una pared,");
                System.out.println("Si una botella verde se llega a caer,");
                System.out.println(numeros[i - 2] + " botella verde colgando en una pared.");
            } else {
                System.out.println(numeros[i - 1] + " botella verde colgando en una pared,");
                System.out.println(numeros[i - 1] + " botella verde colgando en una pared,");
                System.out.println("Si esa botella verde se llega a caer,");
                System.out.println("no quedan botellas verdes colgando en la pared.");
            }

            System.out.println("");
            System.out.println("");
        }

    }
    
}
