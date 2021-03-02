/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_4;

/**
 *
 * @author Usuario
 */
public class SecretPhrase2 {
    
    private String texto2;
    private String respuesta2;
    private String[] texto = new String[11];
    private String[] respuesta = new String[11];
    
    
    
    public void frases(int n){
        switch(n){
            case 1: this.texto[n] = "LA PARED ES BLANCA"; break;
            case 2: this.texto[n] = "EL PERRO LADRA"; break;
            case 3: this.texto[n] = "LA MESA ES NEGRA"; break;
            case 4: this.texto[n] = "EL OCEANO ES MUY GRANDE"; break;
            case 5: this.texto[n] = "YO ME MUEVO CON EL TIEMPO"; break;
            case 6: this.texto[n] = "NO TENGO TODO CALCULADO"; break;
            case 7: this.texto[n] = "VAMOS A DARLE LA VUELTA AL MUNDO"; break;
            case 8: this.texto[n] = "UN DIA DECIDI HACERLE CASO A LA BRISA"; break;
            case 9: this.texto[n] = "CAMINA DISTINTO"; break;
            case 10: this.texto[n] = "VER COMO LAS BURBUJAS SUBEN"; break;
        }
        this.texto2 = this.texto[n];
    }
    
    public void asteriscos(int n){
        switch(n){
            case 1: this.respuesta[n] = "** ***** ** ******"; break;
            case 2: this.respuesta[n] = "** ***** *****"; break;
            case 3: this.respuesta[n] = "** **** ** *****"; break;
            case 4: this.respuesta[n] = "** ****** ** *** ******"; break;
            case 5: this.respuesta[n] = "** ** ***** *** ** ******"; break;
            case 6: this.respuesta[n] = "** ***** **** *********"; break;
            case 7: this.respuesta[n] = "***** * ***** ** ****** ** *****"; break;
            case 8: this.respuesta[n] = "** *** ****** ******* **** * ** *****"; break;
            case 9: this.respuesta[n] = "****** ********"; break;
            case 10: this.respuesta[n] = "*** **** *** ******** *****"; break;
        }
        this.respuesta2 = this.respuesta[n];
    }

    public String getTexto() {
        return respuesta2;
    }

    public String getRespuesta() {
        return respuesta2;
    }
    
    
    
    public int caracter(char caracter){
        char c;
        
        StringBuilder corregir = new StringBuilder(respuesta2);
        
        for(int i=0; i< this.texto2.length(); i++){
            c = this.texto2.charAt(i);
            
            if(c == caracter){
                corregir.setCharAt(i, caracter);
                this.respuesta2 = corregir.toString();
            }
        }
        
        return 1;
    }
    
    public int comparar(){
        
        if(this.respuesta2.equals(texto2)){
            return 1;
        }
        return 0;
    }
    
}
