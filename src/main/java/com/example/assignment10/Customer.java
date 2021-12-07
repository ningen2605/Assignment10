package com.example.assignment10;

public class Customer {
    private String name;
    private int age;

    public Customer(String n, int a)
    {
        this.name = n;
        this.age = a;
    }
    public Customer(Customer customer)
    {
        this.name = customer.name;
        this.age = customer.age;
    }
    public void setName(String n){
       this.name = n;
    }
    public void setAge(int a){
        this.age = a;
    }
    public String getName()
    {
   return     this.name;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public String toString(){
        return getName() + " " + getAge();
    }
}
