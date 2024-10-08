package Week04;

import java.text.ParseException;
import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String INTEGER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws BadInputException {
        try{
            if (Pattern.matches(INTEGER_REG, firstInput)) {
                calculator.setFirstNumber(Integer.parseInt(firstInput));
            }
            else {
                throw new BadInputException("양의 정수");
            }
        }
        catch (NumberFormatException e) {
            throw new BadInputException("양의 정수");
        }

        return this;
    }

    public Parser parseSecondNum(String secondInput) throws BadInputException {
        try{
            if (Pattern.matches(INTEGER_REG, secondInput)) {
                calculator.setSecondNumber(Integer.parseInt(secondInput));
            }
            else {
                throw new BadInputException("양의 정수");
            }
        }
        catch (NumberFormatException e) {
            throw new BadInputException("양의 정수");
        }

        return this;
    }

    public Parser parseOperator(String operationInput) throws BadInputException {
        if (Pattern.matches(OPERATION_REG, operationInput)) {
            AbstractOperation abstractOperation = null;
            switch (operationInput.charAt(0)) {
                case '+':
                    abstractOperation = new AddOperation();
                    break;
                case '-':
                    abstractOperation = new SubtractOperation();
                    break;
                case '*':
                    abstractOperation = new MultiplyOperation();
                    break;
                case '/':
                    abstractOperation = new DivideOperation();
                    break;
            }

            calculator.setOperation(abstractOperation);
        }
        else{
            throw new BadInputException("연산자");
        }

        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}