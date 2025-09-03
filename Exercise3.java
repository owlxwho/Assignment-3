
package Lec3_Exercise;

import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer 1: ");
        int i1 = keyboard.nextInt();
        
        System.out.print("Enter an integer 2: ");
        int i2 = keyboard.nextInt();
        int sum = i1+i2;
        System.out.println("Sum = " + sum);
    }
}
