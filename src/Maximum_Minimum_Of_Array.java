public class Maximum_Minimum_Of_Array {


    public static void main(String[] args) {

        int[] a = {30, 60, 50, 20, 90};

        int max = a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum element in array is: " + max);

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum element in array is: " + min);
    }

}
