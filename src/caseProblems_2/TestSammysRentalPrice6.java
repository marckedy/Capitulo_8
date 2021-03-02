/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblems_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TestSammysRentalPrice6 {
    
    public static void main(String[] args) {
        
        String telefono;
        int tipoRenta;
        int minutos;
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Ingrese el numero de control");
        String control;
        
        do{
            control = scanner.next();
            control = control.toUpperCase();
        }while(TestSammysRentalPrice6.evaluarNumeroControl(control) == 0);
        
        
        
        
        
        System.out.println("\nIngrese el numero de minutos");
        minutos = scanner.nextInt();
        
        Rental6 renta = new Rental6(control, minutos);
        
        System.out.println("\nSeleccione el tipo de evento");
        
        do{
            renta.imprimirtodosTipoRenta();
            tipoRenta = scanner.nextInt();
            renta.setTipoRenta(tipoRenta);
        }while(TestSammysRentalPrice6.evaluarTipoRenta(tipoRenta) == 0);
        
        
        
        
        System.out.println("\nIngrese su numero telefonico");
        
        
        do{
        telefono = scanner.next();
        renta.setTelefono(telefono);
        
        }while(TestSammysRentalPrice6.evaluarNumeroTelefono(telefono) == 0);
        
        
        int tiempo1 = renta.getNumeroSegundos();
        System.out.println("");
        renta.imprimir();
        
        int horas = renta.getNumeroHoras();
        TestSammysRentalPrice6.cupones(horas);
    }
    
    public static int evaluarNumeroControl(String control){
        if(control.length() == 4){
            return 1;
        }
        System.out.println("\nDebe de ser de 4 dijitos");
        return 0;
    }
    
    public static int evaluarNumeroTelefono(String num){
        if((num.length() == 10)){
            return 1;
        }
        System.out.println("\nEl numero telefonico debe ser 10 dígitos");
        return 0;
    }
    
    public static int evaluarTipoRenta(int num){
        if((num<=4) && (num >= 1)){
            return 1;
        }
        System.out.println("\nDebe seleccionar un de los 4");
        return 0;
    }
    
    public static void cupones(int horas){
        System.out.println("\n\t\tCupones");
        do{
            System.out.println("Coupon good for 10 percent off next rental");
            horas--;
        }while(horas > 0);
    }
}
