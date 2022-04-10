/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerobjetos;

/**
 *Se define la clase Dog.
 * @author Wilson Pachon
 */
public class Dog {

    /**
     * Se definen los atributos de la clase.
     */
    private String breed;
    private String name;
    public String color;
    public int age;
    
    
    
/**
 * 
 * @return obtiene la raza del perro
 */
    public String getBreed() {
        return breed;
    }
    
/**
 * se establece el valor del atributo breed.
 * @param breed se pasa como parametro la raza del perro.
 */
    public void setBreed(String breed) {
        this.breed = breed;
    }

 /**
 * 
 * @return nombre del perro
 */
    public String getName() {
        return name;
    }
    
/**
 * se define el nombre del perro.
 * @param name nombre del perro.
 */
    public void setName(String name) {
        this.name = name;
    }
    
    
/**
 * metodo ladrar genera un mensaje por consola.
 */
    protected void bark() {
        System.out.println("el perro ladra mucho");
    }

}
