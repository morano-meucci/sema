/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esnew;

/**
 *
 * @author 39334
 */
public class EsNew {

    /**
     * @param args the command line arguments
     */
     protected static int buffer;
    public static void main(String[] args) {
        // TODO code application logic here
         Semaforo pieno = new Semaforo(0);
        Semaforo vuoto = new Semaforo(1);
        Produttore prod = new Produttore(pieno, vuoto);
        Consumatore1 cons1 = new Consumatore1(pieno, vuoto);
         Consumatore2 cons2 = new Consumatore2(pieno, vuoto);
          Consumatore3 cons3= new Consumatore3(pieno, vuoto);
        prod.start();
        cons1.start();
        cons2.start();
        cons3.start();
        
        System.out.println("Main:termine avvio thread");
    }
    
}
