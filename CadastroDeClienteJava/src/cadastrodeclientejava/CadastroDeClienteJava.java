package cadastrodeclientejava;

import javax.swing.*;
import java.awt.*;

public class CadastroDeClienteJava extends JFrame{
    JLabel titulo, nomeRotulo, cpfRotulo, rgRotulo, endRotulo, cidadeRotulo, estadoRotulo, cepRotulo;
    JTextField nomeCampo, cpfCampo, rgCampo, endCampo, cidadeCampo, estadoCampo, cepCampo;
    
    public CadastroDeClienteJava(){
        super("Cadastro do Cliente");
        Container tela = getContentPane();
        setLayout(null);
        
        titulo = new JLabel("Cadastro De Cliente");
        nomeRotulo = new JLabel("Nome");
        cpfRotulo = new JLabel("CPF");
        rgRotulo = new JLabel("RG");
        endRotulo = new JLabel("Endereço");
        cidadeRotulo = new JLabel("Cidade");
        estadoRotulo = new JLabel("Estado");
        cepRotulo = new JLabel("CEP");
        
        nomeCampo = new JTextField(100);
        cpfCampo = new JTextField(11);
        rgCampo = new JTextField(9);
        endCampo = new JTextField(100);
        cidadeCampo = new JTextField(100);
        estadoCampo = new JTextField(100);
        cepCampo = new JTextField(8);
        
        titulo.setBounds(130, 10, 120, 20);
        titulo.setForeground(Color.red);
        
        nomeRotulo.setBounds(20, 40, 100, 20);
        cpfRotulo.setBounds(20, 100, 100, 20);
        rgRotulo.setBounds(20, 160, 100, 20);
        endRotulo.setBounds(20, 220, 100, 20);
        cidadeRotulo.setBounds(20, 280, 100, 20);
        estadoRotulo.setBounds(20, 340, 100, 20);
        cepRotulo.setBounds(20, 400, 100, 20);
        
        nomeCampo.setBounds(20, 70, 260, 20);
        cpfCampo.setBounds(20, 130, 120, 20);
        rgCampo.setBounds(20, 190, 100, 20);
        endCampo.setBounds(20, 250, 340, 20);
        cidadeCampo.setBounds(20, 310, 240, 20);
        estadoCampo.setBounds(20, 370, 200, 20);
        cepCampo.setBounds(20, 430, 100, 20);
        
        tela.add(titulo);
        tela.add(nomeRotulo);
        tela.add(nomeCampo);
        tela.add(cpfRotulo);
        tela.add(cpfCampo);
        tela.add(rgRotulo);
        tela.add(rgCampo);
        tela.add(endRotulo);
        tela.add(endCampo);
        tela.add(cidadeRotulo);
        tela.add(cidadeCampo);
        tela.add(estadoRotulo);
        tela.add(estadoCampo);
        tela.add(cepRotulo);
        tela.add(cepCampo);
        
        setSize(400, 520);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        CadastroDeClienteJava app = new CadastroDeClienteJava();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
