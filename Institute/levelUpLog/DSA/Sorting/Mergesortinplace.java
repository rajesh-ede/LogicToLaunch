import java.util.*;
public class Mergesortinplace {
    static void mergeSort(int arr[], int s, int e){
        if(s >= e){
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);

        merge(arr,s,mid,e);
    }
    static void merge(int[] arr, int s, int mid, int e) {
        int i = s;
        int j = mid + 1;
        while (i <= mid && j <= e) {
            if (arr[i] <= arr[j]) {
                i++;
            } else {
                int value = arr[j];
                int index = j;
                while (index > i) {
                    arr[index] = arr[index - 1];
                    index--;
                }
                arr[i] = value;
                i++;
                mid++;
                j++;

            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,67,32,21};
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
