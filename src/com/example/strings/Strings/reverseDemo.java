package com.example.strings.Strings;

public class reverseDemo {
    public static void main(String[] args) {
        String s = "Oliveira";
        String t = "";

        for(int i = s.length() -1; i>=0; i--){
            t = t + s.charAt(i);
            System.out.println(s.charAt(i));
        }

        System.out.println(t);
    }
}