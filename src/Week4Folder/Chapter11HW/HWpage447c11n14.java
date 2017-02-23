package Week4Folder.Chapter11HW;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Combine two lists) write a method that returns the union of two array lists
 * of integers using the following header. public static ArrayList<Integer>
 * union( ArrayList<Integer> list1, ArrayList<Integer> list2)
 *
 * For example, the union of two array lists {2,3,1,5} and {3,4,6} is {2, 3, 1,
 * 5, 3, 4, 6}. Write a test program that prompts the user to enter two lists,
 * each with five integers, and displays their union. The numbers are separated
 * by exactly one space in the output.
 *
 *
 * @author Administrator Gabe
 */
public class HWpage447c11n14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }
        System.out.print("Enter five integers for list2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }

        System.out.println("The combined list is " + union(list1, list2));

    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(list1);
        temp.addAll(list2);
        return temp;
    }
}
