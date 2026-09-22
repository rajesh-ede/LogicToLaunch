import java.util.*;
public class Alternativeprime{
    // Time Complexity O(√n)
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i * i <= n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    // Time Complexity O((m-n)O√m)
    public static void altPrime(int n, int m){
        boolean alt = true;
        for(int i = n; i <= m; i++){
            if(isPrime(i)){
                if(alt){
                    System.out.print(i + " ");
                }
                alt = !alt;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int m = sc.nextInt();
        altPrime(n,m);
    }
}