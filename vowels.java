package hackerrank;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        char b = get.next().charAt(0);
        if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' || b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U') {
                    System.out.print("vowel");
        }
        else{
            System.out.println("consonant");
        }

            }
        }

