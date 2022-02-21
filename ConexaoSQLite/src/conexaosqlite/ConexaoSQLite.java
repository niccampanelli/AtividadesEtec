/*
http://www.sqlitetutorial.net/sqlite-java/
 */
package conexaosqlite;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Wagner Lucca
 */

public class ConexaoSQLite 
{
  String pathAplicacao = "";
  String nomeBanco = "banco_teste.db";
  String stringConexao = "";
  Connection conn = null;
    
  public ConexaoSQLite()
  {
      
  }
  
/* =============================================================================
  connect()
============================================================================= */  

public Connection connect() 
{
  try
  {
    pathAplicacao = new File(".").getCanonicalPath();
    
    System.out.println("Path da aplicação encontrado: " + pathAplicacao);
  }
  catch (IOException e)
  {
    System.out.println("Path da aplicação não encontrado! " + e);    
  }
 
  // SQLite connection string  
  stringConexao = "jdbc:sqlite:" + pathAplicacao + "/banco/" + nomeBanco;
   
  try 
  {
    conn = DriverManager.getConnection(stringConexao);
    
    DatabaseMetaData meta = conn.getMetaData();
    
    System.out.println("O nome do driver de conexão é: " + meta.getDriverName());
    
    if (conn != null)
    {
    	System.out.println("Conexão com o banco de dados estabelecida!");
    }
  } 
  catch (SQLException e) 
  {
    System.out.println("Erro ao conectar com o banco de dados " + e.getMessage());
  }
  
  return conn;
}

/* =============================================================================
  createNewDatabase()
============================================================================= */  

public void createNewDatabase(String fileName) throws SQLException 
{
  stringConexao = "jdbc:sqlite:" + pathAplicacao + "/banco/" + fileName;
 
  try (Connection conn = DriverManager.getConnection(stringConexao)) 
  {
    if (conn != null) 
    {
      DatabaseMetaData meta = conn.getMetaData();
      
      System.out.println("Um novo banco de dados foi criado.");
    }
  } 
  catch (SQLException e) 
  {
    System.out.println("Não foi possivel criar uma novo banco de dados. " + e.getMessage());
  }
  finally
  {
    conn.close();
  }
}

/* =============================================================================
  createNewTable()
============================================================================= */  

public void createNewTable() throws SQLException 
{
  // SQL statement for creating a new table
  String sql = "CREATE TABLE IF NOT EXISTS TB_PROFESSOR (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	nome text NOT NULL,\n"
                + "	idade integer NOT NULL\n"
                + ");";
        
  try (Connection conn = DriverManager.getConnection(stringConexao);
  
  Statement stmt = conn.createStatement()) 
  {
    // create a new table
    stmt.execute(sql);
    
    System.out.println("Tabela criada com sucesso!");
    
  }
  catch (SQLException e) 
  {
    System.out.println("Não foi possivel criar a tabela. " + e.getMessage());
  }
  finally
  {
    conn.close();
  }
}

/* =============================================================================
  insert()
============================================================================= */  

public void insert(String nome , int idade) throws SQLException 
{
  String sql = "INSERT INTO TB_PROFESSOR (nome , idade) VALUES(? , ?)";
   
  try (Connection conn = this.connect();
   
  PreparedStatement pstmt = conn.prepareStatement(sql)) 
  {
    pstmt.setString(1 , nome);
    
    pstmt.setInt(2 , idade);
    
    pstmt.executeUpdate();
    
      System.out.println("Professor cadastrado com sucesso!");
  } 
  catch (SQLException e) 
  {
    System.out.println("Não foi possivel cadastrar o professor. " + e.getMessage());
  }
  finally
  {
    conn.close();
  }
}

/* =============================================================================
  selectAll()
============================================================================= */  

public void selectAll() throws SQLException
{
  String sql = "SELECT id , nome , idade FROM TB_PROFESSOR";
        
  try (Connection conn = this.connect();
          
  Statement stmt = conn.createStatement();
  
  ResultSet rs = stmt.executeQuery(sql))
  {
            
    // loop through the result set  
    System.out.println("Dados da Tabela TB_PROFESSOR");  
	  
    while (rs.next()) 
    {
      System.out.println(rs.getInt("id") +  "\t" + 
              rs.getString("nome") + "\t" +
              rs.getInt("idade"));
    }
  } 
  catch (SQLException e) 
  {
    System.out.println("Não foi possivel exibir os dados. " + e.getMessage());
  }
  finally
  {
    conn.close();
  }
}

}