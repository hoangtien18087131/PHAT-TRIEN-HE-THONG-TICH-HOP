
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.naming.ldap.ManageReferralControl;



public class WorkerThread extends Thread{
    private String message;
    public WorkerThread(String s){
        this.message=s;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"(Start)mesage"+message);
        processMessage();
        System.out.println(Thread.currentThread().getName()+"END");
    }
    public void processMessage(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
       ExecutorService excutor=Executors.newFixedThreadPool (5);
       for(int i=0;i<10;i++){
            Runnable w1=new WorkerThread(""+i);
            excutor.execute(w1);
       }

       excutor.shutdown();
       while(!excutor.isTerminated()){

       }
       System.out.println(" Finished all threads! ");
    }
}