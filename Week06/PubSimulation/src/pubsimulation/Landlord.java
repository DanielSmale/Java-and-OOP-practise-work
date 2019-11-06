/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsimulation;

import java.util.Scanner;

/**
 *
 * @author dsmale
 */
public class Landlord {

    private IPub object;
    
    
    public void AskForDrinks() {
        System.out.println("Oi what can i get ya?!");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        boolean inPub = true;
        
        
        
        if (answer.equals("Tap")) {
            System.out.println(" One pint coming up ... ");
            object = new DrinkOnTap();
        } else if (answer.equals("Bottle")) {
            System.out.println("Bottle for you");
            object = new BottledDrink();
        } else if (answer.equals("Tea")) {
            System.out.println("Tea for you sir");
            object = new Tea();
        } else if (answer.equals("Coffee")) {
            System.out.println("Coffee!");
            object = new Coffee();
        } else if (answer.equals("Long drink")) {
            System.out.println("A long drink for ya");
            object = new LongDrink();
        } else if (answer.equals("Cocktail")) {
            System.out.println("Something strong for ya");
            object = new Cocktail();
        }
        object.ServeDrinks();
        

    }
        
        
    }

