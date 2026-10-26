package Patterns;

public class Square {
    static void sq1(int n){
        for(int i = 1; i <= n; i++){            // * * * * *
            for(int j = 1; j <= n; j++){        // * * * * *
                System.out.print("* ");         // * * * * *
            }                                   // * * * * *
            System.out.println();
        }
    }
    static void sq2(int n){
        for(int i = 1; i <= n; i++){            // 1 2 3 4 5
            for(int j = 1; j <= n; j++){        // 1 2 3 4 5
                System.out.print(j + " ");      // 1 2 3 4 5
            }                                   // 1 2 3 4 5
            System.out.println();
        }
    }
    static void sq3(int n){
        for(int i = 1; i <= n; i++){            // 1 1 1 1 1
            for(int j = 1; j <= n; j++){        // 2 2 2 2 2
                System.out.print(i + " ");      // 3 3 3 3 3
            }                                   // 4 4 4 4 4
            System.out.println();
        }
    }

    static void sq4(int n){
        int cnt = 1;
        for(int i = 1; i <= n; i++){            // 1 2 3 4 5
            for(int j = 1; j <= n; j++){        // 6 7 8 9 10
                System.out.print(cnt + " ");    // 11 12 13 14 15
                    cnt++;                      // 16 17 18 19 20
            }

            System.out.println();
        }
    }
    static void sq5(int n){

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == j){
                    System.out.print("1"+" ");  // 1 0 0 0 0
                }else{                          // 0 1 0 0 0
                    System.out.print("0"+" ");  // 0 0 1 0 0
                }                               // 0 0 0 0 1

            }
            System.out.println();
        }

    }
    static void sq6(int n){
        for(int i = 1; i<= n; i++){              // 1 4 7
            for(int j = i; j <= n * n; j += n){  // 2 5 8
                System.out.print(j + "\t");      // 3 6 9
            }
            System.out.println();
        }
    }
    static void sq7(int n){
        for(int i = 1; i<= n; i++){              // 3 2 1
            for(int j = n; j >= 1; j--){         // 3 2 1
                System.out.print(j + "\t");      // 3 2 1
            }
            System.out.println();
        }
    }
    static void sq8(int n ){
        for(int i = 1; i<= n; i++){
            for(int j = 1; j <= n; j++){      // 1 0 1 0 1
                if((i+j) % 2 == 0){           // 0 1 0 1 0
                    System.out.print("1 ");   // 1 0 1 0 1
                }else{                        // 0 1 0 1 0
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    static void sq9(int n){
        for(int i = 1; i <= n; i++){            // 1 2 3 4 5
            for(int j = 1; j <= n; j++){        // 2 3 4 5 6
                System.out.print((i+j)-1 + " ");// 3 4 5 6 7
            }                                   // 4 5 6 7 8
            System.out.println();
        }
    }
    static void sq10(int n){
        for(int i = 1; i <= n; i++){                            // * * * * *
            for(int j = 1; j <= n; j++){                        // *       *
               if(i == 1 || i == n || j== 1 || j == n){         // *       *
                    System.out.print("* ");                     // * * * * *
               }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        sq10(n);
    }
}
