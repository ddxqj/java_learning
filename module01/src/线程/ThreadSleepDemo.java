package 线程;

public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep thread1 = new ThreadSleep("曹操");
        ThreadSleep thread2 = new ThreadSleep("刘备");
        ThreadSleep thread3 = new ThreadSleep("孙权");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
