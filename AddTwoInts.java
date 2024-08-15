//This is a comment
/*
* tony dias
* *08/15/23
* Addtwoints.java
 */
import java.util.Scanner;  // Import the Scanner class
public class AddTwoInts {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to the double int program!\n\n");

        int firstNum = 0;
        int secondNum = 0;
        int sumOfBothNumbers = 0;

        System.out.println("\nThe vaule of sumOfBothnumbers is " + sumOfBothNumbers);


        //Create a Scaner object
Scanner myScanerObject = new Scanner(System.in);

//Ask user for the first int4
        System.out.println("\n Please enter a whole number: ");
        firstNum = myScanerObject.nextInt();

        // Unit test for our first user input
        System.out.println("\n The vaule of firstNum is: " + firstNum);

        System.out.println("\n Please enter  second whole number: ");
        secondNum = myScanerObject.nextInt();

        // Unit test for our first user input
        System.out.println("\n The vaule of secondNum is: " + secondNum);

        //processing
        // Add the two ints input from the user.
        // the total of firstNum and secondNum will be stored in
        // The variable named sumOfBothNumbers

        sumOfBothNumbers = firstNum + secondNum;

        // Output the vaule of the variable named:sumOfBothNumbers
        System.out.println("\n The vaule of sumOfBothNumbers is:" + sumOfBothNumbers);


    }
}