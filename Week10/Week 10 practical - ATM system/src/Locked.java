/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsmale
 */
public class Locked implements IState {

    @Override
    public void EnterPin(ATM atm) {
        System.out.println("Pin entered correctly going to unlocked state");
        atm.setState(new Unlocked());
    }

    @Override
    public void DispenseCash(ATM atm){
    System.out.println("In locked state cash can't be withdrawn");
    atm.setState(this);
    }
    
    
    @Override
    public void PrintState(){
        System.out.println("Locked");
    }
    
}
