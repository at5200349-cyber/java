package case_study3;
import java.util.*;
class TicketBooking{
    private  int availableSeat=5;
    int seatno;
    String buyer;

    synchronized void bookseat(String name,int seatno){
        buyer=name;
       this.seatno=seatno;

       System.out.println(buyer +" is booking "+seatno+"seat");
       if(availableSeat>=seatno){
        try {
            Thread.sleep(1000);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        availableSeat-=seatno;
        System.out.println("Seat booked successfull");
        System.out.println("Availalbe seat is :"+ availableSeat);
       }
        else{
        System.out.println("Seat are not available");
    }
    
    }
   
}

class buyer extends Thread{

    TicketBooking ticket;
    String name;
    int numberofseat;

    buyer(TicketBooking ticket,String name,int numberofseat){
        this.ticket=ticket;
        this.name=name;
        this.numberofseat=numberofseat;

    }

    public void run(){
        ticket.bookseat(name, numberofseat);
    }

}

public class problem2 {
    public static void main(String []args){
        // Scanner sc=new Scanner(System.in);
        TicketBooking ticket=new TicketBooking();
        buyer c1=new buyer(ticket, "Ankit", 3);
        buyer c2=new buyer(ticket, "Rohit", 2);
        buyer c3=new buyer(ticket, "akhilesh", 2);
        c1.start();
        c2.start();
        c3.start();
        
    }
}
