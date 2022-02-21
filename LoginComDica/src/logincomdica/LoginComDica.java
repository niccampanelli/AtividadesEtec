package logincomdica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginComDica extends JFrame{
    JLabel titulo, loginLabel, senhaLabel;
    JTextField loginField;
    JPasswordField senhaField;
    JButton ok, cancelar;

    public LoginComDica(){
        super("Login com Dica");
        Container tela = getContentPane();
        setLayout(null);
        
        titulo = new JLabel("Entre com seus dados:");
        titulo.setBounds(80, 20, 150, 20);
        
        loginLabel = new JLabel("Login: ");
        loginLabel.setBounds(20, 60, 150, 20);
        senhaLabel = new JLabel("Senha: ");
        senhaLabel.setBounds(20, 90, 150, 20);
        
        loginField = new JTextField(255);
        loginField.setBounds(80, 60, 180, 20);
        senhaField = new JPasswordField(255);
        senhaField.setBounds(80, 90, 180, 20);
        
        ok = new JButton("Ok");
        ok.setBounds(20, 140, 80, 20);
        ok.setToolTipText("Continuar com o Login");
        cancelar = new JButton("Cancelar");
        cancelar.setBounds(120, 140, 140, 20);
        cancelar.setToolTipText("Fechar o Aplicativo");
        
        cancelar.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int opcao;
                opcao = JOptionPane.showConfirmDialog(null,
                    "Deseja mesmo fechar o aplicativo?",
                    "Fechar",
                    JOptionPane.YES_NO_OPTION
                );
                if(opcao == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
        
        UIManager.put("ToolTip.background", SystemColor.info);
        
        tela.add(titulo);
        tela.add(loginLabel);
        tela.add(senhaLabel);
        tela.add(loginField);
        tela.add(senhaField);
        tela.add(ok);
        tela.add(cancelar);
        
        setSize(300, 240);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        LoginComDica app = new LoginComDica();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
