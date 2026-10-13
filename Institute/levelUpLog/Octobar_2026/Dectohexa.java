import java.util.*;

public class Dectohexa {
    static String toHexa(int n){
        String hexa="";
        while(n > 0){
            int r = n % 16;
            hexa = r + hexa;
            n /= 16;
        }
        return hexa;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(toHexa(n));
    }
}
