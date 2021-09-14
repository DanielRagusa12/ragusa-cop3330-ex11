package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class App
{
    public static void main( String[] args )
    {
        int euros;
        double exchange_rate;
        Scanner input=new Scanner(System.in);


        System.out.print("How many euros are you exchanging? ");
        euros=input.nextInt();

        System.out.print("What is the exchange rate? ");
        exchange_rate=input.nextDouble();

        double dollars=euros*exchange_rate;

        BigDecimal cent_rounding = new BigDecimal(dollars).setScale(2, RoundingMode.HALF_UP);
        double dollars_rounded = cent_rounding.doubleValue();

        System.out.print((euros) +" euros at an exchange rate of "+(exchange_rate)+ " is\n"+(dollars_rounded)+" U.S. dollars.");

    }
}

