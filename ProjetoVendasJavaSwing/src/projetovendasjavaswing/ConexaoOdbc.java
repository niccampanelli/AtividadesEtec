package projetovendasjavaswing;

import java.io.File;
import java.io.IOException;
import java.sql.*;

public class ConexaoOdbc {
    public Connection con;
    public Statement stm;
    String pathAplicacao = "";
    String nomeBanco = "projetovendas.db";
    String stringConexao = "";
    
    public Statement conectar() throws Exception{
        try{
            pathAplicacao = new File(".").getCanonicalPath();
            System.out.println("Path da aplicação encontrado: " + pathAplicacao);
        } catch(IOException e) {
            System.out.println("Path da aplicação não encontrado!" + e);
        }
        
        stringConexao = "jdbc:sqlite:" + pathAplicacao + "/banco/" + nomeBanco;
        
        try{
            con = DriverManager.getConnection(stringConexao);
            DatabaseMetaData meta = con.getMetaData();
            System.out.println("O nome do driver de conexão é: " + meta.getDriverName());
            if(con != null){
                System.out.println("Conexão com o banco de dados estabelecida!");
            }
        } catch(SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());
        }
        try
        {
          stm = con.createStatement();
        }
        catch(SQLException sqle) {
            throw new Exception("Erro ao conectar ao banco de dados: " + sqle.getMessage());
        }
        
        return stm;
    }
    
    public void desconectar(){
        try{
            con.close();
        } catch(SQLException sqle) {
        }
    }
}
