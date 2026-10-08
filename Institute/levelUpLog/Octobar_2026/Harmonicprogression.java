import java.util.*;
class Harmonicprogression{
    static  void hpSeries(int n, int a, int d){
        int sum = 0;
        System.out.println("First Hormonic progression : 1 / " + a);
        System.out.println("Last Hormonic progression : 1 / " + (a + n-1 * d));
        System.out.println("Hormonic progression : ");
        for(int i = 0; i < n; i++){
            int term = (a + i * d);
            System.out.print("1/" + term + " ");
            sum += term;
        }
        System.out.println();
        System.out.println("Average of Hormonic progression : " + (double) sum / n);
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
   int n  =sc.nextInt();
   int a = sc.nextInt();
   int d = sc.nextInt();
        hpSeries(n,a,d);
    }
}