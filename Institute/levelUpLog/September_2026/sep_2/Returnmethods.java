
import java.util.*;

class Returnmethods {
    static int add(int a,int b){
        return a+b;
    }
    static double fee(double fee,int discount){

        double amount = fee - (fee * (discount/100.0)) ;
        return amount;
    }
    String msg(String s){
        return s;
    }
    ArrayList<Integer> list(int n){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i =1; i <= n; i++){
            if(n%i == 0){
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Returnmethods rm = new Returnmethods();

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(add(a,b));

        double f = sc.nextDouble();
        int dis = sc.nextInt();
        System.out.println("Fee : " + fee(f,dis));

        String s = sc.next();
        System.out.println(rm.msg(s));

        int n = sc.nextInt();
        ArrayList<Integer> res = rm.list(n);
        System.out.println("Factors of " + n + "is : " + res);
    }
}