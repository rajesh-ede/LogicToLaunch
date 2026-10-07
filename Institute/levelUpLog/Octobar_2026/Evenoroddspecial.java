import java.util.*;
class Evenoroddspecial{
    static boolean isEvenpluse(int n){
        int i = 0;
        while(i < n){
            i += 2;
        }
        if(i == n){
            return true;
        }
        return false;
    }
    static boolean isEvensub(int n){
        int i = n;
        while(i > 0){
            i -= 2;
        }
        if(i == 0){
            return true;
        }
        return false;
    }
    static  boolean isEvenMulti(int n){
        if(n == 0){
            return true;
        }
        int base = 2;
        for(int i =1; i <= n; i++){
            if(base * i == n){
                return true;
            }
            if(base * 2 > n){
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isEvenMulti(n));
        System.out.println(isEvensub(n));
        System.out.println(isEvenpluse(n));
    }
}