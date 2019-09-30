package francisco.com.br.questao07;

public class Estoque {
    
    String nome;
    int qtdAtual;
    int qtdMinima;
    
    public Estoque(){
        
    }
    
    public Estoque(String nome, int qtdAtual, int qtdMinima){
        
        this.nome = nome;
        if (qtdAtual >= 0){
            this.qtdAtual = qtdAtual;
        }
        
        this.nome = nome;
        if (qtdMinima >= 0){
            this.qtdMinima = qtdMinima;
        }
    }
    
    void mudarNome(String nome){
        this.nome = nome;
    }
    
    void mudarQtdMinima(int qtdMinima){
        this.qtdMinima = qtdMinima;
    }
    
    void repor(int qtd){
        this.qtdAtual += qtd;
    }
    
    void darBaixa(int qtd){
        this.qtdAtual -= qtd;
    }
    
    String mostra(){
        return nome+"\nQuantidade atual: "+qtdAtual+"\nQuantidade minima: "+qtdMinima;
    }
    
    boolean precisaRepor(){
        if (qtdAtual <= qtdMinima){
            return true;
        }
        else{
            return false;
        }
    }
    
}