/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploJavaSwingMVC.Vista;

/**
 *
 * @author laura
 */
public class GestorVentanas {
    
    public static void abrirPantallaSaludo(String user, String pass, VHelloWorld vista){
        vista.dispose();
        new VSaludar(user, pass).setVisible(true);
        
    }
    
}
