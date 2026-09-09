
 import java.util.*;
 import java.util.stream.IntStream;

class Pattern1_9 {
    // pattern :  1 10 2 9 3 8 4 7 5 6 6 5 7 4 8 3 9 2 10 1 
    public static void pattern1(int n){
          int p = n;
        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
            System.out.print( p + " ");
            p -= 1;
        }
        System.out.println();
    }
    // pattern : A B C D 
    public static void pattern2(int n ){
        if(n < 1 || n > 26){
            System.out.println("Invalid Input");
            return;
        }
        for(int i = 0; i < n; i++){
            System.out.print((char) ('A' + i)+ " ");
        }
        System.out.println();
    }


public static void pattern22(int n) {
    if (n < 1 || n > 26) {
        System.out.println("Invalid");
        return;
    } 
        IntStream.range(0, n)
                 .mapToObj(i -> String.valueOf((char) ('A' + i)))
                 .forEach(c -> System.out.print(c + " "));
    
}
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern1(n);
        pattern2(n);
        pattern22(n);
    }
}

