package pubsimulation;


import pubsimulation.Mixed;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsmale
 */
public class Cocktail extends Mixed {

    @Override
    public void AddSpirit() {
        System.out.println("TWO VODKA SHOTS");
    }

    @Override
    public void AddGarnish() {
        System.out.println("Add fancy and expensive garnish");
    }

}
