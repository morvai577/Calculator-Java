package com.vaibhav.calculator;

public class Main {

    public static void main(String[] args) {

        // Operands
        double val1 = 100.0d;
        double val2 = 50.0d;
        double result;


        // Operators
        char opCode = 'a';

        // Program Logic
        if(opCode == 'a')
            result = val1 + val2;
        else if(opCode == 's')
            result = val1 - val2;
        else if(opCode == 'd')
            if (val2 != 0.0d) // Check for zero division
                result = val1 / val2;
            else {
                System.out.println("Error - zero division error");
                result = 0.0d;
            }
        else if(opCode == 'm')
            result = val1 * val2;
        else {
            System.out.println("Error - invalid opCode"); // Error Handling
            result = 0.0d;
        }

        System.out.println(result);


    }
}
