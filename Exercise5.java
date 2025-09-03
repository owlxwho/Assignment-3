
package Lec3_Exercise;

import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the question 1+1 = 2 (true or false): ");
        Boolean b = keyboard.nextBoolean();
        System.out.println("Answer is: " + b);
    }
}
