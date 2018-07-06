package Basics;

public class MultidimensionalArrays {

    public static void main(String[] args) {

        int b[][] = {{2,4,5},{3,4,7},{5,2,1}};

        for(int i = 0; i<b.length; i++){
            for(int j = 0; j<b[i].length; j++){
                System.out.println(b[i][j] + "");
            }
        }
    }
}
