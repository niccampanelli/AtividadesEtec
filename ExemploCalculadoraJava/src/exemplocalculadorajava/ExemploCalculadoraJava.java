package exemplocalculadorajava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploCalculadoraJava extends JFrame{
    JLabel valor1label, valor2label, resultlabel, resultadolabel;
    JTextField valor1, valor2, resultado;
    
    JButton somar, dividir, mult, subt;
    
    JButton sair = new JButton("Sair");
    
    public ExemploCalculadoraJava(){
        super("Exemplo de Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        
        valor1label = new JLabel("Valor 1");
        valor2label = new JLabel("Valor 2");
        resultadolabel = new JLabel("Resultado");
        valor1 = new JTextField(10);
        valor2 = new JTextField(10);
        resultado = new JTextField(10);
        somar = new JButton("Somar");
        dividir = new JButton("Dividir");
        mult = new JButton("Multiplicar");
        subt = new JButton("Subtrair");
        
        valor1label.setBounds(20, 20, 50, 20);
        valor1.setBounds(20, 50, 220, 20);
        
        valor2label.setBounds(260, 20, 60, 20);
        valor2.setBounds(260, 50, 220, 20);
        
        somar.setBounds(20, 80, 100, 20);
        dividir.setBounds(140, 80, 100, 20);
        mult.setBounds(260, 80, 100, 20);
        subt.setBounds(380, 80, 100, 20);
        
        resultadolabel.setBounds(20, 120, 80, 20);
        resultado.setBounds(140, 120, 100, 20);
        
        sair.setBounds(380, 120, 100, 20);
        
        sair.setBackground(Color.red);
        sair.setForeground(Color.white);
        
        somar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        if(!valor1.getText().isEmpty() && !valor2.getText().isEmpty()){
                            double val1 = Double.parseDouble(valor1.getText());
                            double val2 = Double.parseDouble(valor2.getText());
                            double res = val1 + val2;
                            resultado.setText(Double.toString(res));
                        }
                        else{
                            double res = 0;
                            resultado.setText(Double.toString(res));
                        }
                    }
                }
        );
        
        dividir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        if(!valor1.getText().isEmpty() && !valor2.getText().isEmpty()){
                            double val1 = Double.parseDouble(valor1.getText());
                            double val2 = Double.parseDouble(valor2.getText());
                            double res = val1 / val2;
                            resultado.setText(Double.toString(res));
                        }
                        else{
                            double res = 0;
                            resultado.setText(Double.toString(res));
                        }
                    }
                }
        );
        
        mult.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        if(!valor1.getText().isEmpty() && !valor2.getText().isEmpty()){
                            double val1 = Double.parseDouble(valor1.getText());
                            double val2 = Double.parseDouble(valor2.getText());
                            double res = val1 * val2;
                            resultado.setText(Double.toString(res));
                        }
                        else{
                            double res = 0;
                            resultado.setText(Double.toString(res));
                        }
                    }
                }
        );
        
        subt.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        if(!valor1.getText().isEmpty() && !valor2.getText().isEmpty()){
                            double val1 = Double.parseDouble(valor1.getText());
                            double val2 = Double.parseDouble(valor2.getText());
                            double res = val1 - val2;
                            resultado.setText(Double.toString(res));
                        }
                        else{
                            double res = 0;
                            resultado.setText(Double.toString(res));
                        }
                    }
                }
        );
        
        sair.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.exit(0);
                    }
                }
        );
        
        tela.add(valor1label);
        tela.add(valor1);
        tela.add(valor2label);
        tela.add(valor2);
        tela.add(somar);
        tela.add(dividir);
        tela.add(mult);
        tela.add(subt);
        tela.add(resultadolabel);
        tela.add(resultado);
        tela.add(sair);
        
        setSize(520, 200);
        setVisible(true);
        setLocationRelativeTo(null); 
    }
    
    public static void main(String[] args) {
        ExemploCalculadoraJava app = new ExemploCalculadoraJava();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
