import java.util.Scanner;

class meth {
    int accountbalance=10000;
    int withdrawAmount;


meth(int mon){
    withdrawAmount=mon;
 }


 void display()throws Exception{
    int amm=withdr();
         if(withdrawAmount>accountbalance){
            throw new Exception("Insuffcient balance");
        }
        if(withdrawAmount<0){
            throw new Exception("Invali withdrawl amount");
        }
        System.out.println("Current amount :"+amm);
 }
 int withdr(){
   
        accountbalance=accountbalance-withdrawAmount;
    return (accountbalance);
 }
}


public class Bankaccoutwithdrawl {
        public static  void main (String []arg){
            Scanner sc=new Scanner(System.in);
        try {
                System.out.println("Enter withdraw  Amount: ");
                int wa=sc.nextInt();   
                meth obj1=new meth(wa);
               
                obj1.display();
                
                
        }catch(java.util.InputMismatchException e){
            System.out.println("Invali input");
        }
         catch (Exception e) {
           System.out.println("Error : "+e.getMessage());
        }
        }
}
