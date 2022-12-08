package interfaces;

public class car implements Engine, Brake, Media
 {
    @Override
    public void start()
    {
        System.out.println("normal car has been started");
    }
    @Override
    public void stop()
    {
    System.out.println("normal car has been stopped");
    }
    @Override
    public void Brake()
    {
     System.out.println("brakes applied to a normal car");
    }
    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("accelerating a normal car");
    }
    
 }