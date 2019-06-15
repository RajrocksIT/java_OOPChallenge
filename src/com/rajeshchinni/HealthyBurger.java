package com.rajeshchinni;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

//    public HealthyBurger(String breadRollType, String meat, String name, double price,
//                         String healthyExtra1Name, double healthyExtra1Price, String healthyExtra2Name,
//                         double healthyExtra2Price) {
//        super(breadRollType, meat, name, price);
//        this.healthyExtra1Name = healthyExtra1Name;
//        this.healthyExtra1Price = healthyExtra1Price;
//        this.healthyExtra2Name = healthyExtra2Name;
//        this.healthyExtra2Price = healthyExtra2Price;
//    }

    //constructor
    public HealthyBurger(String meat, double price) { // remember meat and price are from Hamburger class
        super("Brown Rye", meat, "Healthy", price);
    }

    //method
    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    //method
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    //method override
    @Override
    public double itemizeHamburger() {
        // return super.itemizeHamburger();  // this comes by default
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null){
            hamburgerPrice = hamburgerPrice + this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }

        if (this.healthyExtra2Name != null){
            hamburgerPrice = hamburgerPrice + this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }

        return hamburgerPrice;
    }
}
