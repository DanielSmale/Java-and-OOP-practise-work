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
public abstract class Mixed implements IPub {

    @Override
    public void ServeDrinks() {
        AddIce();
        AddSpirit();
        AddMixerToGlass();
        AddGarnish();
    }

    public void AddIce() {
        System.out.println("Add ice");
    }

    public abstract void AddSpirit();

    public void AddMixerToGlass() {
        System.out.println("Add mixer to glass");
    }

    public abstract void AddGarnish();

}
