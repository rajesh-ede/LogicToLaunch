class Pg2
 {
     static int a = 30;
     static
     {
      System.out.println(a);
     }
  public static void main(String[] args)
  {
   System.out.println(a);
   Pg2 obj = new Pg2();
   
  }
  {
   System.out.println("non static block executed");
   int x = 40;
   System.out.println(Pg2.x);
   System.out.println(a);
  }
}
  
     