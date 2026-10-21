import java.util.*;

public class Dectobinary {
    static String toBinary(int n){
        String bina = "";
        while(n > 0){
            int r = n % 2;
            bina = r + bina;
            n /= 2;
        }
        return bina;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0) {
            System.out.println("Zero");
            return;
        }
        if( n < 0) n = -n;
        System.out.println(toBinary(n));
    }
}
