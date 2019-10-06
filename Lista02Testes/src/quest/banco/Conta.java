package quest.banco;

public class Conta {
    
    private String nomeDoTitula;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataDeAbertura;
    
    public Conta(){
        
    }
    
    public Conta(String nomeDoTitula, int numero, String agencia, double saldo, String dataDeAbertura){
        
        this.nomeDoTitula = nomeDoTitula;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataDeAbertura = dataDeAbertura;
    }
    
    public void setSacar(int valor){
        if (valor < this.saldo){
            
            this.saldo -= valor;
            
        }
    }
    
    public double getSaldo() {
    	return this.saldo;
    }
    public void depositar(int valor){
        
        if (valor > 0){
            
            this.saldo += valor;
        }
    }
    
    public double getRendimentoMensal(){
        return this.saldo * 0.1;
    }
    public String recuperarDadosParaImpressao(){
        return "Titular: "+this.nomeDoTitula+"\nNumero da conta: "+this.numero+"\nAgencia: "+this.agencia+"\nSaldo: "+this.saldo+"\nData de abertura: "+this.dataDeAbertura;
    }
}