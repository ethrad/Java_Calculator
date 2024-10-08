package Homework;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {
    private List<Double> result = new ArrayList<>();

    public <T> double calculate(T first, T second, char operator) {
        OperatorType type = OperatorType.findType(operator);
        result.add(type.apply((Double) first, (Double) second));
        return result.getLast();
    }

    public void setResult(List<Double> result){
        this.result = result;
    }

    public List<Double> getResult(){
        return result;
    }

    public void removeResult(){
        result.removeFirst();
    }
}
