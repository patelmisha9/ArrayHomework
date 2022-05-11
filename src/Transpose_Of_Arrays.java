public class Transpose_Of_Arrays
{


    public static void main(String[] args) {

        int original[][] = {{2, 4, 7}, {6, 4, 9}, {3, 4, 5}};
        //creating another matrix to store transpose of a matrix
        int transpose[][] = new int[3][3];  //3 rows and 3 columns

// transpose a matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = original[j][i];
            }
        }

        System.out.println("Matrix without transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();//to give new line
        }
        System.out.println("Matrix After Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();// to new line

        }
    }
}