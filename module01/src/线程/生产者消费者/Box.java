package 线程.生产者消费者;

public class Box {
    private int milk;
    private boolean state =false;
    public synchronized void put(int milk) {
        if(state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk=milk;
        System.out.println("送第"+milk+"瓶奶进入奶箱");
        state = true;
        notifyAll();
    }
    public synchronized void get(){
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户拿到第"+this.milk+"瓶奶");
        state =false;
        notifyAll();
    }
}
