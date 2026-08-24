class Pg1{
  
 A{
   System.out.println("Non-Static block is Executed");
 }

 static {
    Pg1 obj = new Pg1();
   System.out.println("Static Block is Excuted");
    int a = 30;
   System.out.println(a);
 } 
   public static void main(String[] args){
   System.out.println("Hello, Akhila Mam");
   int a = 10;
   Pg1 obj = new Pg1();
   System.out.println(a);
  }
}