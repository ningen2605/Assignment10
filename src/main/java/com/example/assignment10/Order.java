package com.example.assignment10;
import java.util.Random;

public class Order implements OrderInterface, Comparable {



    private int orderNumber;
    private int orderTime;
    private DAY orderDay;
    private Beverage Coffee, Smoothie, Alcohol;
    private String Name;
    private int Age;
    private Customer costumer1;

    public void randNumGen(){
        int r;
       Random rand = new Random();
       r = rand.nextInt(10000 - 90000) + 10000;
    }

    public Order(int ON, DAY OD, Customer costumer)
    {
        orderNumber = ON;
        orderDay = OD;
        Name = costumer.getName();
        Age = costumer.getAge();
        costumer1 = costumer;
    }
    @Override
    public Beverage getBeverage(int itemNo) {
        return null;
    }

    public DAY getOrderDay() {
        return orderDay;
    }

    public int getOrderTime() {
        return orderTime;
    }
    @Override
    public boolean isWeekend() {
        if (getOrderDay().equals(DAY.SATURDAY) | getOrderDay().equals( DAY.SUNDAY))return true;
        else return false;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public void addNewBeverage(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {

    }

    @Override
    public void addNewBeverage(String bevName, SIZE size) {

    }

    @Override
    public void addNewBeverage(String bevName, SIZE size, int numOfFruits, boolean addProtein) {

    }
@Override
public String toString(){
        return getOrderNumber() + " " + getOrderTime() + " " + getOrderDay() + " " + Name + " " + Age + " " + Alcohol + " " + Coffee + " " + Smoothie;
}
    @Override
    public double calcOrderTotal() {
        return 0;
    }

    @Override
    public int findNumOfBeveType(TYPE type) {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        if( orderNumber == getOrderNumber())return 0;
        else if(orderNumber > getOrderNumber())return 1;
        else return 1;
    }

    public int getTotalItems() {
    }

    public char[] getOrderNo() {
    }

    public Customer getCustomer() {
    }
}
