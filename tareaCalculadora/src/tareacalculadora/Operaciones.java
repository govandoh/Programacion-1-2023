package tareacalculadora;

public class Operaciones {
    private double x1, x2, result; 

    Operaciones(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public double sumar(){
        result = x1+x2; 
        return result; 
    }
    
    public double restar(){
        result = x1-x2; 
        return result; 
    }
    
    public double multiplicar(){
        result = x1*x2; 
        return result; 
    }
    
    public double dividir(){
        result = x1/x2; 
        return result; 
    }
}
