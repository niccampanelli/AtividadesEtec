package muvjava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MUVJava extends JFrame{
    JLabel titulo, velocidadelabel, vel0label, acclabel, tempolabel, op1, op2, op3, res6, resacl, velinic;
    
    JTextField velocidade, velinicial, aceleracao, tempo;
    
    JButton calcular = new JButton("Calcular");
    
    public MUVJava(){
        super("Cálculo de MUV");
        Container tela = getContentPane();
        setLayout(null);
        
        titulo = new JLabel("Cálculo de MUV");
        velocidadelabel = new JLabel("Velocidade");
        vel0label = new JLabel("Velocidade Inicial");
        acclabel = new JLabel("Aceleração");
        tempolabel = new JLabel("Tempo");
        res6 = new JLabel("");
        resacl = new JLabel("");
        velinic = new JLabel("");
        
        op1 = new JLabel("=");
        op2 = new JLabel("+");
        op3 = new JLabel("×");
        
        velocidade = new JTextField(10);
        velinicial = new JTextField(10);
        aceleracao = new JTextField(10);
        tempo = new JTextField(10);
        
        velocidade.setText("0");
        velinicial.setText("5");
        aceleracao.setText("10");
        tempo.setText("0");
        
        velocidade.setEditable(false);
        
        titulo.setBounds(200, 10, 100, 20);
        velocidadelabel.setBounds(20, 50, 100, 20);
        vel0label.setBounds(140, 50, 100, 20);
        acclabel.setBounds(260, 50, 100, 20);
        tempolabel.setBounds(380, 50, 100, 20);
        
        op1.setBounds(126, 80, 100, 20);
        op2.setBounds(246, 80, 100, 20);
        op3.setBounds(366, 80, 100, 20);
        
        velocidade.setBounds(20, 80, 100, 20);
        velinicial.setBounds(140, 80, 100, 20);
        aceleracao.setBounds(260, 80, 100, 20);
        tempo.setBounds(380, 80, 100, 20);
        
        res6.setBounds(20, 120, 200, 20);
        velinic.setBounds(20, 140, 200, 20);
        resacl.setBounds(20, 160, 200, 20);
        
        calcular.setBounds(380, 120, 100, 20);
        
        calcular.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                            
                            if(!velocidade.getText().isEmpty() && !velinicial.getText().isEmpty() && !aceleracao.getText().isEmpty() && !tempo.getText().isEmpty()){
                                double vel = 0;
                                double vel0 = Double.parseDouble(velinicial.getText());
                                double acc = Double.parseDouble(aceleracao.getText());
                                double t = Double.parseDouble(tempo.getText());
                                double resv = vel0+(acc*t);
                                double resv6 = vel0+(acc*6);
                                
                                velocidade.setText(Double.toString(resv));
                                res6.setText("Velocidade em 6s: "+ Double.toString(resv6));
                                resacl.setText("Aceleração: "+ Double.toString(acc));
                                velinic.setText("Velocidade Inicial: "+ Double.toString(vel0));
                                res6.setForeground(Color.black);
                            }
                            else{
                                res6.setText("Preencha todos os campos!");
                                res6.setForeground(Color.red);
                                resacl.setText("");
                                velinic.setText("");
                            }
                    }
                }
        );
        
        tela.add(titulo);
        tela.add(velocidadelabel);
        tela.add(vel0label);
        tela.add(acclabel);
        tela.add(tempolabel);
        tela.add(velocidade);
        tela.add(velinicial);
        tela.add(aceleracao);
        tela.add(op1);
        tela.add(op2);
        tela.add(op3);
        tela.add(tempo);
        tela.add(calcular);
        tela.add(res6);
        tela.add(resacl);
        tela.add(velinic);
        
        setSize(520, 240);
        setVisible(true);
        setLocationRelativeTo(null); 
    }
    
    public static void main(String[] args) {
        MUVJava app = new MUVJava();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}