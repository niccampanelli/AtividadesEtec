package javasqlstudio;

import java.sql.SQLException;

public class JavaSqlStudio {

    public static void main(String[] args) throws SQLException{
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        conexaoSQLite.connect();
        
        conexaoSQLite.createNewDatabase("VAI_CURINTIA.db");
        
        //conexaoSQLite.createNewTable();
        
        //conexaoSQLite.insert("Wagner Lucca", 41);
        //conexaoSQLite.insert("Carlos Alberto", 18);
        
        //conexaoSQLite.insert("Paulo", 31);
        
        conexaoSQLite.selectAll();
    }
    
}
