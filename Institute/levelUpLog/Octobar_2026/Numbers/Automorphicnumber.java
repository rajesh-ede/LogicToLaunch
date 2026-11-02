package Numbers;
import java.util.*;

//An automorphic number is a number whose square ends in the same digits as the number itself.
// N = 76 ->  76*76 = 5776

public class Automorphicnumber {
    static String isAutomorphic(int n){
        int sq = n * n;
        while(n > 0){
            if(n%10 != sq%10){
                return "Not a Automorphic Number";
            }
            n /= 10;
            sq /= 10;
        }
        return "Automorphic Number";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = isAutomorphic(n);
        System.out.println(n +" -> "+res);
        sc.close();
    }
}
