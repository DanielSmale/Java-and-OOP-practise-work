/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker.stockdatamodel;

import utilties.IObserver;

/**
 *
 * @author dsmale
 */
public class AnObserver implements IObserver {
    
    @Override
    public void Update(){
        System.out.println("State change was detected!!!");
    }
    
}
