package francisco.com.br.questao04;
/*Escreva uma classe UsaQuadrado cujo método main instancia os 3 objetos a seguir:
q1
lado:
2
q2
lado:
4
q3
lado:
5
Observe que os 3 objetos são instâncias da classe Quadrado criada na questão anterior.
Após instanciar os 3 objetos, o método main ainda deve mostrar a área e o perímetro
dos 3 quadrados instanciados.
 */
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
