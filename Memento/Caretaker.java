import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List<Memento> messagelist = new ArrayList<Memento>();

    public void add(Memento message) {
        messagelist.add(message);
    }

    public Memento get(int index) {
        return messagelist.get(index);
    }
}