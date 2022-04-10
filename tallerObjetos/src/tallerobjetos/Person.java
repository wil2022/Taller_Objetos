/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerobjetos;

import java.util.Date;

/**
 * Creacion de la clase Persona.
 * @author Wilson Pachon
 */
public class Person {
    /**
     * Atributos de la clase persona.
     */
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    
    
    /**
     * 
     * @return obtiene el valor guardado en el atributo name.
     */

    public String getName() {
        return name;
    }

    /**
     * se asigna un valor al atributo name.
     * @param name nombre de la persona.
     */
    public void setName(String name) {
        this.name = name;
    }
      
    
    
    
}
