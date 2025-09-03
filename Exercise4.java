
package Lec3_Exercise;

import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a float number 1: ");
        double d1 = keyboard.nextDouble();
        
        System.out.print("Enter a float number 2: ");
        double d2 = keyboard.nextDouble();
        double sum = d1*d2;
        System.out.println("Average = " + sum);
    }
}
