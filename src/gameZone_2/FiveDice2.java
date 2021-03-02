/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class FiveDice2 {
    
    public static void main(String[] args) {
        
        int intentar=0;
        
        Cubilete2 humano = new Cubilete2();
       
        Cubilete2 computadora = new Cubilete2();
       
       do{
           System.out.print("Humano:\t\t");
            humano.lanzar();
            humano.mostrar();
            
            System.out.print("Computadora:\t");
            computadora.lanzar();
            computadora.mostrar();
       
            int dado1=humano.evaluar();
            int dado2=computadora.evaluar();
            
            System.out.println("");
            
            if(dado1==dado2){
                System.out.println("Empate");
                System.out.println(dado1 + " of a Kind");
            }else{
                if(dado1<dado2){
                    if(dado2 == 2){
                        System.out.println("A pair");
                    }else{
                        System.out.println(dado2 + " of a Kind");
                    }
                    
                    System.out.println("El ganador es la computadora");
                }else{
                    if(dado1 == 2){
                        System.out.println("A pair");
                    }else{
                        System.out.println(dado1+ " of a Kind");
                    }
                    
                    System.out.println("El ganador es el humano");
                }
            }
            System.out.println("");
            System.out.println("Quieres jugar de nuevo?");
            System.out.println("1. Si");
            System.out.println("2. No");
            Scanner num = new Scanner(System.in);
            intentar = num.nextInt();
        }while(intentar==1);
        System.out.println("\n");
    }
}
