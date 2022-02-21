package bhaskarajava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BhaskaraJava extends JFrame{
    JLabel titulo, desc, valorA, valorB, valorC, x1, x2;
    JTextField valA, valB, valC, x1input, x2input;
    JButton calc;
    
    public BhaskaraJava(){
        super("Fórmula de Bhaskara");
        Container tela = getContentPane();
        setLayout(null);
        
        titulo = new JLabel("Fórmula de Bhaskara");
        desc = new JLabel("ax² + bx + c = 0");
        valorA = new JLabel("Valor de A");
        valorB =  new JLabel("Valor de B");
        valorC = new JLabel("Valor de C");
        x1 = new JLabel("x'");
        x2 = new JLabel("x");
        
        valA = new JTextField(10);
        valB = new JTextField(10);
        valC = new JTextField(10);
        x1input = new JTextField(10);
        x2input = new JTextField(10);
        
        calc = new JButton("Calcular");
        
        titulo.setBounds(60, 10, 200, 20);
        desc.setBounds(75, 30, 200, 20);
        valorA.setBounds(20, 70, 100, 20);
        valorB.setBounds(20, 90, 100, 20);
        valorC.setBounds(20, 110, 100, 20);
        x1.setBounds(100, 180, 100, 20);
        x2.setBounds(100, 200, 100, 20);
        
        valA.setBounds(120, 70, 100, 20);
        valB.setBounds(120, 90, 100, 20);
        valC.setBounds(120, 110, 100, 20);
        x1input.setBounds(120, 180, 100, 20);
        x2input.setBounds(120, 200, 100, 20);
        
        x1input.setEditable(false);
        x2input.setEditable(false);
        
        calc.setBounds(20, 140, 200, 20);
        
        calc.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        
                        if(!valA.getText().isEmpty() && !valB.getText().isEmpty() && !valC.getText().isEmpty()){
                            int a = Integer.parseInt(valA.getText());
                            int b = Integer.parseInt(valB.getText());
                            int c = Integer.parseInt(valC.getText());
                            
                            int delta = (b*b)-(4*a*c);
                            double x1 = (-(b)+(Math.sqrt(delta)))/(2*a);
                            double x2 = (-(b)-(Math.sqrt(delta)))/(2*a);
                            
                            x1input.setText(new String().valueOf(x1));
                            x2input.setText(new String().valueOf(x2));
                    }
                        else{
                            x1input.setText("0");
                            x2input.setText("0");
                    }
                        
                    }
                }
        );
        
        tela.add(titulo);
        tela.add(desc);
        tela.add(valorA);
        tela.add(valorB);
        tela.add(valorC);
        tela.add(x1);
        tela.add(x2);
        tela.add(valA);
        tela.add(valB);
        tela.add(valC);
        tela.add(x1input);
        tela.add(x2input);
        tela.add(calc);
        
        setSize(250, 300);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        BhaskaraJava app = new BhaskaraJava();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
