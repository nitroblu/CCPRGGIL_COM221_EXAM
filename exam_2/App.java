import java.util.Scanner;
public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
        System.out.println("1. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int studentNumber = scan.nextInt();
        if(studentNumber % 2==0) 
        System.out.println(studentNumber + " is odd "); 
        else 
        System.out.println(studentNumber + " is even ");


        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // nor a composite number.
        // (10 pts)

        System.out.println("2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();
        int number = 0;
        if( lastDigit == 0|| lastDigit == 1) {

            System.out.println("NEITHER");
         }
        else if ( lastDigit % 2 == 1){
            System.out.println("PRIME");
        }
        else {
            System.out.println("COMPOSITE");

        }
        

        // ==============================================================================

        // Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        String firstNamesString = "";
        String surNameString = "";
        int len1 = firstName.length();
        int len2 = surName.length();
        
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        System.out.println("Student number validation");
        System.out.print("Enter your ten digit student number: ");
        studentNumber = scan.nextInt();

        if (studentNumber == 2022104169) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
        studentNumber = scan.nextInt();

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        firstName = scan.next();
        String Surname;
        if (firstName.toUpperCase().equals("RACHEL") || surName.toLowerCase().equals("ramos")) {
        System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
  

        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.
        
       

        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        System.out.println("Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

      
        String course = scan.next(); 



        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the
        // following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        // (10 pts)
        System.out.println("10. Validate student email address "); 
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();

        switch (studentEmailAddress) {

            case "ramosrb1@students.national-u.edu.ph":

            System.out.println("Valid ");

            break;

            default:

            System.out.println("Invalid ");

            break;

    }


}
}
