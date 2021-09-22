public class Runnablee implements Runnable{
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Runnablee r1=new Runnablee();
        Runnablee r2=new Runnablee();
        Thread t1 =new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
    }
}
