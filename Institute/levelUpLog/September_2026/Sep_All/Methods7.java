import java.util.*;

class Methods7{

    static  Methods7ethods7 obj = new Methods7();;
    static Scanner sc = new Scanner(System.in);

    static void M1(int val){
        System.out.println("M1 static method "+val);
    }
    char M2(){
        obj.M4();
        return sc.next().charAt(0);
    }
    static String M3(boolean b){
        M1(sc.nextInt());
        return sc.next();
    }

    void M4(){
        System.out.println("M4 block is invoked");

    }
    public static void main(String[] args){

        int val = sc.nextInt();
        M1(val);
        char ch  = obj.M2();
        System.out.println(ch);
        String s = M3(sc.nextBoolean());
        System.out.println(s);

        obj.M4();
    }
}