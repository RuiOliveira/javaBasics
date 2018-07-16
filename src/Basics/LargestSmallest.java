package Basics;

import org.omg.CORBA.INTERNAL;

public class LargestSmallest {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,0,10,15,200,1000, 30000};

        int small = arr[0];
        int max = 0, min = 0;

        for (int i=0; i<arr.length; i++){
            //max
            if(arr[i]>small){
                max = arr[i];
            }else if(arr[i]<=small){
                min = arr[i];
            }
        }

        System.out.println("Max: " + max + " Min: " + min);
    }
}
