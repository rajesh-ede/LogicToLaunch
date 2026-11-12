import java.util.*;
public class Number {
    static void recur(int n){
        if(n == 0)
            return;
        System.out.print(n+" ");
        recur(n-1);
        System.out.print(n+" ");
    }
    static  void range(int n, int target){
        if(n > target)
            return;
        System.out.print(n+" ");
        range(n+1,target);

    }
    static void fact(int n){

    }
   static void digits(int n){
        if(n == 0)
            return;

        digits(n/10);
       int m = n % 10;
       if(m%2 == 0){
           System.out.print(m);
       }
   }
   static int factorial(int n){
        if(n == 0 || n == 1)
            return 1;

        return n * factorial(n-1);
   }
   static boolean isPrime(int n, int i){
        if(n <= 1)
            return false;
        if(n==2)
            return true;

        if(n%i == 0)
            return false;

        if(i*i > n)
            return true;

        return isPrime(n,i+1);
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int res = factorial(n);
       System.out.println(res);
       boolean ans = isPrime(n,2);
       System.out.print(ans);
    }
}
