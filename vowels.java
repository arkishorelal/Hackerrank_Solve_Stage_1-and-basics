/*The five letters A, E, I, O and U are called vowels. All other alphabets except these 5 vowels are called consonants.

Tony is studying fifth standard. In school he learns about vowels and consonants. At first he didn't catch up. Tony is a curious boy. After school, he comes to you and asks you to teach him. You want to teach Tony using your programming skills. Let's write a program.

Assume that the user will always enter an alphabet character.

Input Format

a
E

Constraints

'a' <= input <= 'z'
'A' <= input <= 'Z'

Note : If vovel - print 'vowel' in lowercase exactly
If consonant - print 'consonant' in lowercase exactly.

Output Format

consonant
vowel

Sample Input 0

a
Sample Output 0

vowel
Sample Input 1

K
Sample Output 1

consonant
*/

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

