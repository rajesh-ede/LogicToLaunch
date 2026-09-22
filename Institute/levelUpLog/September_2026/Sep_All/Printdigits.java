import java.util.*;
class Printdigits{
    // print digits in number
    public static void get(int n){
        while(n > 0){
            int rem = n % 10;
            System.out.print(rem + " ");
            n /= 10;
        }
        System.out.println();
    }
    // Print even digits in number
    public static void getEven(int n){
        if(n == 0){
            return 0;
        }
        while(n > 0){
            int rem = n % 10;
            if(rem% 2 == 0){
                System.out.print(rem + " ");
            }
            n /= 10;
        }
        System.out.println();
    }
    // Print prime digits in number
    public static void getPrime(int n){
        while (n > 0){
            int rem = n % 10;
            if(rem == 2 || rem == 3 ||
            rem == 5 || rem == 7){
                System.out.print(rem + " ");
            }
            n /= 10;
        }
        System.out.println();
    }
    // get highest digit of a number
    static int getHighest(int n){
        if(n == 0){
            return 0;
        }
        int large = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem > large){
                large = rem;
            }
            n /= 10;
        }
        return large;
    }
    // get smallest digit of a number
    public static int getSmallest(int n ){
        if(n == 0){
            return 0;
        }
        int small = 9;
        while(n > 0){
            int rem = n % 10;
            if(rem < small){
                small = rem;
            }
            n /= 10;
        }
        return small;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        get(n);
        getEven(n);
        getPrime(n);
        int small = getSmallest(n);
        int high = getHighest(n);
        System.out.println("Highest digit : " + high);
        System.out.println("Smallest digit : " + small);
    }
}