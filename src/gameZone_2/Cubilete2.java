/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_2;

/**
 *
 * @author Usuario
 */
public class Cubilete2 {
    
    private Die2[] dados;
    
    public Cubilete2(){
        this.dados = new Die2[5];
        for(int i=0; i<5;i++){
            this.dados[i]=new Die2();
        }
    }
    
    public void lanzar(){
        for(int i=0; i<5; i++){
            this.dados[i].Lanzar();
        }
    }
    
    public void mostrar(){
        for(int i=0; i<5; i++){
            System.out.print(this.dados[i].getDado() + " ");
        }
        System.out.println("");
    }
    
    public int evaluar(){
        int acumulador=0;
        int mayor=0;
        for(int i=1; i<=6; i++){
            for(int j=0; j<5; j++){
                if(this.dados[j].getDado()==i){
                    acumulador++;
                
                }
                
            }
            if(acumulador>mayor){
                mayor=acumulador;
            }
            acumulador=0;
            
        }
        return mayor;
    }
}
