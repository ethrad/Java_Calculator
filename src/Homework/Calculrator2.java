package Homework;

public class Calculrator2 {
    private double result = 0;

    public void setResult(double result){
        this.result = result;
    }

    public double getResult(){
        return result;
    }

    public double calculrate(int firstNumber, int secondNumber, char operator) {
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = (double) firstNumber / secondNumber;
                break;
        }

        return result;
    }

}
