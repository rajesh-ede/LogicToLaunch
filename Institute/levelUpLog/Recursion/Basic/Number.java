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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        digits(n);
    }
}
