
package Lec3_Exercise;

import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What's your name: ");
        String sentence = keyboard.nextLine();
        
        System.out.print("What's your age: ");
        int age = keyboard.nextInt();
        System.out.println("Hello " + sentence + ", you are " + age + " year old");
    }
}
