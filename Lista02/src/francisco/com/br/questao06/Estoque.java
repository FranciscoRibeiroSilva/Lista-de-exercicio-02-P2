package francisco.com.br.questao06;

/*Os atributos qtdAtual e qtdMinima jamais poderão ser negativos. O método repor
aumenta qtdAtual de acordo com o parâmetro qtd. O método darBaixa diminui qtdAtual
de acordo com o parâmetro qtd. O método mostra() retorna uma String contendo o nome
do produto, sua quantidade mínima, sua quantidade atual. O método precisaRepor
retorna true caso a quantidade atual esteja menor ou igual à quantidade mínima e false,
caso contrário.*/
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
