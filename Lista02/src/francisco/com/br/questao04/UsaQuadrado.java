package francisco.com.br.questao04;

public class UsaQuadrado {
    
    public static void main(String args[]){
        
        Quadrado q1 = new Quadrado(2);
        Quadrado q2 = new Quadrado(4);
        Quadrado q3 = new Quadrado(5);
        
        System.out.println("q1\nArea: "+q1.area()+"\nPerimetro: "+q1.perimentro());
        System.out.println("q2\nArea: "+q2.area()+"\nPerimetro: "+q2.perimentro());
        System.out.println("q3\nArea: "+q3.area()+"\nPerimetro: "+q3.perimentro());
    }
    
}
