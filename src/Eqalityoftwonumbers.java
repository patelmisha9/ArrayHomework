import java.util.Arrays;
import java.util.Scanner;

public class Eqalityoftwonumbers {


    public static void main(String[] args){

       int[] arr1 = {2,3,4,5};
       int[] arr2 = {2,3,4,5};

        boolean result = (Arrays.equals(arr1, arr2));
        System.out.println("Arrays are equal? " + result);

    }

}
