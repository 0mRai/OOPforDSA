package interfaces;

public class newCar 
{
    private Engine engine;
    private Media player=new CDPlayer();
    public newCar()
    {
    this.engine=new dieselengine();
    }
    public newCar(Engine engine)
    {
      this.engine=engine;
    }
    public void start()
    {
        engine.start();
    }
    public void stop()
    {
        engine.stop();
    }
    public void startMusic()
    {
        player.start();
    }
    public void stopMusic()
    {
        player.stop();
    }

}
