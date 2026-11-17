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
    // print even digits in number
   static void digits(int n){
        if(n == 0)
            return;

        digits(n/10);
       int m = n % 10;
       if(m%2 == 0){
           System.out.print(m);
       }
   }
   // factorial of number
   static int factorial(int n){
        if(n == 0 || n == 1)
            return 1;

        return n * factorial(n-1);
   }
   // prime number
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
   // count even digits in a number
    static int cntEven(int n){
             if(n == 0){
                 return 0;
             }
        if((n%10) % 2 == 0){
            return 1 + cntEven(n/10);
        }
        return cntEven(n/10);
    }
    // sum of first n fibonacci numbers
    static int fib(int n){
        if(n == 0)
            return 0;

        if(n == 1)
            return 1;
        return fib(n-1)+fib(n-2);
    }

     static int fibSum(int n){
        if(n == 0)
            return 0;
        return fib(n-1)+fibSum(n-1);
     }
     //count the fibonacci numbers in given range
      static int cntFib(int n, int s, int e){

        int f = fib(n);
        if(f > e)
            return 0;
        if(f >= s)
            return 1 + cntFib(n+1,s,e);

          return cntFib(n+1,s,e);
      }

      // sum of factorial of numbers in given range
    static int sumFact(int n, int m){
        if(n > m)
            return 0;
        return  factorial(n)+sumFact(n+1,m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.print(sumFact(s,e));
        int res = factorial(n);
        System.out.println(res);
        boolean ans = isPrime(n,2);
        System.out.print(ans);

        System.out.print(cntFib(n,s,e));

    }
}
