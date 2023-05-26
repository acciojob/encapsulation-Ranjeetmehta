package com.driver;

public class Main {

    public static void main(String[] args) {


        RWOnly obj=new RWOnly();
        // RWOnly obj1=new RWOnly();



        obj.setName("Ranjeet");


        String name=obj.getName();


        System.out.println(name);




    }

}