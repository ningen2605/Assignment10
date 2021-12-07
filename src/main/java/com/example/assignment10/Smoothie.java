package com.example.assignment10;

public class Smoothie extends Beverage{

    private boolean protein;
    private boolean fruit;
    private final double priceOfFruit = .50;
    private final double priceOfProtein = 1.50;

    public Smoothie(String detox, SIZE medium, int i, boolean b)
    {
        this.protein = false;
        this.fruit = false;
    }

    public Smoothie (boolean extraProtein, boolean extraFruit)
    {
        this.protein = extraProtein;
        this.fruit = extraFruit;
    }


    public void setProtein(boolean extraCoffeeShot)
    {
        this.protein = extraCoffeeShot;
    }
    public void setFruit(boolean extraSyrupShot)
    {
        this.fruit = extraSyrupShot;
    }
    public boolean getProtein()
    {
        return this.protein;
    }
    public boolean getFruit()
    {
        return this.fruit;
    }

    @Override
    public String toString()
    {
        return  "Smoothie" + " " + super.getBevSize() + " " + getProtein() + " " + getFruit();
    }
    @Override
    public double calcPrice()
    {
        if(getProtein() == true && getFruit() == true)
            return super.calcPrice() + priceOfProtein + priceOfFruit;
        else if (getProtein() == false && getFruit() == true)
            return super.calcPrice() + priceOfFruit;
        else return super.calcPrice();
    }
    @Override
    public boolean equals(Object obj)
    {
        return(super.equals(obj));
    }

    public char[] getNumOfFruits() {
    }
}
