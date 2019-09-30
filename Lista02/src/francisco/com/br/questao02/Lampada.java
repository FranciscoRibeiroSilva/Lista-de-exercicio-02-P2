package francisco.com.br.questao02;

public class Lampada {
    
    boolean ligada;
    
    void ligar(){
        ligada = true;
    }
    
    void desligar(){
        ligada = false;
    }
    
    String observa(){
        if (ligada){
            return "Ligada";
        }
        else{
            return "Deliga";
        }
    }
    
    public static void main(String args []){
        
        Lampada lampa1 = new Lampada();
        Lampada lampa2 = new Lampada();
        
        lampa1.ligar();
        
        lampa2.desligar();
        
        System.out.println("Status lampada 1: "+lampa1.observa()+"\nStatus lampada 2: "+lampa2);
    }
}