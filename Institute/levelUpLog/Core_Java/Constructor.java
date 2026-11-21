import java.util.*;


public class Constructor {
     Constructor(String name){
         System.out.println(" Hello " + name);
     }
     Constructor(String name, int age){
         this(name);
         System.out.println("Name : " + name + " Age : " + age);
     }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
      new Constructor(sc.next(),sc.nextInt());
    }
}
