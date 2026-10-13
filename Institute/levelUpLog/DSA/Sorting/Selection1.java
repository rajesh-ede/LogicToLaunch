import java.util.*;
public class Selection1 {
    static  void select(int []arr){
        int n  = arr.length;
        for(int i = 0; i < n -1; i++){
            int minIdx = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

        }
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
}
/*
Approcah

* Arranging the elements based on the smallest element.

1.Iterate the array from 1 to n - 2;
2.assume that i is smallest put in variable;
3.start another loop and from i + 1 -> n-1;
4.check can we get min Index if then update the varable ;
5.swap with the current the position.



 */
