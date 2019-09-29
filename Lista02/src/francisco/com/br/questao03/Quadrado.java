package francisco.com.br.questao03;

/*Escreva uma classe Quadrado com atributo lado do tipo double. A classe deve ter um
construtor que recebe como parâmetro o lado do quadrado. Deve também ter os
métodos area() e perimetro() que retornam respectivamente a área e o perímetro do
quadrado, cujas fórmulas são as seguintes:
a. area = lado²
b. perimetro = 4 x lado*/
public class Quadrado {
    
    double lado;
    
    public Quadrado (double lado){
        
        this.lado = lado;
    }
    
    double area(){
        double area =  Math.pow (lado, 2);
        return area;
    }
    
    double perimentro(){
        double perimetro = 4*lado;
        return perimetro;
    }
    
    public static void main(String args []){
        
        Quadrado quadrado = new Quadrado(4);
        
        System.out.println("Area do quadrado: "+quadrado.area()+"\nPerimentro do quadrado: "+quadrado.perimentro());
        
    }
    
}
