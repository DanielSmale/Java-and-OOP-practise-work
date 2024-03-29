/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModel;

import PubModel.Strategies.IDrinksStrategy;

/**
 *
 * @author dsmale
 */
public abstract class DrinksFactory {

    // instance variables
    public IDrinksStrategy strategy;
    private String greetings = "Hello!" + "\n"
            + "What can I get you?";
    private String offerings = "We have: Pint, Bottle, Tea, "
            + "Coffee, Long Drink, and Cocktail.";
    private String nullStrategyInfo = "You did not tell us what you would like! ";

    public void setStrategy(IDrinksStrategy strategy) {
        this.strategy = strategy;
    }

    /* An accessor method for setting the greetings property
    .
     * 
     * @param
    s A string containing greetings from a Landlord

    . 
     */
    public void setGreetings(String s) {
        greetings = s;
    }

    /**
     * An accessor method for getting the greetings property.
     *
     * @return greetings string.
     */
    public String getGreetings() {
        return greetings;
    }

    /**
     * An accessor method for setting the offerings at the establishment.
     *
     * @param s a string containing the offerings at the establishment.
     */
    public void setOfferings(String s) {
        offerings = s;
    }

    /**
     * An accessor method to extract the offerings string in the instance
     * variable.
     *
     * @return offerings string.
     */
    public String getOfferings() {
        return offerings;
    }

    /**
     * An accessor method facilitating the notification that no strategy (not
     * even the default strategy) has been set.
     *
     * @return information string for null strategy.
     */
    public String getNullStrategyInfo() {
        return nullStrategyInfo;
    }

    /**
     * An accessor method for setting the information string for the null
     * strategy.
     *
     * @param s information string for null strategy.
     */
    public void setNullStrategyInfo(String s) {
        nullStrategyInfo = s;
    }

    /**
     * A method to ask the customer -- includes both greetings and offerings in
     * the instance variables.
     *
     * @return a string to pass on to the customer.
     */
    public String askCustomer() {
        return getGreetings() + "\n" + getOfferings();
    }

}
