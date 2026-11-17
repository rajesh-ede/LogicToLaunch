
public class Rightrotation {
    static  void rightRotate(int[] arr, int k){
        int n = arr.length;
        k %= n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    static  void reverse(int arr[],int l, int r){
        while(l < r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        rightRotate(arr,k);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
