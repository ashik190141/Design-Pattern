public class client {
    public static void main(String[] args) {
        Caretaker c = new Caretaker();
        Originator or = new Originator();

        or.setMessage("Ashik");
        c.add(or.saveMessageToMemento());
        or.getMessageToMemento(c.get(0));
        System.out.println(or.getMessage());
    }
}
