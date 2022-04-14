package 线程;

public class ThreadJoin extends Thread{
    public ThreadJoin(){}
    public ThreadJoin(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
