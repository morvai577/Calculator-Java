package com.vaibhav.calculator;

/**
 * Created by mac on 16/03/17.
 */
public class CalculateHelper {
    MathCommand command;
    double leftValue;
    double rightValue;
    double result;

    //Named Constants
    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char MULTIPLY_SYMBOL = '*';
    private static final char DIVIDE_SYMBOL = '/';


    public void process(String statement) throws InvalidStatementException{
        // add 1.0 2.0
        String[] parts = statement.split(" ");
        if(parts.length != 3)
            throw new InvalidStatementException("Incorrect number of fields", statement);

        String commandString = parts[0]; // Get operator from string
        try {
            leftValue = Double.parseDouble(parts[1]);
            rightValue = Double.parseDouble(parts[2]);
        } catch (NumberFormatException e){
            throw new InvalidStatementException("Non-numeric data", statement, e);

        }
        leftValue = Double.parseDouble(parts[1]); // Convert string to double
        rightValue = Double.parseDouble(parts[2]); // Convert string to double

        setCommandFromString(commandString);
        if (command == null)
            throw new InvalidStatementException("Invalid command", statement);

        CalculateBase calculator = null;
        switch (command){
            case Add:
                calculator = new Adder(leftValue,rightValue);
                break;
            case Subtract:
                calculator = new Subtracter(leftValue, rightValue);
                break;
            case Divide:
                calculator = new Divider(leftValue,rightValue);
                break;
            case Multiply:
                calculator = new Multiplier(leftValue, rightValue);
                break;

        }

        calculator.calculate();
        result = calculator.getResult();

    }

        //Method to convert our string to Enum MathCommand

    private void setCommandFromString(String commandString){

        if(commandString.equalsIgnoreCase(MathCommand.Add.toString()))
            command = MathCommand.Add;
        else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString()))
            command = MathCommand.Subtract;
        else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
            command = MathCommand.Divide;
        else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
            command = MathCommand.Multiply;

    }

    @Override
    public String toString(){
        // 1.0 + 2.0 = 3.0
        char symbol = ' ';
        switch (command){
            case Add:
                symbol = ADD_SYMBOL;
                break;
            case Subtract:
                symbol = SUBTRACT_SYMBOL;
                break;
            case Multiply:
                symbol = MULTIPLY_SYMBOL;
                break;
            case Divide:
                symbol = DIVIDE_SYMBOL;
                break;
        }

        StringBuilder sb = new StringBuilder(20);
        sb.append(leftValue);
        sb.append(' ');
        sb.append(symbol);
        sb.append(' ');
        sb.append(rightValue);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();
    }
}
