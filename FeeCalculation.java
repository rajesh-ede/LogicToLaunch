class FeeCalculation{
    public static void main(String[] args) {
        Student student1 = new Student("Sudharsan","CSE",2017,9,37000);

        double courseFee = 37000.00;
        boolean isEligible = student1.score >= 10;
        double discount = isEligible ? student1.score : 0;

        double discountAmount = courseFee * discount / 100;
        double finalAmount = courseFee - discountAmount;

       if(isEligible){
           System.out.println("Congartulations you got " + (int) discount +"% Discount on the Course!");
           System.out.println("Discuount Amount : " + discountAmount);
           System.out.println("Final fee :" + finalAmount);

       }else{
           System.out.println("Thank you " + student1.name +" For taking Assessment!");
           System.out.println("We are Regrate to infrom that you are not eligible to get Discount");
           System.out.println("Thanks for Consider Us! NEVER GIVE UP");
       }

    }
}