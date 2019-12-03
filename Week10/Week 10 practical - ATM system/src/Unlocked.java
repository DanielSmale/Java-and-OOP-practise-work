/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsmale
 */
public class Unlocked implements IState{

    
    @Override
    public void EnterPin(ATM atm){
        System.out.println("Pin already entered");
        atm.setState(this);
    }
    
            
    @Override
    public void DispenseCash(ATM atm){
        System.out.println("Cash withdrawn going to locked state - card ejected");
        atm.setState(new Locked());
    }
    
    
    public void PrintState(){
        System.out.println("I am unlocked");
    }
    
    
    
    
}
