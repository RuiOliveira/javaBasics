package Basics;

public class LetterCapitalize {
    public static void main(String[] args) {

        //test("hello world from coderbyte");

        Integer[] arr = new Integer[] {1,2,3,4,5,6,7,8,9};

        System.out.println(arr[0]);

    }

    public static String[] test(String str){

        String[] words = str.split(" ");
        for(int i = 0; i< words.length; i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
        }

        return words;

    }

}
