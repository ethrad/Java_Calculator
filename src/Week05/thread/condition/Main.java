package Week05.thread.condition;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static final int MAX_TASK = 5;
    private ReentrantLock lock = new ReentrantLock();

    // lock으로 condition 생성
    // condition 생성으로 조건에 맞는 waiting pool에 있는 스레드만 깨울 수 있다
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();

    private ArrayList<String> tasks = new ArrayList<>();

    // 작업 메서드
    public void addMethod(String task) {
        lock.lock(); // 임계영역 시작

        try {
            while(tasks.size() >= MAX_TASK) {
                String name = Thread.currentThread().getName();
                System.out.println(name+" is waiting.");
                try {
                    condition1.await(); // wait(); condition1 쓰레드를 기다리게 합니다.
                    Thread.sleep(500);
                } catch(InterruptedException e) {}
            }

            tasks.add(task);
            condition2.signal(); // notify();  기다리고 있는 condition2를 깨워줍니다.
            System.out.println("Tasks:" + tasks.toString());
        } finally {
            lock.unlock(); // 임계영역 끝
        }
    }
}