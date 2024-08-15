//This is a comment
/*
* tony dias
* *08/15/23
* Addtwoints.java
 */
import java.util.Scanner;  // Import the Scanner class
public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to the largestofthree program!\n\n");

        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        int largestOfThree = 0;




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

        System.out.println("\n Please enter  third whole number: ");
        thirdNum = myScanerObject.nextInt();

        // processing
        // compare the inputs with nested if statements
        if (firstNum > secondNum){
            if( firstNum > thirdNum){
                largestOfThree = firstNum;

        }
else {
    largestOfThree = thirdNum;
            }
if (secondNum > thirdNum){
    largestOfThree=secondNum;
}
else {
    largestOfThree=thirdNum;
}
System.out.println("\n the largest of three is:" +largestOfThree);

    }
}