import java.util.Scanner;

public class NumbersofA {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string: ");

        //store the scanner class in replace space variable where all the space between will replace by no space
        String replacespace = scanner.nextLine().replaceAll(" ","");

        //now replacing all the character will null except a,A and store in variable replacecharater
        String replacecharacter  = replacespace.replaceAll("[^a A]" ,"");

        //now count variable will only a,A if user will any string containing a,A
        int count = replacecharacter.length();

        System.out.println("The occurrences of a is = " + count);

    }













}
