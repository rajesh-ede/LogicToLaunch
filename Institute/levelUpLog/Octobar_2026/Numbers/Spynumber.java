package Numbers;

import java.util.Scanner;

public class Spynumber {
    static String toSpy(int n){
        int t = n;
        int cnt = 0;
        int sum = 0, product = 1;
        while(t > 0){
            int r = t % 10;
             sum += r;
             product *= r;
            t /= 10;
        }
        if(sum == product){
            return "Spy Number";
        }
        return "Not a Spy Number";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(toSpy(n));
    }
}
