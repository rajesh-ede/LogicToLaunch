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
    }
}