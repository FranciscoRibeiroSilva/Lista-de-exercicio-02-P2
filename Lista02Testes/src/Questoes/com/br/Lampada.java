package Questoes.com.br;

public class Lampada {
    
    private boolean ligada;
    
    public void setLigar(){
        ligada = true;
    }
    
    
    public void setDesligar(){
        ligada = false;
    }
    
    public boolean observa(){
        if (ligada){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String args []){
        
        Lampada lampa1 = new Lampada();
        Lampada lampa2 = new Lampada();
        
        lampa1.setLigar();
        
        lampa2.setDesligar();
        
        System.out.println("Status lampada 1: "+lampa1.observa()+"\nStatus lampada 2: "+lampa2);
    }
}