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
