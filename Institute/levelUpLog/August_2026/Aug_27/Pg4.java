
import java.util.Scanner;

class Pg4 {
    static Scanner sc = new Scanner(System.in);
     
       static String pgName;
       static int branchCode;
       static long resisterId;
 
    public static void main(String[] args) {
        System.out.println("--------PG Details---------");
        System.out.println("PG Name :");
        pgName = sc.next();
        System.out.println("PG Code :");
        branchCode = sc.nextInt();
        System.out.println("PG Registration no :");
        resisterId = sc.nextLong();

        System.out.println("----------Owner Details ---------");
        System.out.println("Name : ");
        String name = sc.next();
        System.out.println("Resident Id :");
        int id = sc.nextInt();
        System.out.println("Age : ");
        byte age = sc.nextByte();
        System.out.println("Phone :");
        long ph = sc.nextLong();
        System.out.println("Genter : M : F : O :");
        char ch = sc.next().charAt(0);
        System.out.println("----------Room Details---------");
        System.out.println("Room Number : ");
        short roNo = sc.nextShort();
        System.out.println("Room Type :");
        String roType = sc.next();
        System.out.println("Bed count :");
        byte bedCount = sc.nextByte();
        System.out.println("Monthly Rent :");
        double amount = sc.nextDouble();
        System.out.println("Room Avilable :");
        boolean isA = sc.nextBoolean();
        
       System.out.println("\n");
       System.out.println("PG Name : " + pgName);
       System.out.println("PG Code : " + branchCode);
       System.out.println("PG Registration no : " +resisterId);
       System.out.println("----------Owner Details ---------");
       System.out.println("Owner Name : " + name);
       System.out.println("Resident Id :: " + id);
       System.out.println("Age: " + age);
       System.out.println("Phone : " +ph);
       System.out.println("Gender : " +ch);

       System.out.println("----------Room Details---------");
       System.out.println("Room Number : " +roNo);
       System.out.println("Room Type : " +roType);
       System.out.println("Bed Count : " +bedCount);
       System.out.println("Monthly Rent : " + amount);
       System.out.println("Room Avilable :" + isA);

    }
}