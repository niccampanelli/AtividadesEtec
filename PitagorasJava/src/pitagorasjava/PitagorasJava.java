package pitagorasjava;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PitagorasJava extends JFrame {
	
	JTextField a = new JTextField();
	JTextField b = new JTextField();
	
	JButton Calcular = new JButton("Calcular");
	
	JLabel l1 = new JLabel("Valor de C");
	
	JTextField c = new JTextField();
	
	JLabel title = new JLabel("Teorema de Pitagoras");
	JLabel subtitle = new JLabel("c² = a² + b²");
	
	JLabel alabel = new JLabel("Valor de A");
	JLabel blabel = new JLabel("Valor de B");
	JLabel clabel = new JLabel("Valor de C");
	
	public PitagorasJava() {
		super("Pitagoras");
		Container tela = this.getContentPane();
		tela.setLayout(null);
		
                title.setBounds(80, 20, 500, 30);
		subtitle.setBounds(110, 50, 500, 30);
				
		alabel.setBounds(10, 150, 100, 20);
		a.setBounds(180,150,100,20);
				
		blabel.setBounds(10, 190, 100, 20);
		b.setBounds(180,190,100,20);

		Calcular.setBounds(100, 280, 100, 15);
		Calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            if(!a.getText().isEmpty() && !b.getText().isEmpty()){
                                double A = Double.parseDouble(a.getText());
                                double B = Double.parseDouble(b.getText());
                                double C = 0;

                                C = Math.sqrt((A*A) + (B*B));

                                c.setText(Double.toString(C));
                            }
                            else{
                                c.setText("0");
                            }
                    }
		});
				
		
		clabel.setBounds(100, 320, 100, 20);
		c.setBounds(180,320,100,20);
		c.setEditable(false);
                
		tela.add(title);
		tela.add(subtitle);
		tela.add(alabel);
		tela.add(a);
		tela.add(blabel);
		tela.add(b);
		tela.add(Calcular);
		tela.add(clabel);
		tela.add(c);
                
                setLocationRelativeTo(null);
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		PitagorasJava app = new PitagorasJava();
                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
