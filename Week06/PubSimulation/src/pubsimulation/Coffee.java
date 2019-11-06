/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsimulation;

/**
 *
 * @author dsmale
 */
public class Coffee extends Hot{

    @Override
    public void AddHotWater() {
        System.out.println("Waters flavour is its temperature; this one is spicy");
        System.out.println("Add coffee");
    }
    
    
    @Override
    public void AddFinishingTouch() {
        System.out.println("Add milk but no sugar cause their already sweet enough");
        
    }
    
    
            
    
}
