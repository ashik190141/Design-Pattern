public class Messenger {
    public void send(String message, user from, user to) {
        to.receive(message, from);
    }
}
