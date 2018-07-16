package Basics;

import java.util.Scanner;

public class Triangule {

    public static void main(String[] args) {
        //Triangle exercice
        float a, b, c;
        Scanner scan = new Scanner(System.in);

        System.out.println("A");
        a = scan.nextFloat();

        System.out.println("B");
        b = scan.nextFloat();

        System.out.println("C");
        c = scan.nextFloat();

        if((a>b+c) || (b>a+c) || (c>b+a)){
            System.out.println("This is not a triangle!");
        }
        else if ((a==b) && (b==c)){
            System.out.println("Equilateral Triangle");
        }
        else if ((a==b) || (b==c) || (a==c)){

        }
        else if ((a!=b) && (b!=c) && (a!=c)){
            System.out.println("Scalene Triangle");
        }

    }
}
