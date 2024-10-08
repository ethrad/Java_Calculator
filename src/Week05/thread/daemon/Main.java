package Week05.thread.daemon;

public class Main {
    public static void main(String[] args) {
        Runnable daemon = () -> {
            for (int i = 0; i < 10000000; i++) {
                System.out.println(i + "번째 데몬");
            }
        };

        // 데몬은 우선순위가 낮다 => 상대적으로 다른 스레드에 비해 리소스를 적게 할당 받음
        Thread t1 = new Thread(daemon);
        t1.setDaemon(true);
        t1.start();


        // task의 출력이 끝나면 프로그램이 끝난다
        // 데몬의 실행 완료를 보장할 수 없다
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "번째 task");
        }
    }
}
