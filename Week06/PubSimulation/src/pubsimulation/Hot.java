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
public abstract class Hot implements IPub{

    @Override
    public void ServeDrinks() {
        BoilWater();
        AddHotWater();
        PourInToMug();
        AddFinishingTouch();        
    }
    
    
    
    
    public void BoilWater(){
        System.out.println("Get the kettle on! - Boiling the water");
    }
    
    public abstract void AddHotWater();
    
    public void PourInToMug(){
        System.out.println("Pour into mug");
    }
    
    public abstract void AddFinishingTouch();
    
}
