
package Lec3_Exercise;

import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = keyboard.nextLine();
        System.out.println("Sentence: " + sentence);
        
        System.out.print("Enter a integer: ");
        int i = keyboard.nextInt();
        System.out.println("Integer: " + i);
    }
}
