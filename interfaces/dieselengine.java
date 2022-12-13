package interfaces;

public class dieselengine implements Engine {
    @Override
    public void start()
    {
     System.out.println("diesel engine starts");
    }
    @Override
    public void stop()
    {
        System.out.println("diesel engine stops");
    }
    @Override
    public void acc()
    {
        System.out.println("diesel engine accelerates");
    }
}
