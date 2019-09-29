package francisco.com.br.questao02;
/*Uma classe Lampada com atributo ligada (tipo boolean) e métodos liga() e desliga()
que nada retornam. O método liga torna o atributo ligada true e o método desliga torna
o atributo ligada false. Crie também o método observa() que retorna a String “ligada”
se a lâmpada estiver ligada e “desligada” se a lâmpada estiver desligada*/

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