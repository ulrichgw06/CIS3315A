package Week4Folder.Chapter11HW;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 *(Sum ArrayList) Write the following method that returns the sum of all numbers
 * in an ArrayList:
 * public static double sum(ArrayList<Double> list)
 * Write a test program that prompts the user to enter 5 numbers, stores them in an
 * array list, and displays their sum.
 * 
 * @author Administrator Gabe
 */
public class HWpagec11n12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }

        System.out.println("The sum of the 5 numbers = " + sum(list));

    }

    private static double sum(ArrayList<Double> list) {

        double sum = 0;
        for (double i : list) {
            sum += i;
        }
        return sum;
    }
}
