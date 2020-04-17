//Java program to sort array in ascending and descending
// order using Arrays.sort().
import java.util.Arrays;
import java.util.Collections;
import  java.util.Scanner;
public class JavaProject { public static void main(String[] args) {
    //declare an array of strings
    String[] my_array2 = {"kiwi", "pineapple", "apple", "banana", "orange", "grapes", "watermelon", "cherry", "strawberry", "melon"};
    Scanner sc = new Scanner(System.in);
    //User will be asked to enter the strings
    System.out.println("Enter 10 words: ");
    String str = sc.nextLine();
    //Sorting the original strings arrays
    System.out.println("Original Order: " + Arrays.toString(my_array2));
    Arrays.sort(my_array2);
    //Displaying the strings on alphabetical order
    System.out.println("Alphabetical Order: " + Arrays.toString(my_array2));
    // Sorting String Array in descending order
    Arrays.sort(my_array2, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
    System.out.println("Reversed Alphabetical Order: : " + Arrays.toString(my_array2));
}
}
