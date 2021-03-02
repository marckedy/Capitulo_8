/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblems_2;

/**
 *
 * @author Usuario
 */
public class Rental6 {
    
    public final static int NUMEROS_MINUTOS_EN_UNA_HORA = 60;
    public final static int TARIFA_POR_HORA = 40;
    private int numeroContrato;
    private int numeroHoras;
    private int numeroSegundos;
    private int precio;
    private String numeroControl;
    private String telefono;
    private String[] tipoRenta = new String[5];
    int num;
    
    public Rental6(){
        this.numeroSegundos = 0;
        this.numeroControl = "A000";
        this.tipoRenta[1] = "Moto acuatica";
        this.tipoRenta[2] = "Canoa";
        this.tipoRenta[3] = "Kayak";
        this.tipoRenta[4] = "Silla de playa";
    }
    
    public Rental6(String numeroControl, int numeroSegundos){
        this.numeroSegundos = numeroSegundos;
        this.numeroControl = numeroControl;
        this.tipoRenta[1] = "Moto acuatica";
        this.tipoRenta[2] = "Canoa";
        this.tipoRenta[3] = "Kayak";
        this.tipoRenta[4] = "Silla de playa";
    }
    
    public void setTipoRenta(int n){
        this.num = n;
        switch(n){
            case 1: this.tipoRenta[1] = "Moto acuatica"; break;
            case 2: this.tipoRenta[2] = "Canoa"; break;
            case 3: this.tipoRenta[3] = "Kayak"; break;
            case 4: this.tipoRenta[4] = "Silla de playa"; break;
        }
    }
    
    public String getTipoEvento(){
        return this.tipoRenta[this.num];
    }

    public void telefonoForma() {
        String n = this.telefono;
        this.telefono = "(" + n.charAt(0) + n.charAt(1) + n.charAt(2) + ") ";
        this.telefono = this.telefono + n.charAt(3) + n.charAt(4) + n.charAt(5) + "-";
        this.telefono = this.telefono + n.substring(6);
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    public void setNumeroContrato(int numero){
        this.numeroContrato = numero;
    }
    
    public void setHorasYMinutos(){
        this.numeroHoras = this.numeroContrato / 60;
        this.numeroSegundos = this.numeroContrato % 60;
    }
    
    public void setPrecio(){
        this.precio = TARIFA_POR_HORA*this.numeroHoras;
        if(this.numeroSegundos >= 40){
            this.precio = 40 + this.precio;
        }else{
            this.precio = this.numeroSegundos + this.precio;
        }
        
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public int getNumeroSegundos() {
        return numeroSegundos;
    }

    public int getPrecio() {
        this.setPrecio();
        return precio;
    }

    public String getNumeroControl() {
        return numeroControl;
    }
    
    public void imprimirtodosTipoRenta(){
        System.out.println("1. Moto acuatica");
        System.out.println("2. Canoa");
        System.out.println("3. Kayak");
        System.out.println("4. Silla de playa");
    }
    
    public void imprimir(){
        SammysRentalPrice6 sammy = new SammysRentalPrice6();
        
        this.setNumeroContrato(this.numeroSegundos);
        this.setHorasYMinutos();
        this.telefonoForma();
        
        System.out.println(sammy.getLEMA());
        System.out.println("Tipo de evento: " + this.tipoRenta[this.num]);
        System.out.print(this.numeroHoras);
        System.out.println(" : " + this.numeroSegundos + " hr");
        System.out.println("Total: $ " + this.getPrecio());
        System.out.println("Numero de control: " + this.numeroControl);
        System.out.println(this.telefono);
    }
}
