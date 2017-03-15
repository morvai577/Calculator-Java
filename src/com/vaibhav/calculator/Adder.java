package com.vaibhav.calculator;

/**
 * Created by imac on 15/03/17.
 */
public class Adder extends CalculateBase {

    // Constructors
    public Adder() {}
    public Adder(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }

}
