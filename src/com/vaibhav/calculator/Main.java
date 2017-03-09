package com.vaibhav.calculator;

public class Main {

    public static void main(String[] args) {

        // Operands
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];


        for(int i = 0; i < opCodes.length; i++) {

            // Program Logic
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'd':
                    if (rightVals[i] != 0.0d) // Check for zero division
                        results[i] = leftVals[i] / rightVals[i];
                    else {
                        System.out.println("Error - zero division error");
                        results[i] = 0.0d;
                    }
                    break;
                case'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                default:
                    System.out.println("Error - invalid opCode"); // Error Handling
                    results[i] = 0.0d;
            }

        }

        for (double theResult: results) {
            System.out.println("result = " + theResult);
        }

    }
}
