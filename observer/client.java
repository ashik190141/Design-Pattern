public class client {
    public static void main(String[] args) {

        person ashik = new person("Ashik");
        person farhan = new person("Farhan");
        videoUpload v1 = new videoUpload();
        v1.subscribe(ashik);
        v1.isVideo(true);
        
    }
}
