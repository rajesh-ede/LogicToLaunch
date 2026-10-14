import java.util.*;
public class Octaltodec {
    static  int octTodec(String oct){
        int dec = 0, cnt = 0;
        for(int i = oct.length() - 1; i >= 0; i--){
            char ch = oct.charAt(i);
            dec += (ch - 48) * (int) Math.pow(8,cnt++);
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oct = sc.next();
        System.out.println(octTodec(oct));

    }
}
