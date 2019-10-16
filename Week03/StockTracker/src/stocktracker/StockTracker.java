/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;

import stocktracker.stockdatamodel.PhysicalStockItem;
import stocktracker.stockdatamodel.ServiceStockItem;

/**
 *
 * @author dsmale
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PhysicalStockItem objPhysicalItem = new PhysicalStockItem("Snuff: book by terry pratchett",0);
        ServiceStockItem objVirtualItem = new ServiceStockItem("Wintersmith: book by terry pratchett");
        
        String strMessage = objPhysicalItem.getName() + ", is in stock : " + objPhysicalItem.isInStock() + ", Qty in stock = " + objPhysicalItem.getQuanityInStock();
        
        System.out.println(strMessage);
        
        strMessage = objVirtualItem.getName() + ", is in stock : " + objVirtualItem.isInStock() + ", Qty in stock = " + objVirtualItem.getQuanityInStock();
        System.out.println(strMessage);
    }
    
}
