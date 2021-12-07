package com.example.assignment10;

public class Alcohol extends Beverage {
    private boolean weather;
    private boolean weekends;
    private final double ifWeekend = .60;

    public Alcohol()
    {
        this.weather = false;
        this.weekends = false;
    }

    public Alcohol (boolean extraProtein, boolean extraFruit)
    {
        this.weather = extraProtein;
        this.weekends= extraFruit;
    }

    public Alcohol(String a1Name, SIZE small, boolean b) {
        super();
    }


    public void setWeather(boolean extraCoffeeShot)
    {
        this.weather = extraCoffeeShot;
    }
    public void setWeekends(boolean extraSyrupShot)
    {
        this.weekends = extraSyrupShot;
    }
    public boolean getWeather()
    {
        return this.weather;
    }
    public boolean getWeekends()
    {
        return this.weekends;
    }

    @Override
    public String toString()
    {
        return  "Alcohol" + " " + super.getBevSize() + " " + getWeather() + " " + getWeekends();
    }
    @Override
    public double calcPrice()
    {
        if(getWeather() == true||getWeekends() == true)
            return super.calcPrice() + ifWeekend;
        else if (getWeather() == false && getWeekends() == true)
            return super.calcPrice() + ifWeekend;
        else return super.calcPrice();
    }
    @Override
    public boolean equals(Object obj)
    {
        return(super.equals(obj));
    }

    public double getBasePrice() {
        return calcPrice();
    }
}
