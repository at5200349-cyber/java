import java.util.Scanner;

class sol{
    double price;
    int quantity;
    double discount;

    sol (double pri,int qua,double dis)throws Exception{
        if(pri<=0){
            throw new Exception("Invalid product price");
        }
        if(qua<=0){
            throw new Exception("Invalid quantity");
        }
        if(dis<0||dis>100){
            throw new Exception("Invalid discount percentage");
        }
        price=pri;
        quantity=qua;
        discount=dis;
    }
    double calculatBill(){
        double totol =price*quantity;
        double discoutAmount=(totol*discount)/100;
        return totol-discoutAmount;
    }
    void makePayment(double payment)throws Exception{
        double bill=calculatBill();
        if(payment<bill){
            throw new Exception("Payment amount is less than the bill");
        }
        System.out.println("Payment successful");
        System.out.println("BILL = "+bill);
        System.out.println("Change = "+(payment-bill));
    }

     
}

public class Online_shopping {
    public static void  main(String []arg){
        Scanner sc=new Scanner(System.in);

     try {
           System.out.print("Enter product price: ");
           double price=sc.nextDouble();
           System.out.print("Enter quantity: ");
           int quantity=sc.nextInt();
           System.out.print("Enter discount percentage: ");
           double discount =sc.nextDouble();
           sol obj1 = new sol(price, quantity, discount)  ;
           obj1.makePayment(10);    
     }catch(java.util.InputMismatchException e){
        System.out.println("Invalid input");
     }
      catch (Exception e) {
        System.out.println("Error : "+ e.getMessage());
     }
    }
}
