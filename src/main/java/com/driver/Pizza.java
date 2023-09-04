package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg==true){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        price = price+80;
    }

    public void addExtraToppings(){
        if(isVeg==true){
            price = price+70;
        }
        else{
            price = price+120;
        }
    }

    public void addTakeaway(){
        price = price+20;
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
