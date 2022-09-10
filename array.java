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

