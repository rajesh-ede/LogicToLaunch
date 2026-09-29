import java.util.*;

// An Armstrong number is a number where the sum of each digit raised to the power of the number of digits equals the original number.
class Amstrong{

    //Time Complexity: O(R × d)
    static void range(int n, int m){
        int sum = 0;
        int cnt = 0;
        System.out.print("Armstrong number is range "+ n +"&" +m+" : ");
        for(int i = n; i <= m; i++){
            if(isAmng(i)){
                System.out.print(i+" ");
                sum += i;
                cnt++;
            }
        }
        System.out.println();
        System.out.println("Sum of Armstrong numbers in range : " + sum);
        System.out.println("Count of Armstrong numbers in given range : "+ cnt);

        double avg = (double) sum / cnt;
        System.out.println("Average of Armstrong in given range : " + avg);
    }

    //Time Complexity: O(d)
    static int digit(int n){
        int cnt = 0;
        while (n > 0){
            cnt++;
            n /= 10;
        }
        return cnt;
    }
    //Time Complexity: O(d) + O(d) = O(d)
    static boolean isAmng(int n){
        int digit = digit(n);
        int t = n;
        int sum = 0;
        while(t > 0){
            int rem = t%10;
            sum +=(int) Math.pow(rem,digit);
            t /=10;
        }
        if(n == sum)
         return true;

        return false;
    }
    static void altPrint(int n, int m){
        int sum = 0;
        int cnt = 0;
        boolean alt = true;
        System.out.print("Alternative Armstrong number : " );
        for(int i = n; i <= m; i++){
            if(isAmng(i)){
              if(alt){
                  sum += i;
                  cnt++;
                  System.out.print(i + " ");
              }
              alt = !alt;
            }
        }
        double avg = (double) sum / cnt;
        System.out.println("Average of alternative Armstrong number : "+avg);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        boolean ans = isAmng(n);
;
        if(ans){
            System.out.println("Armstrong");
        }else{                                                    // Overall Time Complexity: O(R × d)
            System.out.println("Not a Armstrong");
        }
        int s = sc.nextInt();
        int e = sc.nextInt();
        range(s,e);
        altPrint(s,e);
        sc.close();
    }
}