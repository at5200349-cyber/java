public class Onlineshoping {
    int  productId;
    String productname;
    int quantity;
    int price;

    Onlineshoping(int pi,String pn,int q,int p){
        productId=pi;
        productname=pn;
        quantity=q;
        price=p;

    }
     int fprice(){
        int finalprice=quantity*price;
        if(finalprice>5000){
            finalprice-=(finalprice*10)/100;
            

        }
        return finalprice;
     }
     void display(){
        int fp=fprice();
        System.out.println(fp);
     }

}
class result{
    public static void main(String []arg){
        Onlineshoping obj=new Onlineshoping(45511,  "amankumar" , 10, 1000);
        obj.display();
    }
}
