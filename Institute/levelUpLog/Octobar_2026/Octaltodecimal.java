import  java.util.*;
public class Octaltodecimal {
    static void toDec(String s){
        int dec = 0, cnt = 0;
        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch < '0' || ch > '7'){
                System.out.println("Invalid Input");
                return;
            }
            dec += (ch - 48) * (int)Math.pow(9,cnt++);
            System.out.println(dec);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oct = sc.next();
        oct.replace("-","");
        toDec(oct);
    }
}
