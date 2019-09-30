package francisco.com.br.questao08;

public class Banco {
    
    public static void main(String args[]){
        
        Conta conta = new Conta("Jubiscrelson", 171, "Vigarismo e Afins", 0, "01/01/1500");
        
        conta.depositar(100);
        conta.sacar(50);
        System.out.println("Rendimento mensal: "+conta.rendimentoMensal());
    }
}
