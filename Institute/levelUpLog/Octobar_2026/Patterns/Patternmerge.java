package Patterns;

import java.util.*;
public class Patternmerge {
    static void p1(int n){
        for(int i = 1; i <= n; i++){          // *        *
            for(int j = 1; j <= n; j++){      // **      **
                if(j <= i){                   // ***    ***
                    System.out.print("*");    // ****  ****
                }else{                        // **********
                    System.out.print(" ");
                }
            }
            for(int j = 1; j <= n; j++){
                if(j <= n - i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void p2(int n){
        for(int i = 1; i <= n; i++){              // **********
            for(int j = 1; j <= n; j++){          // ****  ****
                if(j <= n -i+1){                  // ***    ***
                    System.out.print("*");        // **      **
                }else{                            // *        *
                    System.out.print(" ");
                }
            }
            for(int j = 1; j<= n; j++){
                if(i <= j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    static void p12(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){               // *        *
                if(j <= i){                            // **      **
                    System.out.print("*");             // ***    ***
                }else{                                 // ****  ****
                    System.out.print(" ");             // **********
                }                                      // ****  ****
                                                       // ***    ***
            }                                          // **      **
            for(int j = 1; j <= n; j++){               // *        *
                if(j <= n-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i =1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j <= n - i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 1; j <= n; j++){
                if(j <= i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void p3(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j < i){
                    System.out.print(" "); // * * * * *
                }else{                     //  * * * *
                    System.out.print("* ");//   * * *
                }                          //    * *
            }                              //     *
            System.out.println();
        }
    }
    static  void p4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){    //       *
                if(j <= n - i){             //      * *
                    System.out.print(" ");  //     * * *
                }else {                     //    * * * *
                    System.out.print("* "); //   * * * * *
                }
            }
            System.out.println();
        }
    }
    static  void p5(int n){
        for(int i = 1; i <= n; i++){
            for (int j  =1; j <= n; j++){    //     *
                if(j <= n - i){              //    * *
                    System.out.print(" ");   //   * * *
                }else{                       //  * * * *
                    System.out.print("* ");  // * * * * *
                }                            //  * * * *
            }                                //   * * *
            System.out.println();            //    * *
        }                                    //     *
        for(int i = 1; i <= n; i++){
            for (int j  =1; j <= n; j++){
                if(j <=i){
                    System.out.print(" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    static void p6(int n){
        for(int i = 1; i<= n; i++){
            for(int j = 1; j <=i; j++){      //  *
                System.out.print("*");       //  **
            }                                //  ***
            System.out.println();            //  ****
        }                                    //  *****
        for(int i = 1; i <= n; i++){         //  ****
            for(int j = 1; j <= n; j++){     //  ***
                if(j <= n- i){               //  **
                    System.out.print("*");   //  *
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void p7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {   //    *
                if (j <= n - i) {           //    **
                    System.out.print(" "); //    ***
                } else {                   //   ****
                    System.out.print("*"); //  *****
                }                          //   ****
            }                              //    ***
            System.out.println();          //     **
        }                                  //      *
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p7(n);
    }
}
