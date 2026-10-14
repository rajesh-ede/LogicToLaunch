import java.util.*;
public class Hexatodec {
    static int hexaTodec(String s){
        int dec = 0, cnt = 0;
        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch >= 'A'){
                dec += (ch - 55) * (int) Math.pow(16,cnt++);
            }else{
                dec += (ch - 48) * (int) Math.pow(16,cnt++);
            }
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexa = sc.next();
        System.out.println(hexaTodec(hexa));
    }
}
