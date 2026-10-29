package Patterns;

public class Rightangle1 {
    static void r1(int n){                 // 1
        for(int i = 1; i <= n; i++){       // 1 2
            for(int j = 1; j<= i; j++){    // 1 2 3
                System.out.print(j + " "); // 1 2 3 4
            }                              // 1 2 3 4 5
            System.out.println();
        }
    }
    static void r2(int n){
        for(int i = 1; i<=n; i++){            // 1
            for(int j = 1; j<= i; j++){       // 2 2
                System.out.print(i + " ");    // 3 3 3
            }                                 // 4 4 4 4
            System.out.println();             // 5 5 5 5 5
        }
    }
    static void r3(int n){
        for(int i = 1; i <= n; i++ ){         // *
            for(int j = 1; j <= i; j++){      // * *
                System.out.print("* ");       // * * *
            }                                 // * * * *
            System.out.println();             // * * * * *
        }
    }
    public static void main(String[] args) {
        int n = 5;
        r3(n);
    }
}
