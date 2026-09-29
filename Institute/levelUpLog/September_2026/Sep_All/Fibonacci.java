import java.util.*;

class Fibonacci {
 static void Print(int n){
     int prev = 0;
     int curr = 1;
     int sum = 0,cnt = 0;
     for(int i = 0; i < n; i++){

         System.out.print(prev +" ");
         sum += prev;
         cnt++;
         int nxt = prev + curr;
         prev = curr;
         curr = nxt;
     }
     System.out.println("Sum of fibonacci numbers in given range : " + sum);
     System.out.println("Count of fibonacci numbers in given range : " + cnt);
     double avg = (double)sum / cnt;
     System.out.println("Average of fibonacci numbers in given range : " + avg);
     System.out.println();


     prev = 0;
     curr = 1;
     sum = 0;
     cnt = 0; avg = 0;
     boolean alt = true;
     System.out.print("ALternative fibonacci numbers : ");

     for(int i = 0; i < n; i++){
         if(alt){
             System.out.print(prev +" ");
             sum += prev;
             cnt++;
         }
         int nxt = prev + curr;
         prev = curr;
         curr = nxt;
         alt = !alt;
     }
     System.out.println("Sum of alternative fibonacci numbers : " + sum);
     System.out.println("count of alternative fibonacci numbers : " + cnt);
     avg = (double) sum / cnt;
     System.out.println("Sum of alternative fibonacci numbers : " + avg);
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print(n);
    }
}