
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ConexaoBD {
    
    private final String URL = "jdbc:firebirdsql:localhost/3050:c:\\BancoDeDados\\Banco.fdb";
    final private String USUARIO = "sysdba";
    final private String SENHA = "masterkey";
    
    public Connection getConnection(){
        
        try {
            
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        
        } catch (SQLException | ClassNotFoundException ex) {
            throw new RuntimeException("Erro:\n" + ex);
        } 
    }   
}
