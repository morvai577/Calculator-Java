package com.vaibhav.calculator;

public class Main {

    public static void main(String[] args) {

        //Operands
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        //Operations
        int result1 = valA - valB / valC;

        int result2 = (valA - valB) / valC; // Operator Precedence

        System.out.println(result1);
        System.out.println(result2);

        int result3 = valA / valC * valD + valB;

        int result4 = valA / (valC * (valD + valB));

        System.out.println(result3);
        System.out.println(result4);



    }
}
