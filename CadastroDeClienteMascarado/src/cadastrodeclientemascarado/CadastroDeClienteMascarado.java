package cadastrodeclientemascarado;

import javax.swing.*;
import java.awt.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.text.*;

public class CadastroDeClienteMascarado extends JFrame{
    JLabel titulo, nomeRotulo, telefoneRotulo, bairroRotulo, endRotulo, cidadeRotulo, estadoRotulo, cepRotulo;
    JTextField nomeCampo, bairroCampo, endCampo, cidadeCampo, estadoCampo;
    JFormattedTextField telefoneCampo, cepCampo;
    JButton cad, sair;
    
    MaskFormatter mascaraTel, mascaraCep;
    ImageIcon salvar, fechar;
    
    public CadastroDeClienteMascarado(){
        super("Cadastro de Cliente");
        Container tela = getContentPane();
        setLayout(null);
        
        tela.setBackground(new Color(255, 255, 200));
        
        try{
            mascaraTel = new MaskFormatter("(##) #####-####");
            mascaraCep = new MaskFormatter("#####-###");
            mascaraTel.setPlaceholderCharacter('_');
            mascaraCep.setPlaceholderCharacter('_');
        }
        catch(ParseException excp){}
        
        titulo = new JLabel("Cadastro De Cliente");
        nomeRotulo = new JLabel("Nome");
        endRotulo = new JLabel("Endereço");
        cidadeRotulo = new JLabel("Cidade");
        bairroRotulo = new JLabel("Bairro");
        telefoneRotulo = new JLabel("Telefone");
        cepRotulo = new JLabel("Cep");
        estadoRotulo = new JLabel("Estado");
        
        nomeCampo = new JTextField(100);
        endCampo = new JTextField(100);
        cidadeCampo = new JTextField(100);
        bairroCampo = new JTextField(100);
        telefoneCampo = new JFormattedTextField(mascaraTel);
        cepCampo = new JFormattedTextField(mascaraCep);
        estadoCampo = new JTextField(8);
        
        salvar = new ImageIcon("user1_(add)_16x16.gif");
        fechar = new ImageIcon("delete_16x16.gif");
        
        cad = new JButton("Cadastrar", salvar);
        sair = new JButton("Sair", fechar);
        
        titulo.setBounds(130, 10, 120, 20);
        titulo.setForeground(Color.cyan);
                
        nomeRotulo.setBounds(20, 40, 100, 20);
        nomeRotulo.setForeground(Color.red);
        endRotulo.setBounds(20, 100, 100, 20);
        endRotulo.setForeground(Color.blue);
        cidadeRotulo.setBounds(20, 160, 100, 20);
        cidadeRotulo.setForeground(new Color(100, 80, 80, 255));
        bairroRotulo.setBounds(20, 220, 100, 20);
        bairroRotulo.setForeground(new Color(100, 80, 80, 255));
        telefoneRotulo.setBounds(20, 280, 100, 20);
        telefoneRotulo.setForeground(new Color(100, 80, 80, 255));
        cepRotulo.setBounds(20, 340, 100, 20);
        cepRotulo.setForeground(Color.blue);
        estadoRotulo.setBounds(20, 400, 100, 20);
        estadoRotulo.setForeground(Color.blue);
        
        nomeCampo.setBounds(20, 70, 340, 20);
        endCampo.setBounds(20, 130, 340, 20);
        cidadeCampo.setBounds(20, 190, 340, 20);
        bairroCampo.setBounds(20, 250, 240, 20);
        telefoneCampo.setBounds(20, 310, 100, 20);
        cepCampo.setBounds(20, 370, 100, 20);
        estadoCampo.setBounds(20, 430, 200, 20);
        
        cad.setBounds(20, 500, 160, 20);
        sair.setBounds(200, 500, 160, 20);
        
        sair.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.exit(0);
                    }
                }
        );
        
        tela.add(titulo);
        tela.add(nomeRotulo);
        tela.add(nomeCampo);
        tela.add(endRotulo);
        tela.add(endCampo);
        tela.add(cidadeRotulo);
        tela.add(cidadeCampo);
        tela.add(bairroRotulo);
        tela.add(bairroCampo);
        tela.add(telefoneRotulo);
        tela.add(telefoneCampo);
        tela.add(cepRotulo);
        tela.add(cepCampo);
        tela.add(estadoRotulo);
        tela.add(estadoCampo);
        tela.add(cad);
        tela.add(sair);
        
        setSize(400, 600);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        CadastroDeClienteMascarado app = new CadastroDeClienteMascarado();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
