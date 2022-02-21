package cadastrousuariocombobox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroUsuarioComboBox extends JFrame{
    JLabel nomeLabel, emailLabel, senhaLabel, sexoLabel, estiloLabel, timeLabel;
    JTextField nome, email;
    JPasswordField senha;
    JCheckBox espBox, eduBox, culiBox;
    ButtonGroup grupo;
    JRadioButton mRadio, fRadio;
    JComboBox timeLista;
    String[] lista = {"Palmeiras", "Corinthians", "Santos", "São Paulo"};
    String nomeStr, emailStr, senhaStr, sexoStr, estiloStr, timeStr;
    JButton mostrar;
    
    public CadastroUsuarioComboBox(){
        super("Cadastro Usuário");
        Container tela = getContentPane();
        setLayout(null);
        
        nomeLabel = new JLabel("Nome: ");
        nomeLabel.setBounds(80, 50, 80, 20);
        nome = new JTextField(255);
        nome.setBounds(130, 50, 180, 20);
        
        emailLabel = new JLabel("Email: ");
        emailLabel.setBounds(80, 80, 80, 20);
        email = new JTextField(255);
        email.setBounds(130, 80, 180, 20);
        
        senhaLabel = new JLabel("Senha: ");
        senhaLabel.setBounds(80, 110, 80, 20);
        senha = new JPasswordField(255);
        senha.setBounds(130, 110, 180, 20);
        
        sexoLabel = new JLabel("Sexo: ");
        sexoLabel.setBounds(80, 140, 80, 20);
        mRadio = new JRadioButton("Masculino");
        mRadio.setBounds(130, 140, 100, 20);
        fRadio = new JRadioButton("Feminino");
        fRadio.setBounds(130, 160, 100, 20);
        
        grupo = new ButtonGroup();
        grupo.add(mRadio);
        grupo.add(fRadio);
        
        estiloLabel = new JLabel("Estilo de Leitura");
        estiloLabel.setBounds(20, 200, 100, 20);
        espBox = new JCheckBox("Esportes");
        espBox.setBounds(130, 200, 100, 20);
        eduBox = new JCheckBox("Educação");  
        eduBox.setBounds(130, 220, 100, 20);      
        culiBox = new JCheckBox("Culinária");  
        culiBox.setBounds(130, 240, 100, 20); 
        
        timeLabel = new JLabel("Time de Futebol");
        timeLabel.setBounds(20, 280, 100, 20);
        timeLista = new JComboBox(lista);
        timeLista.setBounds(130, 280, 100, 20);
        
        mostrar = new JButton("Envia");
        mostrar.setBounds(230, 320, 80, 20);
        mostrar.setToolTipText("Mostrar os Dados");
        
        UIManager.put("ToolTip.background", SystemColor.info);
        
        mRadio.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                sexoStr = "Masculino";
            }
        });
        
        fRadio.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                sexoStr = "Feminino";
            }
        });
        
        espBox.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                estiloStr = "Esporte";
                eduBox.setSelected(false);
                culiBox.setSelected(false);
            }
        });
        
        eduBox.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                estiloStr = "Educação";
                espBox.setSelected(false);
                culiBox.setSelected(false);
            }
        });
        
        culiBox.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                estiloStr = "Culinária";
                espBox.setSelected(false);
                eduBox.setSelected(false);
            }
        });
        
        timeLista.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                timeStr = timeLista.getSelectedItem().toString();
            }
        });
        
        mostrar.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                if (!nome.getText().isEmpty()) { nomeStr = nome.getText(); }
                else { nomeStr = "Não Informado"; }
                
                if (!email.getText().isEmpty()) { emailStr = email.getText(); }
                else { emailStr = "Não Informado"; }
                
                if (!senha.getText().isEmpty()) { senhaStr = senha.getText(); }
                else { senhaStr = "Não Informado"; }
                
                String mensagem = "Os dados do usuário são: \n"+
                                    "Nome: "+nomeStr+"\n"+
                                    "Email: "+emailStr+"\n"+
                                    "Senha: "+senhaStr+"\n"+
                                    "Sexo: "+sexoStr+"\n"+
                                    "Estilo de Leitura: "+estiloStr+"\n"+
                                    "Time de Futebol: "+timeStr;
                
                JOptionPane.showMessageDialog(null,
                    mensagem,
                    "Dados",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
        
        tela.add(nomeLabel);
        tela.add(nome);
        tela.add(emailLabel);
        tela.add(email);
        tela.add(senhaLabel);
        tela.add(senha);
        tela.add(sexoLabel);
        tela.add(mRadio);
        tela.add(fRadio);
        tela.add(estiloLabel);
        tela.add(espBox);
        tela.add(eduBox);
        tela.add(culiBox);
        tela.add(timeLabel);
        tela.add(timeLista);
        tela.add(mostrar);
        
        setSize(380, 400);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        CadastroUsuarioComboBox app = new CadastroUsuarioComboBox();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
