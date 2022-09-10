/*Count the even digits in a number. Print the count.

Input Format

Input should be an Integer

Constraints

1 <= N <= 1000000

Output Format

Output should be an Integer

Sample Input 0

123
Sample Output 0

1
Sample Input 1

2138
Sample Output 1

2 */

package hackerrank;

import java.util.Scanner;

public class evenco {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int a = get.nextInt();
        int rem,s=0;
        while(a!=0){
            rem = a%10;
            if(rem%2==0){
                s++;
            }
            a=a/10;
        }
        System.out.println(s);
    }
}
