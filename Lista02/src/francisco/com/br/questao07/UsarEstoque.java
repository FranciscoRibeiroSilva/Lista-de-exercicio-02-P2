package francisco.com.br.questao07;

public class UsarEstoque {
    
    public static void main(String args[]){
        
        Estoque estoque1 = new Estoque("Impressora Jato de Tinta", 13, 6);
        Estoque estoque2 = new Estoque("Monitor LCD 17 Polegadas", 11, 13);
        Estoque estoque3 = new Estoque("Mouse Ótico", 6, 2);
        
        estoque1.darBaixa(5);
        estoque2.repor(7);
        estoque3.darBaixa(4);
        
        System.out.println("Repor estoque 01: "+estoque1.precisaRepor()+"\nRepor estoque 02: "+estoque2.precisaRepor()+"\nRepor estoque 03: "+estoque3.precisaRepor());
        
        System.out.println("Estoque 01: "+estoque1.mostra()+"\nEstoque 02: "+estoque2.mostra()+"\nEstoque 03: "+estoque3.mostra());
    }
}
