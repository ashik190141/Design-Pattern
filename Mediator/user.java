public class user {
    String username;
    Messenger messenger = new Messenger();

    user(String username) {
        this.username = username;
    }

    public void send(String message, user to) {
        messenger.send(message, this, to);
    }
    
    public void receive(String message, user from) {
        System.out.println("Message is "+message +" and send to "+from.username);
    }
}
