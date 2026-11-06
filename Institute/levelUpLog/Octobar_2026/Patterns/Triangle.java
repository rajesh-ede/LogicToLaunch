package Patterns;

public class Traingle {
    static void p1(int n){
        for(int i = 1; i <= n; i++){
            for(int j=1; j<= n - i; j++){     //     1
                System.out.print(" ");        //    121
            }                                 //   12321
            for(int j = 1; j <= i; j++){      //  1234321
                System.out.print(j);
            }
            for(int j = i -1; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    static  void p2(int n){
        for(int i = 1; i<= n; i++){            // * * * * *
            for(int j = 1; j<= n; j++){        //  * * * *
                if(j < i){                     //   * * *
                    System.out.print(" ");     //    * *
                }else{                         //     *
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    static void p3(int n){
        for(int i = 1; i <= n; i++){      // 1
            for(int j = 1; j <= i; j++){  // 12
                System.out.print(j);      // 123
            }                             // 1234
            System.out.println();         // 12345
        }
    }
    static void p4(int n){
        for(int i = 1;i <= n; i++){
            for(int j = 1; j <= n; j++){    //     1
                if(j <= n -i){              //    2 2
                    System.out.print(" ");  //   3 3 3
                }else{                      //  4 4 4 4
                    System.out.print(i+" ");// 5 5 5 5 5
                }
            }
            System.out.println();
        }
    }
    static void p5(int n){
        for(int i = 1; i <= n; i++){
            int m = 1;
            for(int j = i; j < n; j++){    //     1
                System.out.print(" ");     //    1 1
            }                              //   1 2 1
            for(int j = 1; j <= i; j++){   //  1 3 3 1
                System.out.print(m+" ");   // 1 4 6 4 1
                m = m *(i-j)/j;
            }
            System.out.println();
        }
    }
    static void p6(int n){

    }
    public static void main(String[] args) {
        int n = 5;
        p5(n);
    }
}
