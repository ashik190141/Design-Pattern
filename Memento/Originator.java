public class Originator {
    private String message;     //ashik

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Memento saveMessageToMemento() {
        return new Memento(message);
    }

    public void getMessageToMemento(Memento memento){
        message = memento.getmessage();
    }
}
