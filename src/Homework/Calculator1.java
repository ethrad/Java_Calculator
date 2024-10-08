package Homework;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
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

            double result = 0;
            switch (operator) {
                case '+':
                    result = firstNumber + secondNumber;
                    System.out.println("결과: " + (int) result);
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    System.out.println("결과: " + (int) result);
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    System.out.println("결과: " + (int) result);
                    break;
                case '/':
                    if (secondNumber == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else {
                        result = (double) firstNumber / secondNumber;
                        System.out.println("결과: " + result);
                        break;
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
