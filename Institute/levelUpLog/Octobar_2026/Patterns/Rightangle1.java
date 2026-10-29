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
    static void r4(int n){
        for(int i = 1; i <= n; i++){                  // A
            for(int j = 1; j <= i; j++){              // A B
                System.out.print((char)(64 + j)+" "); // A B C
            }                                         // A B C D
            System.out.println();                     // A B C D E
        }
    }
    static void r5(int n){
        char ch = 'A';
        for(int i = 1; i <= n; i++){                // A
            for(int j = 1; j <= i; j++){            // B C
                System.out.print(ch++ + " ");       // D E F
            }                                       // G H I J
            System.out.println();                   // K L M N O
        }
    }
    static void r6(int n){
        int cnt = 1;
        for(int i = 1; i <= n; i++){               // 1
            for(int j = 1; j <= i; j++){           // 1 2
                System.out.print(cnt++ + " ");     // 1 2 3
            }                                      // 1 2 3 4
            System.out.println();                  // 1 2 3 4 5
        }
    }
    static void r7(int n){
        for(int i = 1; i <= n; i++){            // @
            for(int j = 1; j <= i; j++){        // # #
               if(i%2 != 0)                     // @ @ @
                   System.out.print("@ ");      // # # # #
               else                             // @ @ @ @ @
                   System.out.print("# ");
            }
            System.out.println();
        }
    }
    static void r8(int n){
        for(int i = 1; i <= n; i++){              // 1
            for(int  j = 1; j <= i; j++){         // 2 4
                System.out.print((i*j) + " ");    // 3 6 9
            }                                     // 4 8 12 16
            System.out.println();                 // 5 10 15 20 25
        }
    }
    static void r9(int n){
        int c =1;
        for(int i =1; i <= n; i++){             // 1
            for(int j = 1; j <= i; j++){        // 0 1
                System.out.print(c+" ");        // 0 1 0
                c = c == 1 ? 0 : 1;             // 1 0 1 0
            }                                   // 1 0 1 0 1
            System.out.println();
        }
    }
    static void r10(int n){
        int c = 0, d = 0;
        for(int i = 1; i <= n; i++){
            if(i%2 == 0){
                c +=i;
                d = c;
            }
            for(int j = 1; j <= i; j++){      // 1
                if(i%2 != 0)                  // 3*2
                    System.out.print(++c);    // 4*5*6
                else                          // 10*9*8*7
                    System.out.print(d--);    // 11*12*13*14*15
                if(j != i)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        r10(n);
    }
}
