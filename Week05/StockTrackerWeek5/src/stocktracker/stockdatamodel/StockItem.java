/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker.stockdatamodel;

import java.util.ArrayList;
import utilties.IObserver;
import utilties.ISubject;

/**
 *
 * @author dsmale
 */
public abstract class StockItem implements ISubject {

    protected String name = "UNKNOWN";
    protected Integer quanityInStock = 0;
    protected Double sellingPrice = 1000.0;
    protected Double costPrice = 1000.0;
    private ArrayList<IObserver> observers = null;

    /* Rules
    Name: This must exist and cannot be an empty string
Quantity in stock: This cannot be a negative number and must exist
Selling Price: This cannot be a negative number, must be greater or equal to
cost price and must exist
Cost Price: This cannot be a negative number and must exist
     */
    // constructors
    public StockItem() {

    }

    public StockItem(String name) {

        this.name = name;
    }

    public StockItem(String name, Integer qty) {
        this.name = name;
        this.quanityInStock = qty;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
            notifyObservers();
        }
    }

    public Integer getQuanityInStock() {
        return quanityInStock;
    }

    public void setQuanityInStock(Integer quanityInStock) {
        if (quanityInStock != null && quanityInStock >= 0) {
            this.quanityInStock = quanityInStock;
        }
                                notifyObservers();
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        if (sellingPrice != null && sellingPrice >= 0 && sellingPrice > this.costPrice) {
            this.sellingPrice = sellingPrice;
        }
                                notifyObservers();
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
                    notifyObservers();
    }

    public Boolean isInStock() {
        Boolean inStock = false;
        if (this.quanityInStock > 0) {
            inStock = true;
        }
        return inStock;
    }

    public abstract StockType getItemType();

    @Override
    public Boolean registerObserver(IObserver o) {
        Boolean blnAdded = false;
        //Validate that observer exists
        if (o != null) {
            // if observer list not initialised create it
            if (this.observers == null) {
                this.observers = new ArrayList<>();
            }
            //add the observer to the list of register observers
            blnAdded = this.observers.add(o);

        }
        return blnAdded;
    }

    @Override
    public Boolean removeObserver(IObserver o) {

        boolean successfullyRemoved = false;
        
        if(o != null) // if observer exists
        {
            successfullyRemoved = observers.remove(o);
        }
        
        return successfullyRemoved;
    }

    
    @Override
    public void notifyObservers() {
        // Ensure we have a valid list of observers
        if (this.observers != null && this.observers.size() > 0) {
            // start foreach loop if theres stuff to observe
            for (IObserver currentObserver : this.observers) {
                // call update on this observer
                currentObserver.Update();
            }
        }

    }

}
