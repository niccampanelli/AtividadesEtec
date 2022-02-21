package escondermostrarsenha;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EsconderMostrarSenha extends JFrame{
    
    JLabel rotuloSenha, exibir;
    JPasswordField campoSenha;
    JButton mostrar;
    
    public EsconderMostrarSenha(){
        super("Esconder e Mostrar Senha");
        Container tela = getContentPane();
        setLayout(null);
        
        rotuloSenha = new JLabel("Senha");
        exibir = new JLabel("");
        campoSenha = new JPasswordField(10);
        mostrar = new JButton("Mostrar");
        
        exibir.setVisible(false);
        
        rotuloSenha.setBounds(20, 20, 100, 20);
        exibir.setBounds(20, 75, 200, 20);
        campoSenha.setBounds(20, 50, 160, 20);
        mostrar.setBounds(200, 50, 100, 20);
        
        mostrar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String senha = new String(campoSenha.getPassword());
                        
                        if(!senha.isEmpty()){
                            exibir.setText("A senha é: " + senha);
                        }
                        else{
                            exibir.setText("Insira uma senha!");
                        }
                        
                            exibir.setVisible(true);
                    }
                }
        );
                
        tela.add(rotuloSenha);
        tela.add(exibir);
        tela.add(campoSenha);
        tela.add(mostrar);
        
        setSize(340, 150);
        setVisible(true);
        setLocationRelativeTo(null); 
    }
    
    public static void main(String[] args) {
        EsconderMostrarSenha app = new EsconderMostrarSenha();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
