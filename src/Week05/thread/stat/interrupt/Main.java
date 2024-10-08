package Week05.thread.stat.interrupt;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            // interrupt 되지 않았을 때만 실행해서 catch 하지 않게끔 만들 수 있다
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start();

        thread.interrupt();

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());

    }
}