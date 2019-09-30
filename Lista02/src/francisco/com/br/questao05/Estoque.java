package francisco.com.br.questao05;

/*Escreva uma classe em Java chamada Estoque. Ela deverá possuir:
a. Os atributos nome (String), qtdAtual (int) e qtdMinima (int).
b. Um construtor sem parâmetros e um outro contendo os parâmetros nome, qtdAtual,
e qtdMinima.
c. os métodos com as seguintes assinaturas:
i. void mudarNome(String nome)
ii. void mudarQtdMinima(int qtdMinima)
iii. void repor(int qtd)
iv. void darBaixa(int qtd) 
v. String mostra()
vi. boolean precisaRepor()  */
public class Estoque {
    
    String nome;
    int qtdAtual;
    int qtdMinima;
    
    public Estoque(){
        
    }
    
    public Estoque(String nome, int qtdAtual, int qtdMinima){
        
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
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
        return nome+"\nQuantidade atual: "+qtdAtual;
    }
    
    boolean precisaRepor(){
        if (qtdAtual < qtdMinima){
            return true;
        }
        else{
            return false;
        }
    }
    
}
