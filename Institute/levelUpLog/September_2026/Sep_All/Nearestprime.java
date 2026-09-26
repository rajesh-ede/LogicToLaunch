
import java.util.*;

class Nearestprime{
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

    // Brute Force T.C O((i1+i2)√n)
    static void nearest(int n){
        int bp = 0, ap = 0;
        for(int i = n+1; ; i++){
            if(isPrime(i)){
                ap = i;
                break;
            }
        }
        for(int i = n-1; ; i--){
            if(isPrime(i)){
                bp = i;
                break;
            }
        }
        if((n- bp) < ( ap - n)){
            System.out.println("The nearest is : " + bp);
        }else if((n-bp) > (ap - n)){
            System.out.println("The nearest is : " + ap);
        }else{
            System.out.println(bp + " " + ap);
        }
    }

    // Optimal Solution like T.C : O(d√n)
    static void nearestop(int n) {

        for (int d = 1; ; d++) {

            int before = n - d;
            int after = n + d;

            boolean bp = isPrime(before);
            boolean ap = isPrime(after);

            if (bp && ap) {
                System.out.println(before + " " + after);
                return;
            }

            if (bp) {
                System.out.println("The nearest is : " + before);
                return;
            }

            if (ap) {
                System.out.println("The nearest is nn: " + after);
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nearest(n);
        nearestop(n);
    }
}