/*Print the sum by adding all the characters by using their ASCII value.

Input Format

Input should be String

Constraints

No constraints

Output Format

Output should be an Integer

Sample Input 0

goal
Sample Output 0

419
Sample Input 1

act
Sample Output 1

312
*/ 

package hackerrank;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        int b=0;
        Scanner get = new Scanner(System.in);
        String a = get.next();
        int k = a.length();
        for(int i =0 ; i<k ; i++){
            char n = a.charAt(i);
            b = b+n;
        }
        System.out.println(b);

    }
}
