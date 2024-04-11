 class Student {

    int x;
    String name;
    Student()
    {
        System.out.println("i am student ");
    }
    Student(int x,String name)
    {
        this.x=x;
        this.name=name;
    }
    Student (Student obj)
    {
        this.x=obj.x;
        this.name=obj.name;
    }
    public void addstudent(int x,String name)
    {
        this.x=x;
        this.name=name;
    }
    public void displaystudent()
    {
        System.out.print(x);
        System.out.println(name);
    }
}
public class Person extends Student
{ 
    int age;
    public void dis()
    {
        System.out.println(age+x+name);
    }
    public static void main(String args[])
    {
        Student s1=new Student(12,"rakesh");
        Student s2=new Student(s1);
        Person p=new Person();

        s1.displaystudent();
        s2.displaystudent();
        p.dis();
        
    } 
}
