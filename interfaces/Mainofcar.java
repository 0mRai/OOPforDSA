package interfaces;

public class Mainofcar {
    public static void main(String[] args) {
    //     Engine car= new car();
    //   car.start();
    //   Media c = new car();
    //  c.start();
    newCar n=new newCar(new dieselengine());
        n.start();
        n.stop();
        n.startMusic();
        newCar a=new newCar(new electricengine());
        a.start();
        a.stop();
    }
}
