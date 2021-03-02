/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_3;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class TestFullDeck {
    
    public static void main(String[] args) {
        FullDeck c = new FullDeck();
        Random r = new Random();
        int jugar = 0;
        int aleatorio;
            int suit;
            int repetir = 0;
        
        
        do{
            do{
                suit = r.nextInt(4)+1;
                aleatorio = r.nextInt(13) + 1;
                c.setSuit(suit);
                c.setNumero(aleatorio);
            }while(c.evaluarS(suit, aleatorio) == 0);
            
            c.valorS(suit, aleatorio);
        
            do{        
                aleatorio = r.nextInt(13) + 1;
                suit = r.nextInt(4)+1;
                c.setSuit2(suit);
                c.setNumero2(aleatorio);
            }while(c.evaluarS(suit, aleatorio) == 0);
            
            c.valorS(suit, aleatorio);
            
            c.imprimirCpu();
            c.imprimirHum();
        
            jugar++;
        }while(jugar<26);
        
        System.out.println("");
    }
}
