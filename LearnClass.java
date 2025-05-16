public class LearnClass
{
    public static void main(String[] args) 
    {
        Student student1 = new Student();
        student1.name = "John";
        student1.age = 21;
        student1.id = student1.name + student1.age;
        student1.introduceMyself();

        Student student2 = new Student();
        student2.name = "Sasha";
        student2.age = 31;
        student2.id = "GIUYEAHIGUHAEIUGHEIAUHGIEAH";
        student2.introduceMyself(); 
    }
}

class Student
{
    // fields of a Student class
    String name;
    int age;
    String id;

    // method of the class
    public void introduceMyself()
    {
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("My student ID is " + id + ".");
    }
}