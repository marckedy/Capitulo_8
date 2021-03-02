    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone_3;

/**
 *
 * @author Usuario
 */
public class FullDeck {
    
    private Suit suit;
    private Suit suit2;
    private int num;
    private int num2;
    private int[] s = new int[53];
    private int[] s2 = new int [53];
    
    public FullDeck(){
    this.num = 12; 
    this.num2 = 11;
    this.suit = Suit.CORAZONES;
    this.suit2 = Suit.PICAS;
    
    }
    
    public void setSuit(int s){
        switch(s){
            case 1: suit = Suit.CORAZONES; break;
            case 2: suit = Suit.DIAMANTES; break;
            case 3: suit = Suit.PICAS; break;
            case 4: suit = Suit.TREBOLES; break;
        }
    }
    
    public void valorS(int s, int a){
        switch(s){
            case 1: this.s[s] = a; break;
            case 2: this.s[s+13] = a + 13; break;
            case 3: this.s[s+26] = a + 26; break;
            case 4: this.s[s+39] = a + 39; break;
        }
    }
    
    public int evaluarS(int s, int a){
            switch(s){
                case 1: s = 0; break;
                case 2: s = 13; break;
                case 3: s = 26; break;
                case 4: s = 39; break;
            }
            s = s + a;
            if(this.s[s] > 0){
                return 0;
            }
        return 1;
    }
    
    public void setSuit2(int s){
        switch(s){
            case 1: suit2 = Suit.CORAZONES; break;
            case 2: suit2 = Suit.DIAMANTES; break;
            case 3: suit2 = Suit.PICAS; break;
            case 4: suit2 = Suit.TREBOLES; break;
        }
    }
    
    public void valorS2(int s2){
        switch(s2){
            case 1: this.s[s2] = s2; break;
            case 2: this.s[s2+13] = s2 + 13; break;
            case 3: this.s[s2+26] = s2 + 26; break;
            case 4: this.s[s2+39] = s2 + 39; break;
        }
    }
    
    public int evaluarS2(int s){
        for(int i=0; i<52; i++){
            if(this.s2[i] > 0){
                return 0;
            }
        }
        return 1;
    }
    
    public Suit getSuit(){
        return this.suit;
    }
    
    public Suit getSuit2(){
        return this.suit2;
    }
    
    public void setNumero(int num){
        this.num = num;
    }
    
    public void setNumero2(int num){
        this.num2 = num;
    }
    
    public int getNumero(){
        return this.num;
    }
    
    public int getNumero2(){
        return this.num2;
    }
    
    public int evaluar(){
        if((this.num == this.num2) && (this.suit == this.suit2)){
            return 0;
        }
        return 1;
    }
    
    public void ganador(){
        if(this.num == this.num2){
            System.out.println("Es un empate");
        }else{
            if(this.num > this.num2){
                System.out.println("Gano la computadora");
            }else{
                System.out.println("Gano el humano");
            }
        }
    }
    
    public void imprimirCpu(){
        System.out.println("Juego de la computadora");
        switch(this.num){
            case 1: System.out.println("Ace de " + this.suit); break;
            case 2: System.out.println("2 " + this.suit); break;
            case 3: System.out.println("3 " + this.suit); break;
            case 4: System.out.println("4 " + this.suit); break;
            case 5: System.out.println("5 " + this.suit); break;
            case 6: System.out.println("6 " + this.suit); break;
            case 7: System.out.println("7 " + this.suit); break;
            case 8: System.out.println("8 " + this.suit); break;
            case 9: System.out.println("9 " + this.suit); break;
            case 10: System.out.println("Ace de " + this.suit); break;
            case 11: System.out.println("Jack de " + this.suit); break;
            case 12: System.out.println("Queen de " + this.suit); break;
            case 13: System.out.println("King de " + this.suit); break;
        }
        System.out.println("");
    }
    
    public void imprimirHum(){
        System.out.println("Juego del humano");
        switch(this.num2){
            case 1: System.out.println("Ace de " + this.suit2); break;
            case 2: System.out.println("2 " + this.suit2); break;
            case 3: System.out.println("3 " + this.suit2); break;
            case 4: System.out.println("4 " + this.suit2); break;
            case 5: System.out.println("5 " + this.suit2); break;
            case 6: System.out.println("6 " + this.suit2); break;
            case 7: System.out.println("7 " + this.suit2); break;
            case 8: System.out.println("8 " + this.suit2); break;
            case 9: System.out.println("9 " + this.suit2); break;
            case 10: System.out.println("Ace de " + this.suit2); break;
            case 11: System.out.println("Jack de " + this.suit2); break;
            case 12: System.out.println("Queen de " + this.suit2); break;
            case 13: System.out.println("King de " + this.suit2); break;
        }
        System.out.println("");
    }
}
