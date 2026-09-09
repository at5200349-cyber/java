

public class opps{
    static int a=4;
    static int b;
    

    static {
        b=a*4;
    }

    public static void main(){
        opps obj=new opps();
        System.out.println(opps.a);
        opps.b+=5;
        System.out.println(opps.b);
        System.out.println(obj.a);
            opps obj1=new opps();
              System.out.println(obj1.b);
    }

  

 }