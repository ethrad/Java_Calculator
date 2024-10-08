package Week04;

abstract class AbstractOperation {
    public double operate(int firstNumber, int secondNumber) {
        return 0;
    }
}

class AddOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

class SubtractOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}

class MultiplyOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}

class DivideOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return (double) firstNumber / secondNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = true;

        while (calculateEnded) {
            try{
                calculateEnded = CalculatorApp.start();
            }
            catch (BadInputException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}