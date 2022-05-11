public class Commonelements {

    public static void main(String[] args) {

        String[] array1 = {"One", "Two", "Three", "Four"};
        String[] array2 = {"Four", "Two", "Five", "Six", "Seven"};
        String commonstring = "";

        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {

                if (array1[i].equals(array2[j]))
                {
                    commonstring = commonstring + " "+ array1[i];

                }
            }

        }
        System.out.println("The common arrays are:  " + commonstring);
    }

}
