package Homework;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
        // 필수 기능
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int firstNumber;
            int secondNumber;

            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                try {
                    firstNumber = sc.nextInt();

                    if (firstNumber >= 0) {
                        break;
                    }

                    System.out.println("양의 정수를 입력하세요.");
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("양의 정수를 입력하세요.");
                    sc.nextLine();
                }
            }

            while (true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                try {
                    secondNumber = sc.nextInt();

                    if (secondNumber >= 0) {
                        break;
                    }

                    System.out.println("양의 정수를 입력하세요.");
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("양의 정수를 입력하세요.");
                    sc.nextLine();
                }
            }

            char operator;

            while (true) {
                System.out.print("사칙연산 기호를 입력하세요: ");
                try {
                    operator = sc.next().charAt(0);

                    if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                        break;
                    }

                    System.out.println("올바른 기호를 입력하세요.");
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("올바른 기호를 입력하세요.");
                    sc.nextLine();
                }
            }

            sc.nextLine();

            calc.calculate(firstNumber, secondNumber, operator);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

            String answer = sc.nextLine();
            if (answer.equals("exit")) {
                break;
            }
        }*/

        // 도전 기능
        ArithmeticCalculator calc = new ArithmeticCalculator();
        Scanner sc = new Scanner(System.in);
        Parser parser = new Parser();

        while (true) {
            double firstNumber;

            // 올바른 수를 입력 받을 때까지 반복
            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                try {
                    String firstInput = sc.nextLine();
                    firstNumber = parser.parseNumber(firstInput);
                    break;
                } catch (BadInputException e) {
                    System.out.println(e.getMessage());
                }
            }

            char operator;

            // 올바른 기호를 입력 받을 때까지 반복
            while (true) {
                System.out.print("사칙연산 기호를 입력하세요: ");
                try {
                    String operatorInput = sc.nextLine();
                    operator = parser.parseOperator(operatorInput);
                    break;
                } catch (BadInputException e) {
                    System.out.println(e.getMessage());
                }
            }

            double secondNumber;

            // 올바른 수를 입력 받을 때까지 반복
            while (true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                try {
                    String secondInput = sc.nextLine();
                    secondNumber = parser.parseNumber(secondInput);
                    break;
                } catch (BadInputException e) {
                    System.out.println(e.getMessage());
                }
            }

            // 계산 후 오류가 나면 오류 출력
            try {
                System.out.println(calc.calculate(firstNumber, secondNumber, operator));
            }
            catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }

            // 계산 결과 중 입력 받은 값보다 큰 값을 출력
            while (true) {
                System.out.print("입력 값보다 큰 값을 출력합니다: ");
                try {
                    double num = parser.parseNumber(sc.nextLine());
                    calc.getResult().stream()
                            .filter(e -> num < e)
                            .forEach(e -> System.out.println(e + " "));

                    break;
                } catch (BadInputException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

            String answer = sc.nextLine();
            if (answer.equals("exit")) {
                break;
            }
        }
    }
}
