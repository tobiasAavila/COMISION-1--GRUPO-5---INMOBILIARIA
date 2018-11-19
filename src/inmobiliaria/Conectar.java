package inmobiliaria;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tobia
 */
public class Conectar{
    private Connection con;
    private String url = "jdbc:mariadb://localhost/inmobiliaria";
    private String usuario = "root";
    private String contraseña = "";
    private String driver = "org.mariadb.jdbc.Driver";
    
    
   public Conectar(){
        try {
            con = null;
            
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, contraseña);
            if(con != null){
                System.out.println("Conexion Exitosa");
            }else{
                System.out.println("Conexion Fallida");
            }} catch (ClassNotFoundException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

    public Connection getCon() {
        return con;
    }
    
    
}
