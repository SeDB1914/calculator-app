package com.tts.calculator;

import java.util.Scanner;


public class Basic {

        public static void main (String[]args){

           Scanner input = new Scanner(System.in);
           System.out.println("Please enter a number");
           double num1 = input.nextDouble();
           System.out.println("Please enter an operator: +, -, *, /, or ^");
           char operator = input.next().charAt(0);
           System.out.println("please enter a second number");
           double num2 = input.nextDouble();

           double result = 0;

           switch (operator) {
               case '+' -> result = addition(num1, num2);
               case '-' -> result = subtraction(num1, num2);
               case '*' -> result = multiplication(num1, num2);
               case '/' -> result = division(num1, num2);
               case '^' -> result = square(num1);
               case 'r' -> result = squareRoot(num1);
               case 's' -> result = sin(num1);
               case 'c' -> result = cos(num1);
               case 't' -> result = tan(num1);
               case '!' -> result = factorial(num1);
               case 'p' -> result = pi(num1);
               case 'i' -> result = inverse(num1);
               case 'd' -> result = toDegrees(num1);

               default -> System.out.printf("%s is not a valid operator. Please enter +, -, *, / for basic operations or i, ^, r, s, t, !, p,", operator);
           }
           System.out.printf("%s\n %c %s \n= %s", num1, operator, num2, result);
        // Will add in display formatting to eliminate the second number in single number calculations
    }






    public static double addition (Double num1, Double num2){
        return num1 + num2;
    }

        public static double subtraction (Double num1, Double num2){
        return num1 - num2;
    }

        public static double multiplication (Double num1, Double num2){
        return num1 * num2;
    }

        public static double division (Double num1, Double num2){
        return num1 / num2;
    }


        public static double square (Double num1){
        return num1 * num1;
    }

    private static double inverse(double num1) {
        return 1/num1;
    }

    private static double sin(double num1) {
        return Math.sin(Math.toRadians(num1));
    }

    private static double cos(double num1) {
        return Math.cos(Math.toRadians(num1));
    }

    private static double tan(double num1) {
        return Math.tan(Math.toRadians(num1));
    }

    private static double toDegrees(double num1) {
        return Math.toDegrees(num1);
    }

    private static double squareRoot(double num1) {
        return 1;
    }

    private static double factorial(double num1) {
        return 1;
    }

    private static double pi(double num1) {
        return num1 * Math.PI;
    }






    }

