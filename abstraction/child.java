package abstraction;

public class child extends Parent{
    child(int age)
    {
        super(age);
    }
    @Override
    void career()
    {
        System.out.println("I want to be a doctor");
    }
    @Override
    void partner()
        {
         System.out.println("i want to have enola holmes");
        }
}
