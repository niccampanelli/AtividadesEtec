package exercícioherança;

public class Animal extends SerVivo{
    public String sexo;
    public int numeroDePatas = 4;
    
    public void respirar(){
        System.out.println("Respirando");
    }
    public void mover(){
        System.out.println("Movendo");
    }
}
