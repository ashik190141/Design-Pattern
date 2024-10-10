import java.util.ArrayList;

public class videoUpload implements notificationCondition {
    boolean b = false;
    ArrayList<subscriber> subscribers_list = new ArrayList<>();
    @Override
    public void subscribe(subscriber s) {
        subscribers_list.add(s);
    }

    @Override
    public void isVideo(boolean b) {
        //sendNotification();
        for (subscriber s : subscribers_list) {
            s.notification();
        }
    }

    public void sendNotification() {
        
    }
    
}
