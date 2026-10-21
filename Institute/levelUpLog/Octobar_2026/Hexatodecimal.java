import java.util.*;

public class Hexatodecimal {
    static void toDec(String s){
        int dec = 0, cnt = 0;
        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'F'){
                dec += (ch - 55) * (int) Math.pow(16,cnt++);
            }else if(ch >= 'a' && ch <= 'f'){
                dec += (ch - 87) * (int) Math.pow(16,cnt++);

            }else if(ch >= '0' && ch <= '9'){
                dec += (ch - 48) * (int) Math.pow(16,cnt++);
            }
        }
        System.out.println("Hexa to Decimal" + s + " " + dec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexa = sc.next();
        hexa.replace("-","");
         toDec(hexa);
    }
}
