/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploJavaSwingMVC.Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author laura
 */
public class ConexionBD {
 
    private static ConexionBD laConexion;
    private final String urlBD = "jdbc:derby://localhost:1527/HelloWorldDB";
    private final String userName = "root";
    private final String password = "root";
    
    private final String driverName = "org.apache.derby.jdbc.ClientDriver";
    
    private Connection conexion;

    // Garantiza que el cliente no cree objetos
    private ConexionBD() throws SQLException, ClassNotFoundException{
    Class.forName(driverName);
    conexion = DriverManager.getConnection(urlBD, userName, password);
    }

    // devuelve el singleton
    public static ConexionBD getInstancia() throws SQLException, ClassNotFoundException{
        if (laConexion == null) {
            laConexion = new ConexionBD();
        }
        return laConexion;
    }

    public void cerrar() throws SQLException {
        conexion.close();
    }

    public ResultSet ejecutaRecuperacion(String sql) throws SQLException {

        java.sql.Statement st = conexion.createStatement();

        ResultSet resultado = st.executeQuery(sql);

        return resultado;
    }
    
     public void ejecutaInserta(String sql) throws SQLException {

        Statement st = conexion.createStatement();

        st.executeUpdate(sql);
    }
    
}
