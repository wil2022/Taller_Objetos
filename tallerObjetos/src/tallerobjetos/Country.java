/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerobjetos;

import java.util.ArrayList;

/**
 * Definicion de la clase Country.
 * @author Wilson Pachon
 */

public class Country {
    
    /**
     * Atributos definidos para la clase.
     */
    private String nameCountry;
    private String capitalCity;
    public String currency;
    protected int pupulation;

    /**
     * 
     * @return nombre del pais.
     */
    
    public String getNameCountry() {
        return nameCountry;
    }

 /**
 * establecer el nombre del pais.
 * @param nameCountry se pasa como parametro el nombre del pais.
 */
    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }
    
/**
 * obtener las exportaciones que realiza el pais.
 * @param exports arreglo con las diferentes exportaciones.
 * @return lista de exportaciones.
 */
    protected ArrayList<String> Exports(ArrayList<String> exports){
        return exports;
        
    }
    
    /**
     * Muestra las importaciones que realiza el pais.
     * @param imports arreglo con las importaciones del pais.
     */
    
    private void Imports(ArrayList<String> imports){
        
        System.out.println("Recursos importados por el pais " + imports);
        
    }
    
    
    
}
