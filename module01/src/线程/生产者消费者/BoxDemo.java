package 线程.生产者消费者;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        Producter producter = new Producter(box);
        Customer customer = new Customer(box);

        Thread t1 = new Thread(producter);
        Thread t2 = new Thread(customer);

        t1.start();
        t2.start();
    }
}
