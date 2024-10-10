import java.util.List;

public class carshop {
    public static void main(String[] args) {
        List<info> car=List.of(new tesla(),new bmw(),new ferrari(),new toyota());
        ledscreen led = new ledscreen();
        led.carbrand(car);
    }
}
