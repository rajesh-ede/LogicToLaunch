import java.util.*;

class B {
    static Scanner sc = new Scanner(System.in);

    static void M1(int a,int b){
        System.out.println("M1");
        System.out.println(a + " " + b);

    }
    static boolean M2(){
        System.out.println("M2");
        return sc.nextBoolean();
    }
    char M3(double fee){
        M1(sc.nextInt(),sc.nextInt());
        System.out.println("M3");
        System.out.println(fee);
        return sc.next().charAt(0);
    }
    long M4(char c){
        M2();
        System.out.println("M4");
        System.out.println(c);

        return sc.nextLong();
    }

    public static void main(String[] args) {
        B obj = new B();

        char c = obj.M3(sc.nextDouble());
        long l = obj.M4(sc.next().charAt(0));
        System.out.println(c);
        System.out.println(l);

        // System.out.println(obj.M3(sc.nextDouble()));
        // System.out.println(obj.M4(sc.next().charAt(0)));

    }
}