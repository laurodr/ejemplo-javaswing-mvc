/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploJavaSwingMVC.Modelo;

import EjemploJavaSwingMVC.Datos.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author laura
 */
public class GestorUsuarios {
    
    public static void insertarUsuario(String username, String password) throws SQLException, ClassNotFoundException{
        String query = "INSERT INTO USUARIO (USERNAME, PASSWORD)"+" VALUES ('" + username + "','" + password + "')";
        ConexionBD.getInstancia().ejecutaInserta(query);
    }
    
    public static Usuario recuperarUsuario(String username) throws SQLException, ClassNotFoundException{
        
        String password = "";
        ResultSet resultado;
        
        String query = "SELECT * FROM USUARIO WHERE USERNAME=";
        query = query + "'" + username + "'";
        
        resultado = ConexionBD.getInstancia().ejecutaRecuperacion(query);
        
        while (resultado.next()) {
            password = resultado.getString("PASSWORD");
        }
        
        return new Usuario(username, password);
    }
    
}
