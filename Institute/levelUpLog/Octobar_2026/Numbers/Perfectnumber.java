package Numbers;
import java.util.*;
public class Perfectnumber {
    static boolean isPerfect(int n){
        if(n <= 1){
            return false;
        }
        int sum = 1;
       for(int i = 2; i <= n / i; i++){
           if(n%i == 0){
               sum += i;
           }
           if(i != n/i){
               sum += n / i;
           }
       }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPerfect(n) ? "Perfect Number" : "Not a Perfect Number");
    }

}
