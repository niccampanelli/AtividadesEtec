package calculodetriangulo;

public class MenuTriangulo {
    
    private Triangulo triangulo;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    
    public MenuTriangulo(){
        this.triangulo = new Triangulo();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
    }
    
    public void executarTriangulo(){
        do{
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        }
        while ( this.opcao != 0 );
    }
    
    private void executarMenuPrincipal(){
        String mensagemMenu = "Menu:" +
                              "\n1 - Cadastrar Lados" +
                              "\n2 - Verificar Lados Cadastrados" +
                              "\n3 - Verificar Tipo de Triângulo" +
                              "\n4 - Calcular Perímetro" +
                              "\n5 - Calcular a Área" +
                              "\n0 - Sair" +
                              "\n ";
        
        String entradaDados = io.entradaDados(mensagemMenu);
        this.opcao = conversor.stringToInt(entradaDados);
    }
    
    public void avaliarOpcaoEscolhida(){
        switch(this.opcao){
            case 1:
                String mensagemEntradaLados = "Entre os Lados 1, 2 e 3 respectivamente separados por vírgula:";
                String[] valoresEntrados = io.entradaDados(mensagemEntradaLados).split("\\s*,\\s*");
                
                double valor1 = conversor.stringToDouble(valoresEntrados[0]);
                double valor2 = conversor.stringToDouble(valoresEntrados[1]);
                double valor3 = conversor.stringToDouble(valoresEntrados[2]);
                
                triangulo.cadastrarLados(valor1, valor2, valor3);
                break;
            case 2:
                String mensagemReceber = "Os lados cadastrados são:" + "\n" + 
                                         "Lado 1: " + triangulo.getLado1() + "\n" +
                                         "Lado 2: " + triangulo.getLado2() + "\n" +
                                         "Lado 3: " + triangulo.getLado3() + "\n";
                io.saidaDados(mensagemReceber);
                break;
            case 3:
                String mensagemCalculo = "O triângulo cadastrado é:" + "\n" + triangulo.calc();
                io.saidaDados(mensagemCalculo);
                break;
            case 4:
                String mensagemPerimetro = "O perímetro do triângulo é:" + "\n" + triangulo.perimetro();
                io.saidaDados(mensagemPerimetro);
                break;
            case 5:
                String mensagemArea = "A área do triângulo é:" + "\n" + triangulo.area() + "cm²";
                io.saidaDados(mensagemArea);
                break;
            case 0:
                io.saidaDados("Finalizando programa");
                break;
            default:
                io.saidaDados("Opcao Inválida!");
                break;
        }
    }
}
