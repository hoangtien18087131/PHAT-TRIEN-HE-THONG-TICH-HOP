public class Threadd extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        Threadd t1 = new Threadd();
        t1.start();
    }
    
}
