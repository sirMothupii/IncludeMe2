/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sirmothupii.includeme.model;

/**
 *
 * @author sponch
 */
public class Spending {
    
    private int category;
    private String muncipality;
    private double amount;
    private String description;
    private String itemName;

    public Spending(){
        
        category = 0;
        muncipality = "none";
        amount = 0.00;
        description = "empty";
        itemName = "";
        
        
    }
    public Spending(int category, String muncipality, float amount, String description, String itemName) {
        this.category = category;
        this.muncipality = muncipality;
        this.amount = amount;
        this.description = description;
        this.itemName = itemName;
    }

    public int getCategory() {
        return category;
    }

    public String getMuncipality() {
        return muncipality;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public String getItemName() {
        return itemName;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setMuncipality(String muncipality) {
        this.muncipality = muncipality;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    
    
    
    
    
    
}
