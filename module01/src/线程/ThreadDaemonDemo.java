package 线程;

public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadDaemon thread1 = new ThreadDaemon("关羽");
        ThreadDaemon thread2 = new ThreadDaemon("张飞");

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        Thread.currentThread().setName("刘备");

        thread1.start();
        thread2.start();

        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
