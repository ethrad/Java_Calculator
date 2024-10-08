package Week05.thread.single;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("2번 " + Thread.currentThread().getName());
        };

        System.out.println("1번 " + Thread.currentThread().getName());
        Thread thread = new Thread(task);
        thread.setName("thread");
        thread.start();
    }
}
