import java.util.*;
public class Binarytodec {
    static int binTodec(String bin){
        int dec = 0, cnt = 0;
        for(int i = bin.length()-1; i >= 0; i--){
            char ch = bin.charAt(i);
            dec += (ch-48) * (int) Math.pow(2,cnt++);
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();
        System.out.println(binTodec(bin));
    }
}
