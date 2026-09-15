package case_study3;

import java.util.prefs.BackingStoreException;

class BankAccount{
    private  int balance=10000;

 synchronized   void withdraw(String customer,int ammount){
        System.out.println(customer+" wants to withdraw  "+ ammount);

        if(balance>=ammount){
            System.out.println(customer + "is withdrawing ....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            balance-=ammount;
            System.out.println("Final balance is "+balance);

        }
        else{
            System.out.println("Cannot withdraw . Insufficient balance.");
        }
    }
}

class customer extends  Thread{
    BankAccount account;
    int ammount;
    String name;

    customer(BankAccount a,int amm,String nam){
        account=a;
        ammount=amm;
        name=nam;
    }
    public void run(){
        account.withdraw(name, ammount);
    }
}



public class problem1 {
    
    public static void main(String []arg){
        BankAccount account= new BankAccount();
        customer c1=new customer(account, 2000, "Rohit")  ;
        customer c2=new customer(account, 5000, "Ankit");
        c1.start();
        c2.start();
    }
}
