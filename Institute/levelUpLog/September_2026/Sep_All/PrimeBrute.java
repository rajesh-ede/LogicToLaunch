import java.util.*;
class PrimeBrute{

    // Time complexity O(√n) space complexity : o(1)

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i * i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    //Using Recursion
    //Time Complexity O(√n) space complexity O(√n)
    public static boolean isPrimeRec(int n,int i){
        if(n <= 2)
            return (n == 2) ? true : false;
         if(n % i == 0)
             return false;
         if(i * i > n)
             return true;
         return isPrimeRec(n,i+1);
    }
    // Average of prime number in given range
    // Time Complexity O((m-n)√m)
    // Space complexity O(1)
    public static double avgPrime(int n, int m){
        int cnt = 0,sum = 0;
        for(int i = n; i <= m; i++){
            if(isPrime(i)){
                sum += i;
                cnt++;
            }
        }
        double avg = (double)sum / cnt;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean is = isPrime(n);

        if(is){
            System.out.println("Prime");
        }else{
            System.out.println("Non Prime");
        }
        boolean iss = isPrimeRec(n,2);
        if(iss){
            System.out.println("Prime");
        }else{
            System.out.println("Non Prime");
        }
        int s = sc.nextInt();
        int e = sc.nextInt();
        double avg = avgPrime(s,e);
        System.out.printf("Average :%.2f", avg);

    }
}