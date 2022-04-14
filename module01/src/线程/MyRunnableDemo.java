package 线程;

public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t1 =new Thread(r,"一号");
        Thread t2 =new Thread(r,"二号");


        t1.start();
        t2.start();
    }
}
