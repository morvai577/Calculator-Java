package com.vaibhav.calculator;

/**
 * Created by imac on 15/03/17.
 */
public abstract class CalculateBase {

    //fields
    private double leftVal;
    private double rightVal;
    private double result;

    //Accessors and Mutator
    public double getLeftVal() {return leftVal;}
    public double getRightVal() {return rightVal;}

    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}

    public double getResult() { return result;}
    public void setResult(double result) {this.result = result;}

    //Constructors
    public CalculateBase(){}
    public CalculateBase(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;

    }

    //Methods
    public abstract void calculate();


}
