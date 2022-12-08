import java.net.Socket;

class kk
{
   public static void main(String[] args)
   {
    Student kunal=new Student("Om Rai",16,88);
    Student random= new Student(kunal);
    Student random2=new Student();

    random2.printer();

    kunal.printer();
   // System.out.println(random2.name);
    System.out.println("random.name is "+random.name);
   }
}
class Student{
    int rno;
    int marks;
    String name;
    Student()
    {
        this("Rishu",16,97);
    }
    Student(String naam,int roll,int marks)
    {
       this.name=naam;
       this.rno=roll;
       this.marks=marks;
    }
    void printer()
    {
        System.out.println("name of the student is "+this.name+", roll no is "+this.rno+" and marks are "+this.marks);
    }
    Student(Student a)
    {
        this.name=a.name;
    }
}