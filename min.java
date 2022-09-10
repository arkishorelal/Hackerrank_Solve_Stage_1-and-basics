/*Find the minimum value in an array.

Input Format

Input consists one integer and one array

Constraints

1 <= N <= 100 -1000 <= arr[i] <= 1000

Output Format

Output should be the minimum element in an array

Sample Input 0

5
1 3 2 7 6
Sample Output 0

1
Sample Input 1

7
7 3 0 2 5 6 2
Sample Output 1

0  */

package hackerrank;

import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int a = get.nextInt();
        int[] b = new int[a];
        for(int i=0 ; i<a ; i++){
            b[i] = get.nextInt();
        }
        int min1 = b[0]; //7 --> 7 2 3 4 0 1
        for(int i=0 ; i<a ; i++){
            min1 = Math.min(min1,b[i]);
            }
        System.out.println(min1);
        }
    }
