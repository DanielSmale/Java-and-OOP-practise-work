/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel;

import PubModel.Strategies.IDrinksStrategy;
/**
 * A class for the landlords. 
 * 
 * @author sthill and a.rahat
 */
public class Landlord extends DrinksFactory{
    
        /**
     * The constructor for Landlord class. It sets the initial strategy to null. 
     */
    public Landlord() {
        this.strategy = null;
    }
    
    /**
     * An accessor method for the strategy property. 
     * @param strategy An IDrinksStrategy object
     */
    
    
    /**
     * A static factory method for creating strategies. 
     * 
     * @param drinkType The type of drink from the user.
     * @return Selected strategy.
     */
    public static IDrinksStrategy selectStrategy(String drinkType){
        IDrinksStrategy strategy;
        switch (drinkType) {
            case "Pint":
                strategy = new PubModel.Strategies.TapStrategy();
                break;
            case "Bottle":
                strategy = new PubModel.Strategies.BottleStrategy();
                break;
            case "Tea":
                strategy = new PubModel.Strategies.TeaStrategy();
                break;
            case "Coffee":
                strategy = new PubModel.Strategies.CoffeeStrategy();
                break;
            case "Long Drink":
                strategy = new PubModel.Strategies.LongDrinkStrategy();
                break;
            case "Cocktail":
                strategy = new PubModel.Strategies.CocktailStrategy();
                break;
            default:
                strategy = new PubModel.Strategies.DefaultStrategy();
                break;
        }
        return strategy;
    }
    
    /**
   
    /**
     * A method that calls upon the strategy instance for serving drinks. 
     * 
     * @return an information string for the clients once the drink has been 
     * prepared. 
     */
    public String serveDrink() {
    
        if (this.strategy == null) {
            return getNullStrategyInfo();
        } else {
            return this.strategy.serveDrink();
        }
    }
    

}
