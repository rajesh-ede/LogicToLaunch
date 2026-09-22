
import java.util.*;
class Nthprime{
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
    static int nthPrime(int n){
        int cnt = 0, res = 0;
        for(int i = 2; ; i++){
            if(isPrime(i)){
                cnt++;
            }
            if(cnt == n){
                res = i;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nthPrime(n));
    }
}