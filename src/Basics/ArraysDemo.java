package Basics;

public class ArraysDemo {

    public static void main(String[] args) {
        int a[] = new int[3];
        int b[] = new int[] {1,2,3,4,5,6,7};

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
