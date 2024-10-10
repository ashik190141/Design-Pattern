public class person implements subscriber{
    String subscriber_name;

    person(String subscriber_name) {
        this.subscriber_name = subscriber_name;
    }

    public String getName() {
        return subscriber_name;
    }

    @Override
    public void notification() {
        System.out.println("Dear " + subscriber_name + ", New content is uploaded");
    }
    
}
