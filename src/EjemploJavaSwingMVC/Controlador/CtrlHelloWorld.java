/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploJavaSwingMVC.Controlador;

import EjemploJavaSwingMVC.Modelo.GestorUsuarios;
import EjemploJavaSwingMVC.Modelo.Usuario;
import EjemploJavaSwingMVC.Vista.GestorVentanas;
import EjemploJavaSwingMVC.Vista.VHelloWorld;
import java.sql.SQLException;

/**
 *
 * @author laura
 */
public class CtrlHelloWorld {
    
    protected VHelloWorld vHelloWorld;
    protected Usuario usuario;
    
    public CtrlHelloWorld(VHelloWorld vHelloWorld){
        this.vHelloWorld = vHelloWorld;
    }
    
    public void procesarEventoSaludar() throws SQLException, ClassNotFoundException{
        String userTextField = vHelloWorld.getUsuarioTextField();
        String passTextField = vHelloWorld.getPassTextField();
        
        //Llamar al gestor de usuarios para insertar Usuario en BD
        GestorUsuarios.insertarUsuario(userTextField, passTextField);
        
        //Llamar al gestor de usuarios para recuperar Usuario de BD
        usuario = GestorUsuarios.recuperarUsuario(userTextField);
        
        GestorVentanas.abrirPantallaSaludo(usuario.getUsername(), usuario.getPassword(), vHelloWorld);
        
        
    }
}
