package questao.estoque;

public class Estoque {
    
    private String nome;
    private int qtdAtual;
    private int qtdMinima;
    
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
    
    public int getQtdAtual() {
    	
    	return this.qtdAtual;
    }
    public void setAtua (int qtd) {
    	this.qtdAtual += qtd;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
    	return this.nome;
    }
    
    public void setQtdMinima(int qtdMinima){
        this.qtdMinima = qtdMinima;
    }
    
    public int getQtdMinima() {
    	return this.qtdMinima;
    }
    
    public void repor(int qtd){
        this.qtdAtual += qtd;
    }
    
    public void darBaixa(int qtd){
        this.qtdAtual -= qtd;
    }
    
    public String mostra(){
        return nome+"\nQuantidade atual: "+qtdAtual+"\nQuantidade minima: "+qtdMinima;
    }
    
    public boolean precisaRepor(){
        if (qtdAtual <= qtdMinima){
            return true;
        }
        else{
            return false;
        }
    }
    
}