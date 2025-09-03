
package Lec3_Exercise;

import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter(",|\\n");
        
        System.out.print("Enter words separated by ',': ");
        
        while(keyboard.hasNext()){
            String word = keyboard.next();
            System.out.println("Words: " + word);
        }
        
        keyboard.close();
    }
}
