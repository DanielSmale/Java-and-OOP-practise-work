/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;

import stocktracker.stockdatamodel.*;

/**
 *
 * @author dsmale
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StockItem objTestItem1 = new PhysicalStockItem("Starcraft Manual");
        StockItem objTestItem2 = new PhysicalStockItem("Halo 3", 100);
        StockItem objTestItem3 = new ServiceStockItem("Delivery");

// test 1
        if (objTestItem1.getItemType() == StockType.PHYSICALITEM) {
            System.out.println("Item 1 is a PHYSICAL stock item");

        } else {
            System.out.println("Item 1 is a SERVICE stock item");

        }

        //test 2
        if (objTestItem2.getItemType() == StockType.PHYSICALITEM) {
            System.out.println("Item 2 is a PHYSICAL stock item");
        } else {
            System.out.println("Item 2 is a SERVICE stock item");
        }

        //item 3
        if (objTestItem3.getItemType() == StockType.PHYSICALITEM) {
            System.out.println("Item 3 is a PHYSICAL stock item");
        } else {
            System.out.println("Item 3 is a SERVICE stock item");
        }

        
        //Test the obsever pattern is working
        StockItem physicalItemTest = new PhysicalStockItem("The monster mash cd",1000);
        StockItem serviceItemTest = new ServiceStockItem("The monster mash digital copy",0);
        AnObserver observer = new AnObserver();
                
        
        physicalItemTest.registerObserver(observer);
        serviceItemTest.registerObserver(observer);
        
        System.out.println("Changing quantity of the physical stock item");
        physicalItemTest.setQuanityInStock(500);
        System.out.println("Changing price of the service stock item");
        serviceItemTest.setSellingPrice(1000.00);
        
        
    }
}
