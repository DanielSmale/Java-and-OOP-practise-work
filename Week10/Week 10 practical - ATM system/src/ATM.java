/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsmale
 */
public class ATM {
    private IState state;
    public ATM(IState state){
        this.state = state;
    }
     public void setState(IState state){
        this.state = state;
    }
    public void EnterPin(){
        state.EnterPin(this);
    }
    
    public void DispenseCash(){
        state.DispenseCash(this);
    }
    public void printState(){
        this.state.PrintState();
    }
    
}
