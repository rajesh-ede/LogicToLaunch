import java.util.*;
public class Reverse {
    static  void toRev(int []arr){
        int left = 0, right = arr.length-1;
        while(left < right){
            int t = arr[left];
            arr[left ]= arr[right];
            arr[right] = t;

            left++;
            right--;
        }
    }
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6};

       toRev(arr);
        System.out.println();
       for(int num : arr){
           System.out.print(num +" ");
       }
    }
}
