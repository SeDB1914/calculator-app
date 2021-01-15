package com.tts.calculator;

//exponential and logarithmic functions with potential for large values
public class Exponent extends Basic {

    public double squareRoot(double num1) {return Math.sqrt(num1);}

    public long factorial(double num1) {
        long facto = 1;
        for (int i = 2; i <= num1; i++) {
            facto = facto * i;
        } return facto;
    }

    public double exponent(double num1, double num2) { return Math.pow(num1, num2);}







}
