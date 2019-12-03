/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsmale
 */
public interface IState {
    
    public void EnterPin(ATM atm);
    public void DispenseCash(ATM atm);
    public void PrintState();   
    
}
