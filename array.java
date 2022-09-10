/*Print the pattern as given below

Input Format

It should be an Integer

Constraints

1<= N <= 100

Output Format

Print the pattern

Sample Input 0

3
Sample Output 0

abc
ab
a
Sample Input 1

5
Sample Output 1

abcde
abcd
abc
ab
a*/






package hackerrank;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int alpha=97;
        int a = get.nextInt();
        for (int i = a; i >=1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(alpha-1+j));
            }
            System.out.println();
        }
    }
}

