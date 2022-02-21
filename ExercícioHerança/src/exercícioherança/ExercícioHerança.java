package exercícioherança;

public class ExercícioHerança {

    public static void main(String[] args) {
        Homem h = new Homem(); //Instanciando um novo Homem
        h.nascer(); //Ser Vivo nascendo
        h.respirar(); //Animal respirando
        h.mamar(); //Mamífero mamando
        h.mover(); //Animal movendo
        h.crescer(); //Ser Vivo crescendo
        h.falar(); //Homem falando
        h.gestar(); //Mamífero gestando
        h.parir(); //Mamífero parindo
        
        System.out.println(h.tamanho);
        System.out.println(h.numeroDePatas);
        System.out.println(h.sexo);
    }
    
}

