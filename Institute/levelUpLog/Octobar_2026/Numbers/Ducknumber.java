package Numbers;

import java.util.Scanner;

public class Ducknumber {
    static boolean isDuck(String s){
        int n = s.length();
        int zero = 0;
        for(int i = 0; i < n; i++){
            char ch  = s.charAt(i);
            if(ch == '0'){
                zero++;
            }
        }
        char start = s.charAt(0);
        if(start != '0' && zero > 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
       if(isDuck(s)){
           System.out.println("Duck Number");
       }else{
           System.out.println("Not a Duck Number");
       }
    }
}
