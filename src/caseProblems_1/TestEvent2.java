/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblems_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TestEvent2 {
    
    public static void main(String[] args) {
        int evaluar;
        int tipoEvento;
        String telefono;
        String numeroEvento;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de evento");
        do{
            numeroEvento = scanner.next();
            numeroEvento = numeroEvento.toUpperCase();
            evaluar = TestEvent2.evaluarNumeroEvento(numeroEvento);
        }while(evaluar == 0);
        
        
        System.out.println("Ingrese el numero de invitados");
        int invitados = scanner.nextInt();
        
                 
        Event2 evento = new Event2(numeroEvento, invitados);
                
        System.out.println("Seleccione el tipo de evento");
        
        do{
            evento.imprimirtodosTipoEvento();
            tipoEvento = scanner.nextInt();
            evento.setTipoEvento(tipoEvento);
        }while(TestEvent2.evaluarTipoEvento(tipoEvento) == 0);
                
        System.out.println("Ingrese un numero de contacto");
        do{
        telefono = scanner.next();
        evento.setTelefono(telefono);
        
        }while(TestEvent2.evaluarTelefono(telefono) == 0);
        
        System.out.println("");
        evento.imprimir();
        
        
    }
    
    public static int evaluarNumeroEvento(String evaluar){
        if(evaluar.length() != 4){
            System.out.println("Debe ser de 4 digitos");
            return  0;
        }
        
        
        return  1;
    }
    
    public static int evaluarTelefono(String num){
        
        if((num.length() == 10)){
            return 1;
        }
        System.out.println("El numero telefonico debe ser 10 dígitos");
        return 0;
    }
    
    public static int evaluarTipoEvento(int num){
        if((num<=4) && (num >= 1)){
            return 1;
        }
        System.out.println("Debe seleccionar un de los 4");
        return 0;
    }
}
