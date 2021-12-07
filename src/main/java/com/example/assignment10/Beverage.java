package com.example.assignment10;

public class Beverage {

    private String BevName;
    private TYPE BevType;
    private SIZE BevSize;
    private final double BevPriceBase = 2.0;
    private double BevPriceSizeUp;

    public void Beverage(String name, TYPE type, SIZE size) {
        this.BevName = name;
       this.BevType = type;
        this.BevSize = size;

    }
    public void setBeverageName(String name)
    {
        this.BevName = name;
    }

    public void setBevType(TYPE type){
        this.BevType = type;
    }
    public void setBevSize(SIZE size){
        this.BevSize = size;
    }
    public String getBevName()
    {
        return this.BevName;
    }

    public TYPE getBevType(){
        return this.BevType;
    }
    public SIZE getBevSize(){
        return this.BevSize;
    }

    public double calcPrice() {
        if(BevSize == SIZE.SMALL) BevPriceSizeUp = 0.0;
        else if (BevSize == SIZE.MEDIUM) BevPriceSizeUp = 1.0;
        else BevPriceSizeUp = 2.0;
        double bevPrice = this.BevPriceBase + this.BevPriceSizeUp;
        return bevPrice;
    }

    @Override
    public String toString() {
        return this.BevName + " " + this.BevSize;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.BevName.equals(obj) && this.BevType.equals(obj) && this.BevSize.equals(obj));

    }

    public Object getType() {
    }

    public Object getSize() {
    }
}

