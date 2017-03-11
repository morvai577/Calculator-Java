package com.vaibhav.calculator;

/**
 * Created by imac on 12/03/17.
 */
public class MathEquation {

    //Make all fields private
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    //Accessors and Mutator
    public double getLeftVal() {return leftVal;}
    public double getRightVal() {return rightVal;}
    public double getopCode() {return opCode;}

    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    public void setopCode(char opCode) {this.opCode = opCode;}

    public double getResult() { return result;} // Do not allow result to be modified


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
