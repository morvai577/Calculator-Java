package com.vaibhav.calculator;

public class Main {

    public static void main(String[] args) {

        //Operands
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = (short) (byteVal); // Implicit Conversion
        short result2 = (short) longVal; // Explicit Conversion


        //Operations
        short result3 = (short) (byteVal - longVal); // Explicit Conversion
        double result4 = longVal - doubleVal;
        long result5 = (long) (shortVal - longVal + floatVal + doubleVal);

        //Print Result
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }
}
