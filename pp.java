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
