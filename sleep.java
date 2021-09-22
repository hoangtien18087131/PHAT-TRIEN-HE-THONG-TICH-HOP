public class sleep extends Thread{
    public void run(){
        for(int i=0; i<5;i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        sleep t1=new sleep();
        sleep t2=new sleep();
        t1.start();
        t2.start();
    }
}