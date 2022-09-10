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
