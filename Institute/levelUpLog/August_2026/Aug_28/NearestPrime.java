
import java.util.*;

class NearestPrime{
    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i *i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int small = n - 1;
        int high = n + 1;

        while(true){
            if(small >= 2 && isPrime(small)){
                System.out.println(small);
                break;
            }
            if(isPrime(high)){
                System.out.println(high);
                break;
            }
            small--;
            high++;
        }

    }

}