package com.example.javabasics;

public class Main {

    public static void main(String[] args){

        //Variables

        //Integer

        int age = 20;

        System.out.println(10 * age);

        System.out.println(age * 5);

        long myLong = 10;

        System.out.println(myLong / 5);

        int x = 5;
        int y = 11;

        //Double - Float

        System.out.println(y / x);

        double z = 5.0;
        double a = 11.0;

        System.out.println(a / z);

        float myFloat = 10.0f;

        //practise

        double pi = 3.14;

        int r = 5;

        double cevre = 0;

        cevre = 2 * pi * r;

        System.out.println(cevre);

        //String tanımlama

        String name = "Mayk";
        String surname = "Tatas";

        String fullname = name + " " + surname;

        System.out.println(name);
        System.out.println(surname);

        System.out.println(fullname);

        //Boolean

        boolean isAlive = true;
        isAlive = false;

        System.out.println(isAlive);

        //Final

        final int myInteger = 5;

        System.out.println("myInteger: " + myInteger);

        //myInteger = 4;

        System.out.println("myInteger: " + myInteger);


    }

}
