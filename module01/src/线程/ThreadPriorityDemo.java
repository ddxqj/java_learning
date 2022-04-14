package 线程;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1= new ThreadPriority();
        ThreadPriority tp2= new ThreadPriority();
        ThreadPriority tp3= new ThreadPriority();

        tp1.setName("一号");
        tp2.setName("二号");
        tp3.setName("三号");

        System.out.println(Thread.MAX_PRIORITY);//10
        System.out.println(Thread.MIN_PRIORITY);//1
        System.out.println(Thread.NORM_PRIORITY);//5

        tp1.setPriority(10);
        tp2.setPriority(5);
        tp3.setPriority(1);

        tp1.start();
        tp2.start();
        tp3.start();
    }
}
