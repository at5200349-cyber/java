package case_study3;

class prepare extends Thread{
public void run(){
    System.out.println("Food is preparing");
    try {
        
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

}
class delivery extends Thread{
    public void run(){
        System.out.println( "Food delivery is started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Food is delivered");
    }
}

public class problem3 {
    public static void main(String [] arg)throws InterruptedException{
        prepare t1=new prepare();
        delivery d1=new delivery();
        t1.start();
        t1.join();
        d1.start();
    }
}
