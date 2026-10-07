import java.util.*;
// Perfect Square means Product of two equal integer
class Perfectsquare{

    static  boolean isPerfect(int n){
        for(int i = 1; i * i <= n; i++){
            if(i * i == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPerfect(n);
        if(ans){
            System.out.println("Give number is Perfect Square");
        }else{
            System.out.println("It not Perfect Square Number.");
        }
        sc.close();
    }
}