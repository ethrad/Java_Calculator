package Week03;

class Calculrator {
    public AbstractOperation operation;

    public double calculate(int firstNumber, int secondNumber) {
        return operation.operate(firstNumber, secondNumber);
    }
}

abstract class AbstractOperation {
    int firstNumber;
    int secondNumber;

    public AbstractOperation(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public abstract double operate(int firstNumber, int secondNumber);
}

class AddOperation extends AbstractOperation {
    public AddOperation(int firstNumber, int secondNumber) {
        super(firstNumber, secondNumber);
    }

    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

class SubtractOperation extends AbstractOperation {
    public SubtractOperation(int firstNumber, int secondNumber) {
        super(firstNumber, secondNumber);
    }

    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}

class MultiplyOperation extends AbstractOperation {
    public MultiplyOperation(int firstNumber, int secondNumber) {
        super(firstNumber, secondNumber);
    }

    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}

class DivideOperation extends AbstractOperation {
    public DivideOperation(int firstNumber, int secondNumber) {
        super(firstNumber, secondNumber);
    }

    @Override
    public double operate(int firstNumber, int secondNumber) {
        return (double) firstNumber / secondNumber;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
