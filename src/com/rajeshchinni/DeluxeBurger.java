package com.rajeshchinni;

public class DeluxeBurger extends Hamburger {


//    public DeluxeBurger(String breadRollType, String meat, String name, double price) {
//        super(breadRollType, meat, name, price);
//    }



    //constructor
    public DeluxeBurger() {       // no paramaters
        super("White", "Sausage & Bacon", "Deluxe", 14.54);
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drinks",1.81);
    }

    //method override
    @Override
    public void addHamburgerAddition1(String name, double price) {
        //super.addHamburgerAddition1(name, price); // this comes by default
        System.out.println(" Cannot add any items to Deluxe burger");  //as no additions are allowed

    }

    //method override
    @Override
    public void addHamburgerAddition2(String name, double price) {
        //super.addHamburgerAddition2(name, price); // this comes by default
        System.out.println(" Cannot add any items to Deluxe burger"); //as no additions are allowed
    }

    //method override
    @Override
    public void addHamburgerAddition3(String name, double price) {
        //super.addHamburgerAddition3(name, price); // this comes by default
        System.out.println(" Cannot add any items to Deluxe burger");  //as no additions are allowed

    }

    //method override
    @Override
    public void addHamburgerAddition4(String name, double price) {
        //super.addHamburgerAddition4(name, price); // this comes by default
        System.out.println(" Cannot add any items to Deluxe burger");  //as no additions are allowed

    }
}
