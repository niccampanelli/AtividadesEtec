package teopitagoras;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pitagoras extends JFrame {
	
	JTextField a = new JTextField();
	JTextField b = new JTextField();
	
	JButton Calcular = new JButton("Calcular");
	
	JLabel l1 = new JLabel("Valor de C");
	
	JTextField c = new JTextField();
	
	JLabel title = new JLabel("Teorema de Pitagoras");
	JLabel subtitle = new JLabel("c² = a² + b²");
	
	JLabel alabel = new JLabel("Valor de a");
	JLabel blabel = new JLabel("Valor de b");
	JLabel clabel = new JLabel("Valor de c");
	
	calcpitagoras calc = new calcpitagoras();
	
	public pitagoras() {
		super("pitagoras");
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
				//titulo
				title.setBounds(30, 20, 500, 30);
				title.setFont(new Font("Arial", 10, 30));
				paine.add(title);
				
				//subtitulo
				subtitle.setBounds(100, 60, 500, 30);
				subtitle.setFont(new Font("Arial", 10, 25));
				paine.add(subtitle);
				
				//A
				alabel.setBounds(30, 150, 100, 20);//LABEL
				alabel.setFont(new Font("Arial", 10, 15));//LABEL
				paine.add(alabel);//LABEL
				a.setBounds(180,150,100,20);
				paine.add(a);
				
				//B
				blabel.setBounds(30, 190, 100, 20);//LABEL
				blabel.setFont(new Font("Arial", 10, 15));//LABEL
				paine.add(blabel);//LABEL
				b.setBounds(180,190,100,20);
				paine.add(b);

				
				//Botão calcular
				Calcular.setBounds(100, 280, 100, 15);
				paine.add(Calcular);
				Calcular.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						c.setText(String.valueOf(calc.calculo(Double.parseDouble(a.getText()), Double.parseDouble(b.getText()))));
					}
				});
				
				//C
				l1.setBounds(100, 320, 100, 20);//LABEL
				l1.setFont(new Font("Arial", 10, 15));//LABEL
				paine.add(l1);//LABEL
				c.setBounds(180,320,100,20);
				c.setEditable(false);
				paine.add(c);

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(360, 500);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		pitagoras calcpitagoras = new pitagoras();
	}

}
