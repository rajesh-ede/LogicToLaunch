package Numbers;

import java.util.Scanner;

public class Armstrongnumber {
    static int digit(int n){
        int c = 0;
        while(n > 0){
            c++;
            n /= 10;
        }
        return c;
    }
    static boolean isArmstrong(int n){
        int d = digit(n);
        int sum = 0;

        int org = n;
        while(n > 0){
            int r = n%10;
            sum += (int)Math.pow(r,d);

            n /= 10;
        }
        return sum == org;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n) ? "Armstrong number" : "Not a Armstrong number");
    }
}
