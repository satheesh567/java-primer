/*3. Write a program to find the number of vowels, consonents, digits and white space characters in a string.*/
import java.util.Scanner;

public class CharacterCounter3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        int vowels = 0, consonants = 0, digits = 0, whitespace = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }
            else if (ch == ' ') {
                whitespace++;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of whitespace characters: " + whitespace);
    }
}
