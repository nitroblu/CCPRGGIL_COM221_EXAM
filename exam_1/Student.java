public class Student{
    String surname;
    String firstName;
    char middleInitial;
    int dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;



    public void sayMyStudentNumber() {
        System.out.println("My student number is " + studentNumber);
    }

    public void sayMyStudentEmailAddress() {
        System.out.println("My student email address is " + studentEmailAddress);
    }

    public void sayIAmAwesome() {
        System.out.println("i Am Awesome " + iAmAwesome);
    }
    
}
