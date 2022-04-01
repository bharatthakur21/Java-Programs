import java.util.Arrays;
import java.util.Scanner;

public class printArrayElementFromUser {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the Size of the array: ");
        if (value.hasNextInt()) {
            String length = value.next();
            String myArray = new  String(length);
            System.out.println("Enter the elements of the array: ");


            for (int i = 0; i < length.length(); i++) {
               myArray = value.next();
            }
            System.out.println(myArray);
        }
    }


}