public class Car implements Carparts{
    String engine;
    String battery;
    String gps;
    @Override
    public void engine(String engine) {
        this.engine = engine;
    }

    @Override
    public void battery(String battery) {
        this.battery = battery;
    }

    @Override
    public void gps(String gps) {
        this.gps = gps;
    }
    
}
