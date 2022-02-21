package exemplojlist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploJList extends JFrame{
    JLabel corLabel, estiloLabel, tamLabel, textoExemplo;
    JComboBox corLista;
    String[] cores = {"Sem Cor", "Vermelho", "Verde", "Azul", "Amarelo", "Branco"};
    JCheckBox negrito, italico, normal, negritoita;
    ButtonGroup grupo;
    JRadioButton tam1, tam2, tam3, tam4;
    Integer estilo, tamanho;
    
    public ExemploJList(){
        super("Exemplo Combo Check Radio BOX");
        Container tela = getContentPane();
        setLayout(null);
        
        estilo = Font.PLAIN;
        tamanho=12;
        
        corLabel = new JLabel("Cor");
        corLabel.setBounds(20, 20, 100, 20);
        corLista = new JComboBox(cores);
        corLista.setBounds(20, 50, 150, 20);
        
        estiloLabel = new JLabel("Estilo");
        estiloLabel.setBounds(200, 20, 100, 20);
        negrito = new JCheckBox("Negrito");
        negrito.setBounds(198, 50, 100, 20);
        italico = new JCheckBox("Itálico");  
        italico.setBounds(198, 80, 100, 20);      
        normal = new JCheckBox("Normal");  
        normal.setBounds(198, 110, 100, 20);      
        negritoita = new JCheckBox("Negrito Itálico");   
        negritoita.setBounds(198, 140, 120, 20);
        
        tamLabel = new JLabel("Tamanho");
        tamLabel.setBounds(330, 20, 130, 20);
        tam1 = new JRadioButton("12"); 
        tam1.setBounds(330, 50, 120, 20);
        tam2 = new JRadioButton("14");
        tam2.setBounds(330, 80, 120, 20);
        tam3 = new JRadioButton("16");
        tam3.setBounds(330, 110, 120, 20);
        tam4 = new JRadioButton("18");
        tam4.setBounds(330, 140, 120, 20);
        
        tam1.setSelected(true);
        
        grupo = new ButtonGroup();
        grupo.add(tam1);
        grupo.add(tam2);
        grupo.add(tam3);
        grupo.add(tam4);
        
        corLista.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(corLista.getSelectedItem().toString() == "Sem Cor"){
                    textoExemplo.setForeground(Color.black);
                }
                if(corLista.getSelectedItem().toString() == "Vermelho"){
                    textoExemplo.setForeground(Color.red);
                }
                if(corLista.getSelectedItem().toString() == "Verde"){
                    textoExemplo.setForeground(Color.green);
                }
                if(corLista.getSelectedItem().toString() == "Azul"){
                    textoExemplo.setForeground(Color.blue);
                }
                if(corLista.getSelectedItem().toString() == "Amarelo"){
                    textoExemplo.setForeground(Color.yellow);
                }
                if(corLista.getSelectedItem().toString() == "Branco"){
                    textoExemplo.setForeground(Color.white);
                }
            }
        });
        
        negrito.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                estilo = Font.BOLD;
                textoExemplo.setFont(new Font("", estilo, tamanho)); 
                italico.setSelected(false);
                normal.setSelected(false);
                negritoita.setSelected(false);
            }
        });
        italico.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                estilo = Font.ITALIC;
                textoExemplo.setFont(new Font("", estilo, tamanho)); 
                negrito.setSelected(false);
                normal.setSelected(false);
                negritoita.setSelected(false);
            }
        });
        normal.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                estilo = Font.PLAIN;
                textoExemplo.setFont(new Font("", estilo, tamanho));
                negrito.setSelected(false);
                italico.setSelected(false);
                negritoita.setSelected(false);
            }
        });
        negritoita.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                estilo = Font.BOLD+Font.ITALIC;
                textoExemplo.setFont(new Font("", estilo, tamanho)); 
                negrito.setSelected(false);
                italico.setSelected(false);
                normal.setSelected(false);
            }
        });
        
        tam1.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tamanho = 12;
                textoExemplo.setFont(new Font("", estilo, tamanho));
            }
        });
        tam2.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tamanho = 14;
                textoExemplo.setFont(new Font("", estilo, tamanho));
            }
        });
        tam3.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tamanho = 16;
                textoExemplo.setFont(new Font("", estilo, tamanho));
            }
        });
        tam4.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tamanho = 18;
                textoExemplo.setFont(new Font("", estilo, tamanho));
            }
        });
        
        textoExemplo = new JLabel("Programa feito em Java");
        textoExemplo.setBounds(180, 200, 300, 20);   
        textoExemplo.setFont(new Font("", estilo, tamanho));
        
        tela.add(corLabel);
        tela.add(corLista);
        tela.add(estiloLabel);
        tela.add(negrito);
        tela.add(italico);
        tela.add(normal);
        tela.add(negritoita);
        tela.add(tamLabel);
        tela.add(tam1);
        tela.add(tam2);
        tela.add(tam3);
        tela.add(tam4);
        tela.add(textoExemplo);
        
        setSize(500, 300);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        ExemploJList app = new ExemploJList();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
