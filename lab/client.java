public class client {
    public static void main(String[] args) {
        person ashik = new person("Ashik");
        person farhan = new person("Farhan");
        person joy = new person("Joy");
        contentupload v1 = new contentupload();
        v1.subscribe(ashik);
        v1.subscribe(joy);
        v1.isupload(true);
    }
}
