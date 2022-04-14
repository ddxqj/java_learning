package 线程;

public class SellTicket implements Runnable{
    private int tickets = 100;
    private Object o = new Object();
    private int x =0;
    @Override
    public void run() {
        while(true) {
            if (x % 2 == 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (this) {
                    if (tickets > 0) {
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                        tickets--;
                    }
                }
            }
//            else{
//                sellTicket();
//            }
//            x++;
        }
    }

    private synchronized void sellTicket() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                tickets--;
            }
        }
}

