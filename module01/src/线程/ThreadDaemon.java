package 线程;

public class ThreadDaemon extends Thread{
    public ThreadDaemon(){}
    public ThreadDaemon(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
