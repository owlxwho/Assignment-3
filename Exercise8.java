
package Lec3_Exercise;

import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a multiple words: ");
        
        while(keyboard.hasNext()){
            String word = keyboard.next();
            System.out.println(word);
        }
        
        keyboard.close();
    }
}
