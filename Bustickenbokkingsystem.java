import java.util.Scanner;

 class Bust {
    int age;
    
    int availabelseat=50;

    Bust(int a){
        age=a;
       
    }
    void Bookseat(int requiredseat) throws Exception{
        if(age<=0){
            throw new Exception("Invalid age");
        }
        if(requiredseat>availabelseat){
            throw new Exception("Not available");
        }
        if(requiredseat<0){
            throw new Exception("Invalid number ");
        }
        availabelseat-=requiredseat;
        System.out.println("Seat booked successfully");
    }
   
   
}//jii;kjfkjl; gldjkj;ldjglk;djkgj;ld jgdl;jgljdgglkjl;gjlsj
public class Bustickenbokkingsystem{
   public static void main(String []arg){
    Scanner sc=new Scanner(System.in);
    try {
        System.out.print("Enter age: ");
        int age =sc.nextInt();
        System.out.print("Enter seat to book: ");
        int seats=sc.nextInt();


        Bust passenger=new Bust(age);
        passenger.Bookseat(seats);



    }catch(java.util.InputMismatchException e){
        System.out.println("Input a valid input ");
    }
     catch (Exception e) {
        System.out.println(e.getMessage());
    }
   }


    }

