
package com.udacity.model;


public class InvoiceLine {
    private String itemName; 
    private double itemPrice;
    private int itemCount; 
    private InvoiceHeader header;

    public InvoiceLine(String itemName, double itemprice, int itemCount, InvoiceHeader header) {
        this.itemName = itemName;
        this.itemPrice = itemprice;
        this.itemCount = itemCount;
        this.header = header;
    }
    
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemprice() {
        return itemPrice;
    }

    public void setItemprice(double itemprice) {
        this.itemPrice = itemprice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public InvoiceHeader getHeader() {
        return header;
    }

    public void setHeader(InvoiceHeader header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "itemName=" + itemName + ", itemprice=" + itemPrice + ", itemCount=" + itemCount + '}';
    }           
    public double getLineTotal() { 
        return itemCount * itemPrice;   
        
}
}