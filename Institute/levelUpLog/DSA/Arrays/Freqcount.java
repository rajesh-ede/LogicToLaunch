
public class Freqcount {
    static  void toFeq(int[]arr){
        int n = arr.length;
        boolean visit[] = new boolean[n];
        for(int i = 0; i < n; i++){
            int cnt = 1;
            if(visit[i])
                continue;
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    cnt++;
                    visit[j] = true;
                }
            }
            System.out.println(arr[i] + " -> " + cnt);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,3,1};
        toFeq(arr);
    }
}
