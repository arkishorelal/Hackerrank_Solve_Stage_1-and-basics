/*Products of the digits in a number

Input Format

Input should be an Integer

Constraints

1 <= N <= 10000

Output Format

Output should be Integer

Sample Input 0

12
Sample Output 0

2
Sample Input 1

57*/

package hackerrank;

import java.util.Scanner;

public class pp {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int a = get.nextInt();
        int rem,s=1;
        while(a!=0){
            rem = a%10;
            s *=rem;
            a = a/10;
        }
        System.out.println(s);
    }
}
