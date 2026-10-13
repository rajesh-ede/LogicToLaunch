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
        System.out.println(toBinary(n));
    }
}
