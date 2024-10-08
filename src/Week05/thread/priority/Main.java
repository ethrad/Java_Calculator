package Week05.thread.priority;

public class Main {
    public static void main(String[] args) {
        Runnable task1 = () ->{
            for (int i = 0; i < 10; i++) {
                System.out.println("$");
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("*");
            }
        };

        Thread t1 = new Thread(task1);
        t1.setPriority(8); // t1이 t1보다 우선순위 높음
        int threadPriority = t1.getPriority();
        System.out.println("t1 우선순위 " + threadPriority);

        Thread t2 = new Thread(task2);
        t2.setPriority(2);

        // t1이 t2보다 빨리 끝날 가능성이 높다, 보장은 불가능
        t1.start();
        t2.start();
    }
}
