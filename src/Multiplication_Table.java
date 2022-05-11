public class Multiplication_Table {

    public static void main(String[] args) {

        int[] tk = {1, 2, 3};

        for (int i = 1; i <= tk.length; i++) {

            int j = 1;
            do {
                int a = i * j;
                j++;
                System.out.print(" " + a + " ");

            } while (j <= 10);
            System.out.println(" ");
            j = 1;
        }

    }
}
