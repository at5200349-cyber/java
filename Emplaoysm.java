public class Emplaoysm {
    int empId;
    int sal;
    String name;

    Emplaoysm(int ed,int s,String n){
        empId=ed;
        sal=s;
        name=n;
    }

    int HRA(){
        int hra=(20*(sal))/100;
        return hra;
    }
    int DA(){
        int da=(10*(sal))/100;
        return da;
    }
    int GS(){
        int gs=DA()+HRA()+sal;
        return gs;
    }
    void display(){
        System.out.println(HRA());
        System.out.println(DA());
        System.out.println(GS());
    }

}
class res{

    public static void main(String []arg){
    Emplaoysm obj=new Emplaoysm(451555,5000000,"Aman kumar" );
    obj.display();
    }
}
