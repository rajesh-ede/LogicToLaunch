import java.util.*;
class Bank{
    double balanace = 300;

    String withdrawAmount(double amount){
        if(amount <= 0){
            return "Invalid amount";
        }
        if(balanace - amount >= 300){
            balanace -= amount;
            return "Withdraw " + amount +" Successfull";
        }
        return "Insufficient balanace";
    }

    String depositAmount(double amount){
        balanace += amount;
        return "Credited Rs." + amount;
    }
    double checkBalance(){
        return balanace;
    }
}
public class BankMain {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);

        Bank obj = new Bank();

        while(true){
            System.out.println();
            System.out.print(" Please Select Options \n 1.CheckBalance \n 2. withdraw \n 3. Deposit \n 4.Exist \n");
            int n = sc.nextInt();
            if(n == 1){
                System.out.println("Avalable balance : " + obj.checkBalance());
            }else if(n == 2){
                System.out.print("Enter amount : ");
                double am  = sc.nextDouble();
                System.out.println(obj.withdrawAmount(am));
            }else if(n == 3){
                System.out.print("Enter amount : ");
                double am  = sc.nextDouble();
                System.out.println(obj.depositAmount(am));
            }else if(n == 4){
                System.out.println("Thanks for Visiting.");
                return;
            }else{
                System.out.println("Please Enter Valid Option");
            }
        }
    }
}
