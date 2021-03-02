/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_1;

/**
 *
 * @author Usuario
 */
public class Preguntas2 {
    
    private int correctas = 0; 
    private int incorrectas = 0;
    private String preguntas;
    private Respuestas2[] respuestas;
    private int indice;
    
    public Preguntas2(String preguntas){
        this.preguntas = preguntas;
        this.respuestas = new Respuestas2[4];
    }
    
    public void agregarRespuesta(Respuestas2 r){
        if(indice <= 2){
            this.respuestas[indice] = r;
            indice++;
        }
    }
    
    public boolean contestar( int indice){
        return this.respuestas[indice].getStatus();
    }
    
    public void imprimir(){
        System.out.println(this.getPreguntas());
        int i = 0;
        System.out.println(String.format("%s %s", "[A]", this.respuestas[i].getText()));
        i++;
        System.out.println(String.format("%s %s", "[B]", this.respuestas[i].getText()));
        i++;
        System.out.println(String.format("%s %s", "[C]", this.respuestas[i].getText()));
    }
    
    

    public String getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(String preguntas) {
        this.preguntas = preguntas;
    }
    
    
    public void setCorrectas(){
        this.correctas ++;
    }
    
    public int getCorectas(){
        return this.correctas;
    }

    public int getIncorrectas() {
        return incorrectas;
    }

    public void setIncorrectas() {
        this.incorrectas ++;
    }
    
    
}
