package 线程;

public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket ticket = new SellTicket();
        Thread t1 = new Thread(ticket, "1号");
        Thread t2 = new Thread(ticket, "2号");
        Thread t3 = new Thread(ticket, "3号");

        t1.start();
        t2.start();
        t3.start();
    }
}
