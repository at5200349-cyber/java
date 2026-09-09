class Bms{
    int account_No;
    String account_holdername;
    double balance;

    Bms(int account_No, String account_holdername, double balance){
        this.account_No = account_No;
        this.account_holdername = account_holdername;
        this.balance = balance;
    }
    void display(){
        System.out.println( "Current balance is : "+balance);
    }
   
    void deposit(double amount){
        balance += amount;
        
    }
    int withdrwal(int amount){
        if(amount>balance){
            System.out.println("Insufficient balance");
            return 0;
        }
        else{
            balance -= amount;
            return amount;
        }
    }

    


  
}

class showdetails{

    public static void main(String  arg []){
        Bms ac1=new Bms(455455,"Akhilesh",50000);
        ac1.withdrwal(5000);
      ac1.display();
    }
}