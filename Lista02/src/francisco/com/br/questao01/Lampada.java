package francisco.com.br.questao01;
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
}
