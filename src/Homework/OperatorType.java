package Homework;

public enum OperatorType {
    PLUS('+') {
        public double apply(double a, double b) {
            return a + b;
        }
    },
    MINUS('-') {
        public double apply(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY('*') {
        public double apply(double a, double b) {
            return a * b;
        }
    },
    DIVIDE('/') {
        public double apply(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }

            return a / b;
        }
    };

    private final char symbol;

    OperatorType(char s) {
        symbol = s;
    }

    public static OperatorType findType(char symbol) {
        for (var op : OperatorType.values()) {
            if (op.symbol == symbol) {
                return op;
            }
        }

        throw new IllegalArgumentException("매개변수가 올바르지 않습니다.");
    }

    public abstract double apply(double a, double b);
}
