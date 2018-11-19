/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

/**
 *
 * @author tobia
 */
public class Inmobiliaria {

    
    public static void main(String[] args) {
       Persona persona1; 
       persona1 = new Persona("Jose", 534534234, 453453);
       
       Persona persona2;
       persona2 = new Persona("Juan", 34324, 4234);
       Conectar conect = new Conectar();
       
       PersonaData data= new PersonaData(conect);
       
      data.buscarPersona("juan");
       
      
              
       
       
    }
    
}
