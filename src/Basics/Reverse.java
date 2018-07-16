package Basics;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        String your_drink;

        //System.out.println(reverse("oliveira"));

        String s = "GeeksForGeeks";
        String reverse = "";

        char[] try1 = s.toCharArray();

        for(int i= try1.length-1; i>0; i--){
            reverse = reverse + try1[i];
        }

        System.out.println(reverse);

    }

    public static ArrayList<Character> reverse(String s){
        char[] try1 = s.toCharArray();
        ArrayList<Character> result = new ArrayList<Character>();


        for(int i= try1.length-1; i>0; i--){

            System.out.println(try1[i]+" ");

        }

        return result;
    }
}