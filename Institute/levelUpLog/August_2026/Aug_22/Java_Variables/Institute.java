class Institute{
    static String instituteName="Cv Crop";
    String batch_No = "cv_271";

    int studentId;
    String studentName;
    String studentCourse;


    Institute(int studentId, String studentName,String studentCourse){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCourse = studentCourse;
    }
    void view(){
        String message="Student Information";
        System.out.println("_________"+message+"----------");
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Student Name :" + studentName);

        System.out.println("Enrolled Course :" + studentCourse);
        System.out.println("Batch no :" + batch_No);
    }
}