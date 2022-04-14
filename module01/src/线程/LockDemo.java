package 线程;

public class LockDemo {
    public static void main(String[] args) {
        lock l = new lock();
        Thread t1 = new Thread(l, "1号");
        Thread t2 = new Thread(l, "2号");
        Thread t3 = new Thread(l, "3号");

        t1.start();
        t2.start();
        t3.start();
    }
}
