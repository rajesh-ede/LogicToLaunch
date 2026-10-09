import java.util.*;
class Hcf{
    static int hcf(int n, int m){
        int range = (n < m) ? n : m;
        for(int i = range; i >= 1; i--){
            if(n%i == 0 && m % i == 0){
                return i;
            }
        }
        return 1;
    }
    static int hcf3(int n, int m,int o){
        int range = (n < m) ? (n < o) ? n : o : (m < o) ? m : o;
        for(int i = range; i >= 1; i--){
            if(n%i == 0 && m % i == 0 && o % i == 0){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();
        System.out.println(hcf(n,m));
        System.out.println(hcf3(n,m,o));
    }
}