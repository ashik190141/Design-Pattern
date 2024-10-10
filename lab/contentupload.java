import java.util.ArrayList;

public class contentupload implements notifyconditon{
    boolean b = false;
    ArrayList<subscriber> subscribers_list = new ArrayList<>();
    @Override
    public void subscribe(subscriber s) {
        subscribers_list.add(s);
    }

    @Override
    public void isupload(boolean b) {
        for (subscriber s : subscribers_list) {
            s.notification();
        }
    }
    
}
