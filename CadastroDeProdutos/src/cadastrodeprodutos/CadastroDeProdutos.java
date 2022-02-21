package cadastrodeprodutos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroDeProdutos extends JFrame{
    JLabel titulo, nomeLabel, codLabel, uniLabel, atualLabel, minLabel, custoLabel, vendaLabel, valLabel, dataLabel;
    JTextField nomeInput, codInput, uniInput, atualInput, minInput, custoInput, vendaInput, valInput, dataInput;
    JButton salvar, fechar;
    
    public CadastroDeProdutos(){
        super("Cadastro do Cliente");
        Container tela = getContentPane();
        setLayout(null);
        
        titulo = new JLabel("Cadastro De Produtos");
        nomeLabel = new JLabel("Nome do Produto");
        codLabel = new JLabel("Código");
        uniLabel = new JLabel("Unidades");
        atualLabel = new JLabel("Estoque Atual");
        minLabel = new JLabel("Estoque Mínimo");
        custoLabel = new JLabel("Valor Custo");
        vendaLabel = new JLabel("Valor Venda");
        valLabel = new JLabel("Validade");
        dataLabel = new JLabel("Data de Cadastro");
        
        nomeInput = new JTextField(100);
        codInput = new JTextField(11);
        uniInput = new JTextField(9);
        atualInput = new JTextField(100);
        minInput = new JTextField(100);
        custoInput = new JTextField(100);
        vendaInput = new JTextField(8);
        valInput = new JTextField(8);
        dataInput = new JTextField(8);
        
        salvar = new JButton("Salvar");
        fechar = new JButton("Fechar");

        
        titulo.setBounds(150, 10, 130, 20);
        titulo.setForeground(new Color(70, 150, 120));
        
        nomeLabel.setForeground(new Color(70, 150, 120));
        codLabel.setForeground(new Color(70, 150, 120));
        uniLabel.setForeground(new Color(70, 150, 120));
        atualLabel.setForeground(new Color(70, 150, 120));
        minLabel.setForeground(new Color(70, 150, 120));
        custoLabel.setForeground(new Color(70, 150, 120));
        vendaLabel.setForeground(new Color(70, 150, 120));
        valLabel.setForeground(new Color(70, 150, 120));
        dataLabel.setForeground(new Color(70, 150, 120));
        
        salvar.setForeground(new Color(70, 150, 120));
        fechar.setForeground(new Color(70, 150, 120));
        
        nomeLabel.setBounds(20, 70, 100, 20);
        codLabel.setBounds(300, 70, 100, 20);
        uniLabel.setBounds(20, 130, 100, 20);
        atualLabel.setBounds(160, 130, 100, 20);
        minLabel.setBounds(300, 130, 100, 20);
        custoLabel.setBounds(20, 190, 100, 20);
        vendaLabel.setBounds(160, 190, 100, 20);
        valLabel.setBounds(300, 190, 100, 20);
        dataLabel.setBounds(20, 250, 100, 20);
        
        nomeInput.setBounds(20, 100, 260, 20);
        codInput.setBounds(300, 100, 120, 20);
        uniInput.setBounds(20, 160, 120, 20);
        atualInput.setBounds(160, 160, 120, 20);
        minInput.setBounds(300, 160, 120, 20);
        custoInput.setBounds(20, 220, 120, 20);
        vendaInput.setBounds(160, 220, 120, 20);
        valInput.setBounds(300, 220, 120, 20);
        dataInput.setBounds(20, 280, 120, 20);
        
        salvar.setBounds(160, 340, 120, 20);
        fechar.setBounds(300, 340, 120, 20);
        
        fechar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.exit(0);
                    }
                }
        );
        
        tela.add(titulo);
        tela.add(nomeLabel);
        tela.add(nomeInput);
        tela.add(codLabel);
        tela.add(codInput);
        tela.add(uniLabel);
        tela.add(uniInput);
        tela.add(atualLabel);
        tela.add(atualInput);
        tela.add(minLabel);
        tela.add(minInput);
        tela.add(custoLabel);
        tela.add(custoInput);
        tela.add(vendaLabel);
        tela.add(vendaInput);
        tela.add(valLabel);
        tela.add(valInput);
        tela.add(dataLabel);
        tela.add(dataInput);
        tela.add(salvar);
        tela.add(fechar);
        
        setSize(455, 420);
        setVisible(true);
        setLocationRelativeTo(null);        
    };
    
    public static void main(String[] args) {
        CadastroDeProdutos app = new CadastroDeProdutos();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
