package Homework;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";

    public double parseNumber(String firstInput) throws BadInputException {
        try{
            return Double.parseDouble(firstInput);
        }
        catch (NumberFormatException e) {
            throw new BadInputException("실수");
        }
    }

    public char parseOperator(String operationInput) throws BadInputException {
        if (Pattern.matches(OPERATION_REG, operationInput)) {
            return operationInput.charAt(0);
        }
        else{
            throw new BadInputException("연산자");
        }
    }
}