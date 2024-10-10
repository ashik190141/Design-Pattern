import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        in.close();
        new shopkeeper(name);
    }
}
