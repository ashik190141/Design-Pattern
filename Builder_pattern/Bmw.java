public class Bmw implements Carbuilder{
    Car car;

    Bmw() {
        this.car = new Car();
    }
    @Override
    public void buildengine() {
        car.engine("Straight");
    }

    @Override
    public void buildbattery() {
        car.battery("ion");
    }

    @Override
    public void buildgps() {
        car.gps("D-Gps");
    }

    @Override
    public Car getcar() {
        return this.car;
    }
    
}
