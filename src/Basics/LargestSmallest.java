package Basics;

import org.omg.CORBA.INTERNAL;
import sun.tools.tree.ArrayAccessExpression;

import java.util.Arrays;

public class LargestSmallest {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{105528,23,10,15,200,1000, 300};

        int maximum = arr[0];
        int minimum = arr[0];

        //Arrays.sort(arr);

        for (int i=1; i<arr.length; i++){
            //max
            //System.out.println(arr[i]);

            if(arr[i]>maximum){
                maximum = arr[i];
            }else if(arr[i]<minimum){
                minimum = arr[i];
            }
        }

        System.out.println("Max: " + maximum + " Min: " + minimum);
    }
}
