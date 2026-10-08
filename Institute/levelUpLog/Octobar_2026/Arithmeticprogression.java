import java.util.*;

class Arithmeticprogression{
    public  static void firstNterm(int n, int a, int d){
        int sum = 0;
        int last = a + (n - 1) * d;
        System.out.println("First term in series : " +a);
        System.out.println("last term in series : " +last);
        System.out.println("First Nterms of A.P : ");
        for(int i = 0; i < n; i++){
            System.out.print(a+i*d + " ");
            sum += a+i*d;
        }
        System.out.println();
        System.out.println("Average of A.P series : "+(double) sum / n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int d = sc.nextInt();

        firstNterm(n,a,d);
    }
}