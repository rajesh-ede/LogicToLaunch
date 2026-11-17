public class RotateKposition {
    static void rotateK(int[]arr,int k){

        for(int i = 0; i < k/2; i++){
            int t = arr[i];
            arr[i] = arr[k-i-1];
            arr[k-i-1] = t;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 2;
        rotateK(arr,k);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

}
