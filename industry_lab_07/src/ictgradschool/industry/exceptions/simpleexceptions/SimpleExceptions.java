package ictgradschool.industry.exceptions.simpleexceptions;

import java.util.Scanner;


public class SimpleExceptions {
    public static void main(String[] args) {
        SimpleExceptions exceptions = new SimpleExceptions();

        //Question 1 & 2
        boolean inputLegal = false;
        while (inputLegal == false){
            try{
                exceptions.handlingException();
                inputLegal = true;
            }catch (NumberFormatException e){
                continue;
            }catch (ArithmeticException e){
                continue;
            }
        }



        //Question3
        //exceptions.Question3();

        //Question4
        //exceptions.Question4();
    }

    /**
     * The following tries to divide using two user input numbers, but is
     * prone to error.
     */
    public void handlingException() {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        String str1 = sc.next();
        int num1 = Integer.parseInt(str1);
        System.out.print("Enter the second number: ");
        String str2 = sc.next();
        int num2 = Integer.parseInt(str2);

        // Output the result
        System.out.println("The division of " + num1 + " over " + num2 + " is " + (num1 / num2) + "\n");
    }

    public void Question3() {
        //Write some Java code which throws a StringIndexOutOfBoundsException
        
    }

    public void Question4() {
        //Write some Java code which throws a ArrayIndexOutOfBoundsException
    }
}