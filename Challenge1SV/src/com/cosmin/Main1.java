package com.cosmin;

import java.util.Scanner;


public class Main1 {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type 5 numbers");

        int[] array = new int[5];
        int min = array.length;
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Type a number: ");
            array[i] = reader.nextInt();


            if (min > array[i]) {

                min = array[i];

            } else if (max < array[i]) {

                max = array[i];

            }

        }

        int diff = max - min;
        System.out.println("The difference between max and min is: " + diff);

    }


}
