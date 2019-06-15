package com.rajeshchinni;

public class Hamburger {

    private String breadRollType;
    private String meat;
    private String name;
    private double price;

    // line 5 to 8 go to constructor

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

//    public Hamburger(String breadRollType, String meat, String name, double price, String addition1Name,
//                     double addition1Price, String addition2Name, double addition2Price, String addition3Name,
//                     double addition3Price, String addition4Name, double addition4Price) {
//        this.breadRollType = breadRollType;
//        this.meat = meat;
//        this.name = name;
//        this.price = price;
//        this.addition1Name = addition1Name;
//        this.addition1Price = addition1Price;
//        this.addition2Name = addition2Name;
//        this.addition2Price = addition2Price;
//        this.addition3Name = addition3Name;
//        this.addition3Price = addition3Price;
//        this.addition4Name = addition4Name;
//        this.addition4Price = addition4Price;
//    }

        //constructor
        public Hamburger(String breadRollType, String meat, String name, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.name = name;
        this.price = price;
    }

    //method
    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    //method
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    //method
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    //method
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    //method
    public double itemizeHamburger(){
        double hamburgerPrice = this.price; // base price
        System.out.println(this.name + " hamburger " + "on a " + this.breadRollType + " roll" +
                " with " + this.meat + ", price is " + this.price);
        if (this.addition1Name != null){
            hamburgerPrice = hamburgerPrice + this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }

        if (this.addition2Name != null){
            hamburgerPrice = hamburgerPrice + this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }

        if (this.addition3Name != null){
            hamburgerPrice = hamburgerPrice + this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }

        if (this.addition4Name != null){
            hamburgerPrice = hamburgerPrice + this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }

        return hamburgerPrice;
    }










}
