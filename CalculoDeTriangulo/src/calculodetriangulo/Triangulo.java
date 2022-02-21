package calculodetriangulo;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String tipo;
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void cadastrarLados(double lado1, double lado2, double lado3){
        this.setLado1(lado1);
        this.setLado2(lado2);
        this.setLado3(lado3);
    }
    
    public String calc(){        
        if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            tipo = "Escaleno";                       
        }
        
        else if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
            tipo = "Equilátero";            
        }
        
        else if(lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2){
            tipo = "Isóceles";            
        }
        
        else{
            tipo = "Valores inseridos não formam um triângulo!";
        }
        
        return tipo;
    }
    
    public double perimetro(){
        return lado1 + lado2 + lado3;
    }
    
    public double area(){
        double a = 0;
        
        this.calc();
        
        if(tipo == "Escaleno"){
            double p = (lado1 + lado2 + lado3)/2;
            a = Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
        }
        
        else if(tipo == "Isóceles"){
            double b = 0;
            double lm = 0;
            double h = 0;
            
            // lado1 = 16
            // lado2 = 16
            // lado3 = 10
            
            if(lado1 != lado2 && lado1 != lado3 && lado2 == lado3){
                b = lado1;
                lm = lado2;
            }
            
            if(lado1 != lado2 && lado1 == lado3 && lado2 != lado3){
                b = lado2;
                lm = lado1;
            }
            
            if(lado1 == lado2 && lado1 != lado3 && lado2 != lado3){
                b = lado3;
                lm = lado2;
            }
            
            h = Math.sqrt((lm*lm) - ((b/2)*(b/2)));
            
            a = (b * h)/ 2;
            
            System.out.println(b);
            System.out.println(lm);
            System.out.println(h);
            System.out.println(a);
            
        }
        
        else if(tipo == "Equilátero"){
            double b = 0;
            double lm = 0;
            double h = 0;
            
            // lado1 = 16
            // lado2 = 16
            // lado3 = 10
            
            b = lado1;
            lm = lado2;
            
            h = Math.sqrt((lm*lm) - ((b/2)*(b/2)));
            
            a = (b * h)/ 2;
            
            System.out.println(b);
            System.out.println(lm);
            System.out.println(h);
            System.out.println(a);
        }
        
        else{
            a = 0;
        }
        
        return a;
    }
    
}