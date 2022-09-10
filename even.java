/*Reverse the digit. Take only even digits while reversing.

Input Format

Input should be an Integer

Constraints

1 <= N <= 1000000

Output Format

Output should be an Integer

Sample Input 0

124
Sample Output 0

42
Sample Input 1

214896
Sample Output 1

6842*/





package hackerrank;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int a = get.nextInt();
        int rem,s=0;
        while(a!=0){
            rem = a%10;
            if(rem%2==0){
                System.out.print(rem);
            }
            a = a/10;
        }
    }
}
