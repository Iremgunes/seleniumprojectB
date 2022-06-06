package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

public class Singleton {

    //1- create private constructor
    private Singleton(){}

    //2- create private static String
    //prevent access and provide a getter method
    private static String word;

    public static String getWord(){

        if(word == null){
            System.out.println("first time call. word object is null " +
                    "assigning value to it now");
            word ="something";
        }else {
            System.out.println("word already has value");
        }

        return word;
    }





}
