import java.util.Arrays;

public class Mergesum {
    // Approach-1 (new Array)
    static int[] merge(int arr1[], int arr2[]){
        int s = Math.max(arr1.length,arr2.length);
        int res[] = new int[s];
        for(int i = 0; i < s; i++){
            if(i < arr1.length && i < arr2.length){    // T.C : O(max(arr1.length,arr2.length))
                res[i] = arr1[i]+arr2[i];              // S.C : O(max(arr1.length,arr2.length))
            }else if(i < arr1.length){                 // A.S.C : O(1)
                res[i] = arr1[i];
            }else{
                res[i] = arr2[i];
            }
        }
        return res;
    }
    //  Approach - 2 (Using Recursion)
    static void mergeRec(int arr1[],int arr2[],int res[],int i){
        if(i == res.length)
            return;

        if(i < arr1.length && i < arr2.length){
            res[i] = arr1[i]+arr2[i];
        }else if(i < arr1.length){                 // T.C : O(max(arr1.length,arr2.length))
            res[i] = arr1[i];                      // S.C : O(max(arr1.length,arr2.length))
        }else{                                     // A.S.C : O(max(arr1.length,arr2.length))
            res[i] = arr2[i];
        }

        mergeRec(arr1,arr2,res,i+1);
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7};

        int s = Math.max(arr1.length, arr2.length);
        int ans[] = new int[s];
        mergeRec(arr1,arr2,ans,0);
        System.out.println(Arrays.toString(ans));


        int []res = merge(arr1,arr2);
        for(int num : res){
            System.out.print(num + " ");
        }
    }
}
