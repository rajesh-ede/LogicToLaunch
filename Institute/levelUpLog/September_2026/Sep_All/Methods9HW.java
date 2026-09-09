import java.util.Scanner;

public class Methods9HW {
    static Scanner sc = new Scanner(System.in);
    static int add(int a,int b){
        return a + b;
    }
    int mul(int a,int b){
        return a * b;
    }
    int square(int n){
        return n *n;
    }
    boolean isEven(int n){
        if(n % 2 != 0){
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Methods9HW m = new Methods9HW();
        System.out.println("Enter the choice :");
        String s = sc.next();

        switch(s){
            case "add":
               int ans=  add(sc.nextInt(),sc.nextInt());
                System.out.println(ans);
                break;

            case "mul" :
                int v = m.mul(sc.nextInt(),sc.nextInt());
                System.out.println(v);
                break;

            case "squ" :
                int n = m.square(sc.nextInt());
                System.out.println(n);
                break;

            case "check" :
                boolean y = m.isEven(sc.nextInt());
                System.out.println(y);
                break;

            default:
                System.out.println("Invalid option please try again !");
               main(args);
        }

    }
}
    

