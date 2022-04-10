/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerobjetos;

/**
 *Se genera la clase CuentaBancaria
 * @author Wilson Pachon
 */
public class BankAccount {
    
    /**
     * atributos de la clase BankAccount
     */
    
    private int accountNumber;
    protected boolean activated;

    
    /**
     * 
     * @return obtiene el estado de la cuenta
     */
    public boolean getActivated() {
        return activated;
    }

    /**
     * se define el estado de la cuenta.
     * @param activated se pasa como parametro un valor booleano.
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
    
    
    
}
