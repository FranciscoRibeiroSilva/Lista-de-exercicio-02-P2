package questao.quadrado;

public class Quadrado {
    
    private double lado;
    
    public Quadrado (double lado){
        
        this.lado = lado;
    }
    
    public double area(){
        double area =  Math.pow (lado, 2);
        return area;
    }
    
    public double perimentro(){
        double perimetro = 4*lado;
        return perimetro;
    }
}