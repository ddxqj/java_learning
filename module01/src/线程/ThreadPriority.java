package 线程;

public class ThreadPriority extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
