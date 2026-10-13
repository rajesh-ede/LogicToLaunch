import java.util.*;
public class Bubblesort {
    static void bubble(int[] arr){
        int n = arr.length;
        boolean flag;
        for(int i = 0; i < n -1; i++){
            flag = false;
            for(int j  = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
            if(flag == false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
