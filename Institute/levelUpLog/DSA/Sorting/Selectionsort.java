import java.util.*;
class Selectionsort{
    static  void selection(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int last = n- i - 1;
            int maxIdx = getMax(arr,0,last);
            swap(arr,maxIdx,last);
        }
    }
    static  int getMax(int[] arr, int first, int last){
        int max = first;
           for(int i = first; i <= last; i++){
               if(arr[max] < arr[i]){
                   max = i;
               }
           }
        return max;
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}