/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerobjetos;

/**
 *Creacion de la clase SmartPhone.
 * @author Wilson Pachon
 */
public class SmartPhone {
    /**
     * Atributos de la clase.
     */
    private String brand;
    public float weight;
    public float screenSize;
    protected int cellNumber;
    
    /**
     * 
     * @return retorna numero de celular.
     */
    
    public int getCellNumber() {
        return cellNumber;
    }
/**
 * se define el numero celular.
 * @param cellNumber numero de celular.
 */
    public void setCellNumber(int cellNumber) {
        this.cellNumber = cellNumber;
    }
    
   /**
    * metodo para validar si es posible tomar una foto.
    * @param activated valor booleano
    * @return mensaje de confirmacion.
    */ 
    
    private String takePhoto(boolean activated){
         
        String s;
        if(activated){
            s = "puede tomar una foto";            
        }else{
            s = "la camara no esta activada";
        }
        return s;
    }
        
    
}
