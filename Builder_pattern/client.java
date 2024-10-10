public class client {
    public static void main(String[] args) {
        Carbuilder bmw = new Bmw();
        Carshop carshop = new Carshop(bmw);
        carshop.Constractcar();
        Car car = carshop.getcar();
        System.out.println(car.battery);
    }
}
