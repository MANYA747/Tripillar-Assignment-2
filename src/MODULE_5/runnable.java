package MODULE_5;

class mythread extends Thread{
    public void run1(){
        System.out.println("thread is running");
    }
}
public class runnable {
    public static void main(String[] args) {
        mythread t1=new mythread();//object creation=thread creation
        System.out.println("state:"+t1.getState());//getstate()->to know what stage of lifecycle thread is in
        t1.start();//starting the thread and calling the the thread
        System.out.println("State:"+t1.getState());
        t1.run();
        System.out.println("State:"+t1.getState());

    }
}
