
class human{
    String name;
    int age;
    String gender;

    human(String name, int age, String gender   ){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void fun(){
        System.out.println("This is a human class");
        display();
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Main {
    public static void main(String[] args) {
        human person1 = new human("Alice", 30, " Female");
        person1.fun();
    }
}