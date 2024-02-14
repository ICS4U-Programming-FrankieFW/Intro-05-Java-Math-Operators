import java.util.Scanner;

/**

* This program is a basic math program 

*

* @author Frankie Fox
* @version 1.0

* @since   2024-14-02
*/
import java.util.*;

public class MathOperators {
    // This makes the print the terminal
    public static void main(String[] args) {
        //While true loop that keep ths code going
        while (true) {
            try {
                //Scanner tells the user to input their operation +, -, /, *, Math.sqrt, ^
                Scanner sc = new Scanner(System.in);
                // This prints out the question of what operator you are using
                System.out.println("Enter in your operator : +, -, *, /,Math.sqrt,^");
                String Operation = sc.nextLine();
                //This asks the user to input their first number
                System.out.println("Enter your first number");
                //This makes it so the first number can be a double
                double FirstNumber = sc.nextDouble();
                //This asks the user for a second number
                System.out.println("Enter your second number");
                //This makes it so the second number can be a double
                double SecondNumber = sc.nextDouble();
                //This switch case is used to catch the errors and the results of the code
                switch (Operation) {
                                //This case solve a the equation if it is a addition symbol
                                case "+":
                                    System.out.println("Your Result is " + (FirstNumber + SecondNumber));
                                    //This breaks out of the code
                                    break;
                                //This catches the code if it is a subtraction equation
                                case "-":
                                    System.out.println("Your Result is " + (FirstNumber - SecondNumber));
                                    //This breaks out of the code
                                    break;
                                case "sqrt":
                                    //This finds the result of the square root question for first number 
                                    System.out.println("Your Result is " + (Math.sqrt(FirstNumber)));
                                    //This finds the result of the square root question for the second number
                                    System.out.println("Your result is " + (Math.sqrt(SecondNumber)));
                                    //This breaks out of the code
                                    break;
                                //This finds the result of a exponent question 
                                case "^":
                                    System.out.println("Your Result is raised to the first number to the second number "
                                            + (Math.pow(FirstNumber, SecondNumber)));
                                    //This breaks out of the code
                                    break;
                                case "*":
                                    //This finds the result of a multiplication question
                                    System.out.println("Your Result is " + (FirstNumber * SecondNumber));
                                   //This breaks out of the code
                                    break;
                                case "/":
                                    //This finds the result pf a division question
                                    System.out.println("Your Result is " + (FirstNumber / SecondNumber));
                                    //This breaks out of the code
                                    break;
                                    //default is used for catching the error in the code for it to stop
                                    default:
                                    //This breaks out of the code
                                break;

                            }//This finds the a line of code that is not a number 
                        } catch (Exception e) {
                //This prints error when it is given a non number 
                System.out.println("Error " + e.getMessage());
                break;
            }
            
        }
        

    }
}