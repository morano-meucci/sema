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
public class Produttore extends Thread{
       Semaforo pieno;
    Semaforo vuoto;
    int tanti = 10;
    final int attesa = 500;

    public Produttore(Semaforo s1, Semaforo s2) {
        pieno = s1;
        vuoto = s2;
    }

    public void run() {
        for (int k = 0; k < tanti; k++) {
            vuoto.P();                             //Controlliamo se la risorsa è disponibile,in caso sia libera genera un numero
            EsNew.buffer = k;
            System.out.println("Scrittore: dato scritto:" + k);
            pieno.V();
            try {
                Thread.sleep(attesa);
            } catch (Exception e) {
            }
        }
        System.out.println("Scrittore: termine scrittura dati.");
    }

}
