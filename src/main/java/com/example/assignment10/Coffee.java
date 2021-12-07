package com.example.assignment10;

public class Coffee extends Beverage{
    private boolean extraShot;
    private boolean extraSyrup;
    private final double costOfExtraShot = .50;
    private final double costOfExtraSyrup = .50;

    public Coffee(String regular_coffee, SIZE small, boolean b, boolean b1)
    {
        this.extraShot = false;
        this.extraSyrup = false;
    }

    public Coffee (boolean extraCoffeeShot, boolean extraSyrupShot)
    {
        this.extraShot = extraCoffeeShot;
         this.extraSyrup = extraCoffeeShot;
    }


    public void setExtraShot(boolean extraCoffeeShot)
    {
        this.extraShot = extraCoffeeShot;
    }
    public void setExtraSyrup(boolean extraSyrupShot)
    {
        this.extraSyrup = extraSyrupShot;
    }
    public boolean getExtraShot()
    {
        return this.extraShot;
    }
    public boolean getExtraSyrup()
    {
        return this.extraSyrup;
    }

    @Override
    public String toString()
    {
      return  "Coffee" + " " + super.getBevSize() + " " + getExtraShot() + " " + getExtraSyrup();
    }
    @Override
    public double calcPrice()
    {
        if(getExtraShot() == true && getExtraSyrup() == true)
        return super.calcPrice() + costOfExtraShot + costOfExtraSyrup;
        else if (getExtraShot() == false && getExtraSyrup() == true)
            return super.calcPrice() + costOfExtraSyrup;
        else return super.calcPrice();
    }
    @Override
    public boolean equals(Object obj)
    {
     return(super.equals(obj));
    }
}
