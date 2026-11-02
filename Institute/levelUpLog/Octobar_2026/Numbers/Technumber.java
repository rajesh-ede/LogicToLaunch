package Numbers;

import java.util.Scanner;

public class Technumber {
    static void isTech(int n){
        int t = n,c = 0;
        while(t > 0){
            c++;
            t /= 10;
        }
        if(c < 4){
            System.out.println("Invalid Input");
            return;
        }
        if(c%2 !=0){
            System.out.println("We Cant't Find");
            return;
        }
        int div = (int)Math.pow(10,c/2);
        int first = n / div;
        int second = n % div;
        int sum = first + second;
        if(sum * sum == n){
            System.out.println(n + " is a Tech Number");
        }else{
            System.out.println(n +" is not a Tech Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0 ) n = -n;
        isTech(n);
    }
}

// Number that has an even number of digits and if the number is split into two equal halves(From the middle),
// then the square of the sum of these halves is equal to the number itself.
//Input: n = 2025
//Output: True
//Explanation: 20 + 25 = 45 and 452 = 2025