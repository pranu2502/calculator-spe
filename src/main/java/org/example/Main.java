package org.example;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {


            System.out.println("Welcome to the Calculator App");
            System.out.println("Please enter your selected choice");
            System.out.println("1. Calculate Square root");
            System.out.println("2. Factorial Function");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power of a function");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);

            Calculator calculator = new Calculator();
            logger.info("Calculator Object Ready");

            int op = sc.nextInt();

            double num1, num2;

            while(op != 0)
            {
                switch (op)
                {
                    case 1:
                        System.out.println("Enter a number");
                        num1 = sc.nextDouble();
                        logger.info("CALCULATING: the Square root of " + String.valueOf(num1));
                        logger.info("RESULT: Square Root of " + String.valueOf(num1) + " is " + calculator.squareRoot(num1));
                        break;

                    case 2:
                        System.out.println("Enter a number");
                        num1 = sc.nextDouble();
                        logger.info("CALCULATING: the factorial of " + String.valueOf(num1));
                        logger.info("RESULT: Factorial of " + String.valueOf(num1) + " is " + calculator.factorial(num1));
                        break;


                    case 3:
                        System.out.println("Enter a number");
                        num1 = sc.nextDouble();
                        logger.info("CALCULATING: the Natural Logarithm of " + String.valueOf(num1));
                        logger.info("RESULT: Natural Logarithm of " + String.valueOf(num1) + " is " + calculator.logarithm(num1));
                        break;

                    case 4:
                        System.out.println("Enter a number for the base");
                        num1 = sc.nextDouble();
                        System.out.println("Enter a number for the power");
                        num2 = sc.nextDouble();
                        logger.info("CALCULATING: the value of " + String.valueOf(num1) + " raised to " + String.valueOf(num2));
                        logger.info("RESULT: Value of " + String.valueOf(num1) + " to the power of " + String.valueOf(num2) + " is " + calculator.power(num1, num2));
                        break;

                    default:
                        logger.error("Invalid option entered");
                        break;
                }

                op = sc.nextInt();
            }
        logger.info("Exiting Calculator");
        System.out.println("Byeee");

        }
}