import java.util.*;
class Geometricprogression{
    static  void gpSeries(int n, int a, int r){
        int sum = 0;
        System.out.println("First term : " + (a * r));
        System.out.println("Last term : " + (a * (int)Math.pow(r,n-1)));
        System.out.println("Gp Series in range : ");
        for(int i = 0; i < n; i++){
            int term = a * (int)Math.pow(r,i);
            System.out.print(term+ " ");
            sum += term;
        }
        System.out.println();
        System.out.println("Average of GP series : " +(double) sum / n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int r = sc.nextInt();

        gpSeries(n,a,r);
    }
}