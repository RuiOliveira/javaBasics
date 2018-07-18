package Basics;

import com.sun.tools.javac.file.SymbolArchive;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class FizzBuzz {
    public static void main(String[] args) {

        //FizzBuzz ---- multiple de 3 e 5
        //Fizz     ---- multiple of 5
        //Buzz     ---- multiple of 3


        for(int i = 1; i<=15; i++){
            if(i % 5 == 0){
                if(i % 3 == 0){
                    System.out.println("FizzBuzz " + "Multiple of 3 and 5 " + i);
                }else System.out.println("Fizz " + "Multiple of 5 " + i);
            }
            else if(i % 3 == 0){
                System.out.println("Buzz " + "Multiple of 3 " + i);
            }
        }
    }
}