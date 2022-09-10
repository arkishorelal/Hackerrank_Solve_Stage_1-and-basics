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
