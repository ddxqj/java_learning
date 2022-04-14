package 线程;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        //MyThread thread1 = new MyThread("一号");
        MyThread thread2 = new MyThread();


        thread1.setName("一号");
        thread2.setName("二号");

        thread1.start();
        thread2.start();
    }
}
