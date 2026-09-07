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
    ArrayList<Integer> fact(int n){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i =1; i <= n; i++){
            if(n%i == 0){
                ans.add(i);
            }
        }
        return ans;
    }
    public static String course(String c){
        String h = "Hello" + c;
        return h;
    }
    public int[] fact1(int[] n){
        int ans[] = new int[n.length];
        for(int i = 0; i < n.length; i++){
            int c = n[i] % 2;
            if(c == 0){
                ans[i] = n[i];
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
        ArrayList<Integer> res = rm.fact(n);
        System.out.println("Factors of " + n + "is : " + res);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int[] ress = rm.fact1(arr);
        for(int i = 0; i < ress.length; i++){
            System.out.print(ress[i] + " ");
        }

    }
}