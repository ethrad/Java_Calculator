package Week05.thread.multi;

public class Main {
    public static void main(String[] args) {
        // 멀티스레드는 걸리는 시간이나 동작을 예측할 수가 없다!!!
        // 여러 번의 실행 시에 같은 결과가 나올지 보장할 수 없다
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };
        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };



        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task2);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }
}
