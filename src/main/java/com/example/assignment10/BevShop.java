package com.example.assignment10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BevShop implements BevShopInterfce {

    int MIN_AGE_FOR_ALCOHOL = 21;  //Minimum age for offering alcohol drink
    int MAX_ORDER_FOR_ALCOHOL= 3;
    List orderList = new ArrayList();

    Order time;
    Order day;
    Order costumer;
    Order Smoothie, Coffee, Alcohol;


    @Override
    public boolean validTime(int time) {
        if (time > 8 && time < 23) return true;
        else return false;
    }

    @Override
    public boolean eligibleForMore() {
        if(getCurrentOrder())
        return false;
    }

    @Override
    public boolean getMinAgeForAlcohol(int age) {
       MIN_AGE_FOR_ALCOHOL = age;
        if (MIN_AGE_FOR_ALCOHOL == 21) return true;
        else
            return false;
    }

    @Override
    public void startNewOrder(int time, DAY day, String customerName, int customerAge) {

    }

    @Override
    public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {

    }

    @Override
    public void processAlcoholOrder(String bevName, SIZE size) {

    }

    @Override
    public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtein) {

    }

    @Override
    public int findOrder(int orderNo) {
        return (int) orderList.get(orderNo);
    }

    @Override
    public double totalOrderPrice(int orderNo) {
        return 0;
    }

    @Override
    public double totalMonthlySale() {
        return 0;
    }

    @Override
    public void sortOrders() {

    }

    @Override
    public Order getOrderAtIndex(int index) {
        return null;
    }


    @Override
    public String toString() {

        for (int i = 0; i > orderList.size(); i++){
            orderList = Collections.singletonList(getOrderAtIndex(i) + " " + totalMonthlySale());
    }
        return String.valueOf(orderList);
    }

    public boolean getMaxOrderForAlcohol() {
        if(MAX_ORDER_FOR_ALCOHOL == 3) return true;
       else return false;
    }

    public OrderInterface getCurrentOrder() {
    }
}
