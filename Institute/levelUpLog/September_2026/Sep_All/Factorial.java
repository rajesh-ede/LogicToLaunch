import java.util.*;

class Factorial{
    static long fact(int n){
        long res  = 1;
        for(int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }
    static long fact1(int n){
      if(n == 0)
          return 1;

      return n * fact1(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = fact(n);
        long res = fact1(n);
        System.out.println(ans);
        System.out.println(res);
    }
}