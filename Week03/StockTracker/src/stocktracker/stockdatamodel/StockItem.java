/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker.stockdatamodel;

/**
 *
 * @author dsmale
 */
public class StockItem {

    private String name = "UNKNOWN";
    private Integer quanityInStock = 0;
    private Double sellingPrice = 1000.0;
    private Double costPrice = 1000.0;

    /* Rules
    Name: This must exist and cannot be an empty string
Quantity in stock: This cannot be a negative number and must exist
Selling Price: This cannot be a negative number, must be greater or equal to
cost price and must exist
Cost Price: This cannot be a negative number and must exist
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public Integer getQuanityInStock() {
        return quanityInStock;
    }

    public void setQuanityInStock(Integer quanityInStock) {
        if (quanityInStock != null && quanityInStock >= 0) {
            this.quanityInStock = quanityInStock;
        }
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        if (sellingPrice != null && sellingPrice >= 0 && sellingPrice > this.costPrice) {
            this.sellingPrice = sellingPrice;
        }
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Boolean isInStock(){
        Boolean inStock = false;
        if(this.quanityInStock >0){
            inStock = true;
        }
        return inStock;
    }
    
}
