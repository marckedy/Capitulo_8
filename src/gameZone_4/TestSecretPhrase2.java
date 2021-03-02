/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_4;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class TestSecretPhrase2 {
    
    public static void main(String[] args) {
        
        char caracter;
        String texto;
        int intentar = -1;
        
        SecretPhrase2 adivinar = new SecretPhrase2();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Adivina la frase ingresando letras");
        
        int num = random.nextInt(10)+1;
        
        adivinar.frases(num);
        adivinar.asteriscos(num);
        
        System.out.println(adivinar.getRespuesta());
        
        do{
                texto = scanner.next();
                caracter = texto.toUpperCase().charAt(0);
                adivinar.caracter(caracter);
                System.out.println(adivinar.getTexto());
                
        }while(adivinar.comparar() == 0);
        
        System.out.println("Bien echo la frase es: " + adivinar.getRespuesta());
        
        
    }
}
