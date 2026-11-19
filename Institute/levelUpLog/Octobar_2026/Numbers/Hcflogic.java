package Numbers;
import java.util.*;
public class Hcflogic {
    static  int gcd(int arr[], int diff){
        ArrayList<Integer> list =fcators(diff);
        for(int i = 0; i < list.size(); i++){
            int f = list.get(i);
            boolean isF = true;
            for(int j = 0; j < arr.length; j++){
                if(arr[j]%f != 0){
                    isF = false;
                    break;
                }
            }
            if(isF){
                return f;
            }
        }
        return 1;
    }
    static ArrayList<Integer> fcators(int n){
        ArrayList<Integer> fact = new ArrayList<>();
        for(int i=  n; i >= 1; i--){
            if(n%i == 0)
                fact.add(i);
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        int s = Integer.MAX_VALUE;
        int h = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < s)
                s = arr[i];
            if(arr[i] > h)
                h = arr[i];
        }
        int diff = Math.abs(s-h);
        System.out.println(gcd(arr, diff));
    }
}
