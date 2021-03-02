/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_2;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Die2 {
    private int dado;
    
    public Die2(){
        this.Lanzar();
    }
    
    public int getDado(){
        return this.dado;
    }
    
    public void Lanzar(){
        Random dados = new Random();
        this.dado = dados.nextInt(6)+1;
    }
}
