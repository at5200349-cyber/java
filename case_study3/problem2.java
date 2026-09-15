package case_study3;
import java.util.*;
class TicketBooking{
    private  int availableSeat=5;
    int seatno;
    String customer;

    synchronized void bookseat(String name,int seatno){
        customer=name;
       this.seatno=seatno;

       System.out.println(customer +" is booking "+seatno+"seat");
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

class customer extends Thread{

    TicketBooking ticket;
    String name;
    int numberofseat;

    customer(TicketBooking ticket,String name,int numberofseat){
        this.ticket=ticket;
        this.name=name;
        this.numberofseat=numberofseat;

    }

    public void run(){
        ticket.bookseat(name, numberofseat);
    }

}

public class problem2 {
    public static void mani(String []args){
        // Scanner sc=new Scanner(System.in);
        TicketBooking ticket=new TicketBooking();
        customer c1=new customer(ticket, "Ankit", 3);
        customer c2=new customer(ticket, "Rohit", 2);
        customer c3=new customer(ticket, "akhilesh", 2);
        
    }
}
