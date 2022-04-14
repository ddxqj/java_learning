package 线程;

public class ThreadSleep extends Thread{
    public ThreadSleep(){}
    public ThreadSleep(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println(getName()+":"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
