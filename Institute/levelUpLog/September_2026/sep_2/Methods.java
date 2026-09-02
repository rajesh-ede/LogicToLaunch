import java.util.Scanner;

class Methods{
    static void add(int a,int b){
        System.out.println("Sum is : "+a+b);
    }
    void hello(){
        System.out.println("Hello this is non-static block without paramenters");
    }
    void hello(String s){
        System.out.println("Non-static block with parmeter : " + s);
    }
    void Dhello(String s){
        System.out.println("Hello" + s + "from dynamic input");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Methods m = new Methods();
        m.hello();
        m.hello("Mr.Cool1");
        add(3,7);
        System.out.println("\n");
        int n = sc.nextInt();
        int v = sc.nextInt();
        add(n,v);

    }
}