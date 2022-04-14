package Lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        Thread t = new Thread( ()-> System.out.println("多线程启动了！"));
        t.start();

    }
}
