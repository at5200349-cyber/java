class Student {
    String name;
    int mathMarks;
    int scienceMarks;
    int englishMarks;
    int historyMarks;
    int hindiMarks;

    Student(String name, int mathMarks, int scienceMarks, int englishMarks, int historyMarks, int hindiMarks) {
        this.name = name;
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
        this.englishMarks = englishMarks;
        this.historyMarks = historyMarks;
        this.hindiMarks = hindiMarks;
    }


    int calculateTotalMarks() {
        int totalmarks=mathMarks+englishMarks+hindiMarks+scienceMarks+historyMarks;
       return totalmarks;
    }
   int calculatepercentage() {
        int totalmarks=calculateTotalMarks();
        int per=totalmarks/5;
        return per;
    }


    void displayGrade(){
        int percentage=calculatepercentage();
        if(percentage>=90){
            System.out.println("Grade: A");
        }
        else if(percentage>=80){
            System.out.println("Grade: B");
        }
        else if(percentage>=70){
            System.out.println("Grade: C");
        }
        else if(percentage>=60){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }
    }




}

class StudentResult {
    public static void main(String[] args) {
        Student student1 = new Student("John", 85, 90, 78, 92, 88);
        System.out.println("Total Marks: " + student1.calculateTotalMarks());
        System.out.println("Percentage: " + student1.calculatepercentage() + "%");
        student1.displayGrade();
    }
}
