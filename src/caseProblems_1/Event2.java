/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblems_1;

/**
 *
 * @author Usuario
 */
public class Event2 {
    
    private double[] precio = new double[3];
    private int[] invitados = new int[3];
    private String[] numEvento = new String[3];
    private int evento;
    private int mayor;
    private final String LEMA = "La mejor comida";
    private final int PRECIO_POR_PERSONA_CARO = 35;
    private final int PRECIO_POR_PERSONA_BARATO = 32;
    private final int EVENTO_GRANDE = 50;
    private String telefono;
    private String[] tipoEvento = new String[5];
    private int num;
    
    public Event2(){
        this.invitados[this.evento] = 30;
        this.numEvento[this.evento] = "A000";
        this.tipoEvento[1] = "Boda";
        this.tipoEvento[2] = "Boda";
        this.tipoEvento[3] = "Cumpleaños";
        this.tipoEvento[4] = "Corporativo";
    }
    
    public Event2(int invitados){
        this.evento = 0;
        this.setPrecio();
        this.invitados[this.evento] = invitados;
    }
    
    public Event2(String numeroE, int invitados){
        this.evento = 0;
        this.numEvento[this.evento] = numeroE;
        this.setPrecio();
        this.invitados[this.evento] = invitados;
    }
    
    public void setTipoEvento(int n){
        this.num = n;
        switch(n){
            case 1: this.tipoEvento[1] = "Boda"; break;
            case 2: this.tipoEvento[2] = "Bautizo"; break;
            case 3: this.tipoEvento[3] = "Cumpleaños"; break;
            case 4: this.tipoEvento[4] = "Corporativo"; break;
        }
         
        
    }
    
    public String getTipoEvento(){
        return this.tipoEvento[this.num];
    }
    
    public void imprimirtodosTipoEvento(){
        System.out.println("1. Boda");
        System.out.println("2. Bautizo");
        System.out.println("3. Cumpleaños");
        System.out.println("4. Corporativo");
    }

    
    public void setEvento(int evento) {
        this.evento = evento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    public void valoresPredeterminados(){
        this.invitados[this.evento] = 30;
        this.numEvento[this.evento] = "A000";
    }
    
    public void setPrecio(){
        if(this.invitados[this.evento]>=50){
            this.precio[this.evento] = this.invitados[this.evento]*this.PRECIO_POR_PERSONA_BARATO;
        }else{
            this.precio[this.evento] = this.invitados[this.evento]*this.PRECIO_POR_PERSONA_CARO;
        }
    }
    
    public double getPrecio(){
        return precio[this.evento];
    }
    
    public int getPrecioPorPersonaCaro(){
        return this.PRECIO_POR_PERSONA_CARO;
    }
    
    public int getPrecioPorPersonaBarato(){
        return this.PRECIO_POR_PERSONA_BARATO;
    }
    
    public void setInvitados(int invitados){
        this.invitados[this.evento] = invitados;
        this.setPrecio();
    }
    
    public int getInvitados() {
        return invitados[this.evento];
    }
    
    public void setNumeroEvento(String numEvento){
        this.numEvento[this.evento] = numEvento;
    }
    
    public String getNumeroEvento(){
        return this.numEvento[this.evento];
    }
        
    public String getLEMA() {
        return LEMA;
    }
    
    public boolean tamano(){
        if(this.invitados[this.evento] >= this.EVENTO_GRANDE){
            System.out.println("Es un evento grande");
            return true;
        }else{
            System.out.println("No es un evento grande");
            return false;
        }
    }
    
    public void telefonoForma(){
        String n = this.telefono;
        this.telefono = "(" + n.charAt(0) + n.charAt(1) + n.charAt(2) + ") ";
        this.telefono = this.telefono + n.charAt(3) + n.charAt(4) + n.charAt(5) + "-";
        this.telefono = this.telefono + n.substring(6);
    }
    
    
    public void imprimir(){
        int precioPorPersona;
        
        System.out.println("LEMA " + this.LEMA);
        System.out.println("Tipo de evento: " + this.tipoEvento[this.num]);
        System.out.println("Numero de personas: " + this.getInvitados());
        
        if(this.tamano() == true){
            precioPorPersona = this.PRECIO_POR_PERSONA_BARATO;
        }else{
            precioPorPersona = this.PRECIO_POR_PERSONA_CARO;
        }
        
        this.setPrecio();
        this.telefonoForma();
        
        
        System.out.println("Precio por persona: " + precioPorPersona);
        System.out.println("Precio del evento: " + this.precio[this.evento]);
        System.out.println("Numero de evento: " + this.numEvento[this.evento]);
        System.out.println("Tel: " + this.telefono);
    }
}
