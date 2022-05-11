import java.util.Arrays;

public class Remove_element {


    public static void main(String[] args) {

        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original array:" + Arrays.toString(array));

        //Remove the third element (index 3 = 15) from array
        int removeIndex = 3;

        for (int i = removeIndex; i < array.length - 1; i++) {
            array[i] = array[i + 1];

        }
        System.out.println("After removing the third element: " + Arrays.toString(array));
        //we cannot reduce the size of an array so after removing the element the last and second element in array will be repeated
    }
}