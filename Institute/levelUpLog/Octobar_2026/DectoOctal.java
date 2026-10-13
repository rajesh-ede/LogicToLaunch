import java.util.*;
public class DectoOctal {
    static String toOctal(int n){
        String oct = "";
        while(n > 0){
            int r = n % 8;
            oct = r + oct;
            n /= 8;
        }
        return oct;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(toOctal(n));
    }
}
