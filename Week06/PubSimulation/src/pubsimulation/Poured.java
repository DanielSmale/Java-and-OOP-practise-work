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
public abstract class Poured implements IPub {

    @Override
    public void ServeDrinks() {
        PrepareDrink();
        PourDrink();
    }

    public abstract void PrepareDrink();

    public void PourDrink() {

        System.out.println("Pour drink into glass");
    }

}
