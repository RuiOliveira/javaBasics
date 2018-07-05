package com.example.strings.Strings;

public class strings {
    public static void main(String[] args) {
        String str = "Hello Rui Test Test";
        char[] charArray = str.toCharArray();

        for(int i = 0; i<charArray.length; i++){
            System.out.println(charArray[i]);
        }

        for(char c : charArray){
            System.out.print(c);
        }
    }
}
