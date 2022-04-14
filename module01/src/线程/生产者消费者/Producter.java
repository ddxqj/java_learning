package 线程.生产者消费者;

public class Producter implements Runnable{
    private Box b;
    public Producter(Box b){
        this.b =b;
    }
    @Override
    public void run() {
        for(int i=1;i<6;i++){
            b.put(i);
        }
    }
}
