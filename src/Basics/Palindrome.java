package Basics;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("oo"));
    }


    private static String isPalindrome(String inputWord){

        String reverseWord = "";
        inputWord = inputWord.toLowerCase();

        for(int i = inputWord.length() -1;  i>=0;  i--){
            reverseWord = reverseWord + inputWord.charAt(i);
        }

        if (inputWord.equals(reverseWord)){
            return "The word is Palindrome";
        }else{
            return "The word is not Palindrome";
        }

    }
}
