package Homework;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> result = new ArrayList<>();

    public void setResult(List<Double> result){
        this.result = result;
    }

    public List<Double> getResult(){
        return result;
    }

    public double calculate(int firstNumber, int secondNumber, char operator) {
        switch (operator) {
            case '+':
                result.add((double)firstNumber + secondNumber);
                System.out.println("결과: " + result.getLast());
                break;
            case '-':
                result.add((double)firstNumber - secondNumber);
                System.out.println("결과: " + result.getLast());
                break;
            case '*':
                result.add((double)firstNumber * secondNumber);
                System.out.println("결과: " + result.getLast());
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result.add((double)firstNumber / secondNumber);
                    System.out.println("결과: " + result.getLast());
                    break;
                }
        }

        return result.getLast();
    }

    public void removeResult(){
        result.removeFirst();
    }
}
