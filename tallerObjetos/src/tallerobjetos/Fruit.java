/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerobjetos;

import java.util.ArrayList;

/**
 * Creacion de la clase Fruta.
 *
 * @author Wilson Pachon
 */
public class Fruit {

    /**
     * atributos de la clase fruta.
     */
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    /**
     *
     * @return obtiene una lista de colores de la fruta.
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * metodo para agregar el color o los colores de la fruta a una lista.
     *
     * @param nameColor nombre del color de la fruta.
     */
    public void setColor(String nameColor) {
        colors.add(nameColor);
    }

}
