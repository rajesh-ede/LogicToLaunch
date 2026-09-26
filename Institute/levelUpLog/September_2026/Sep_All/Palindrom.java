import java.util.*;

class Palindrom{
    public static boolean isPali(int n){
        int temp = n;
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = rev * 10+rem;
            n = n / 10;
        }
        if(temp == rev)
            return true;
        return false;
    }
    public static void range(int n, int m){
        int cnt = 0,sum = 0;
       for(int i = n; i <= m; i++){
           if(isPali(i)){
               System.out.print(i + " ");
               cnt++;
               sum += i;
               if(i < m-1){
                   System.out.print(", ");
               }
           }
       }
        System.out.println();
        System.out.println("Count : " + cnt);
        System.out.println("Sum : " + sum);
        double avg = (double)sum / cnt;
        System.out.println("Average : " + avg);

    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(isPali(n));
        range(50,100);
    }
}