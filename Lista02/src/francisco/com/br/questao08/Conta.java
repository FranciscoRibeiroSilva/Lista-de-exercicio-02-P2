package francisco.com.br.questao08;

public class Conta {
    
    String nomeDoTitula;
    int numero;
    String agencia;
    double saldo;
    String dataDeAbertura;
    
    public Conta(){
        
    }
    
    public Conta(String nomeDoTitula, int numero, String agencia, double saldo, String dataDeAbertura){
        
        this.nomeDoTitula = nomeDoTitula;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataDeAbertura = dataDeAbertura;
    }
    
    void sacar(int valor){
        if (valor < this.saldo){
            
            this.saldo -= valor;
            
        }
    }
    
    void depositar(int valor){
        
        if (valor > 0){
            
            this.saldo += valor;
        }
    }
    
    double rendimentoMensal(){
        return this.saldo * 0.1;
    }
}
