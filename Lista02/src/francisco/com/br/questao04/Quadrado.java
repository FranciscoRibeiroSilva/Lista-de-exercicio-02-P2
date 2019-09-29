package francisco.com.br.questao04;

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
}