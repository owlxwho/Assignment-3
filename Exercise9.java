
package Lec3_Exercise;

import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = keyboard.nextInt();
        
        keyboard.nextLine();
        System.out.print("Enter a sentence: ");
        String s = keyboard.nextLine();
        System.out.println("Sentence is: " + s);
        System.out.println("Integer: " + i);
    }
}
