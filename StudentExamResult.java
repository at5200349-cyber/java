import java.util.Scanner;

class sol{
     int [] marks;
     sol(int []marks){
      this.marks=marks;

     }
     double aveg()throws Exception{
      int totalMarks=0;
      for(int mark:marks){
         if(mark>100||mark<0){
            throw new Exception("Invalid marks: "+mark);
         }
         totalMarks+=mark;
      }
      return (double)totalMarks/marks.length;
      
     }
     void display() throws Exception{
            System.out.println("Avg: "+aveg());
     }
}

public class StudentExamResult {
  public static void main(String []args)throws Exception{
         Scanner sc=new Scanner(System.in);
         int []marks=new int[5];
         

try {
            for(int i=0;i<marks.length;i++){
               System.out.println("Enter marks: ");
               marks[i]=sc.nextInt();
            }
           
            sol obj1=new sol(marks);
            obj1.aveg();
            obj1.display();

}catch(java.util.InputMismatchException e){
   System.out.println("Invalid input");
} 
catch (Exception e) {
   System.out.println("Error"+e.getMessage());
}
         
  }   
}
