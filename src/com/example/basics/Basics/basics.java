package com.example.basics.Basics;

import java.util.ArrayList;
import java.util.Arrays;

public class basics {
    public static void main(String[] args) {

        System.out.println("Hello");

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

       ArrayList<Integer> test = new ArrayList<Integer>(5);
       test.add(1);
       test.add(2);
       test.add(3);

        System.out.println(test);
        System.out.println(Arrays.toString(arr));

    }
}
