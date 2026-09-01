import java.util.*;

public class PrimePiramid{
    public  static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int row = 5;
        int num = 2;
        for(int i = 0; i < row; i++){
            for(int j = 0; j <= i; j++){
                while(!isPrime(num)){
                    num++;
                }
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}