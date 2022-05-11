public class Ascendingorderarray {

    public static void main(String[] args) {

        int[] a = {12, 40, 10, 9, 2};
        int temp = 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length; j++) {

                if (a[i] > a[j]) {

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }
        System.out.print("The ascending order of arrays is ");

        for (int i = 0; i < a.length; i++) {

            System.out.print(" " + a[i] + " ");
        }
    }
}