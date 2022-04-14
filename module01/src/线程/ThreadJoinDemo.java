package 线程;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin thread1 = new ThreadJoin("爷爷");
        ThreadJoin thread2 = new ThreadJoin("爸爸");
        ThreadJoin thread3 = new ThreadJoin("儿子");

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread3.start();
    }
}
