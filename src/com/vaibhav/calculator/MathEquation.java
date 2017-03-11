package com.vaibhav.calculator;

/**
 * Created by imac on 12/03/17.
 */
public class MathEquation {

    //Fields
    public double leftVal;
    public double rightVal;
    public char opCode;
    public double result;

    //Methods
    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                if (rightVal != 0.0d)
                    result = leftVal / rightVal;
                else {
                    System.out.println("Error - zero division error");
                    result = 0.0d;
                }
                break;
            case'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode"); // Error Handling
                result = 0.0d;
                break;
        }

    }

}
