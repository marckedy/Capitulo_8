/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Quiz2 {
    
    private Preguntas2[] preguntas;
    
    public Quiz2(){
        this.preguntas = new Preguntas2[10];
        
        this.preguntas[0] = new Preguntas2("¿De que color es el cielo?");
        this.preguntas[0].agregarRespuesta(new Respuestas2("Verde", false));
        this.preguntas[0].agregarRespuesta(new Respuestas2("Rojo", false));
        this.preguntas[0].agregarRespuesta(new Respuestas2("Azul", true));
        
        this.preguntas[1] = new Preguntas2("¿Que son las vacas?");
        this.preguntas[1].agregarRespuesta(new Respuestas2("Animales", true));
        this.preguntas[1].agregarRespuesta(new Respuestas2("Figuras geometricas", false));
        this.preguntas[1].agregarRespuesta(new Respuestas2("Un vaso caro", false));
        
        this.preguntas[2] = new Preguntas2("¿Cual de estas es una comida mexicana?");
        this.preguntas[2].agregarRespuesta(new Respuestas2("Shushi", false));
        this.preguntas[2].agregarRespuesta(new Respuestas2("Hamburguesa", false));
        this.preguntas[2].agregarRespuesta(new Respuestas2("Mole", true));
        
        this.preguntas[3] = new Preguntas2("¿Cual de las siguientes está bien dicha?");
        this.preguntas[3].agregarRespuesta(new Respuestas2("Queso Oaxaca", false));
        this.preguntas[3].agregarRespuesta(new Respuestas2("Quesillo", true));
        this.preguntas[3].agregarRespuesta(new Respuestas2("Queso de Oaxaca", false));
        
    }
    
    public Preguntas2 getPregunta(int indice){
        return this.preguntas[indice];
    }
    
    
    public static void main(String[] args) {
        
        
        
        Quiz2.evaluar(0);
        Quiz2.evaluar(1);
        Quiz2.evaluar(2);
        Quiz2.evaluar(3);
        
        
    }
    
    public static void evaluar(int evaluar){
        
        Quiz2 quiz = new Quiz2();
        
        int indice = 0;
        int resp;
        
        Preguntas2 p = quiz.getPregunta(evaluar);
        
        
        resp = 0;
        p.imprimir();
        
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.next();
        char c = respuesta.toUpperCase().charAt(0);
        
            
        if (p.contestar(Quiz2.numeroRespuesta(c))){
        System.out.println("Correcto");
        resp = 1;
        }else{
        System.out.println("Incorrecto");
        }
        indice++;
        
        
        if(resp == 1){
            p.setCorrectas();
        }else{
            p.setIncorrectas();
        
        }
    }
    

    public static int numeroRespuesta(char respuesta){
        int num=0;
        switch(respuesta){
            case 'A': num = 0; break;
            case 'B': num = 1; break;
            case 'C': num = 2; break;
        }
        return num;
    }
}
