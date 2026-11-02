package Numbers;

import java.util.Scanner;

public class Strongnumber {
    static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n * fact(n-1);
    }
    static boolean isStrong(int n){
        int t = n;
        int sum = 0;
        while(t > 0){
            int r = t % 10;
            sum += fact(r);
            t /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      System.out.println(isStrong(n) ? "Strong Number":"Not a Strong Number");

    }
}
/*
Numbers whose sum of factorial of digits is equal to the original number.
 Input: 145
Output: true
Explanation: 1! + 4! + 5! = 145

 */