public class user {
    public static void main(String[] args) {
        Device device=new TV();
        BasicRemote basicRemote=new BasicRemote(device);
        basicRemote.tooglePower();
        ((TV) device).display();
        System.out.print("\n");
        basicRemote.channelup();
        ((TV) device).display();

        AdvanceRemote advanceRemote=new AdvanceRemote(device);
        advanceRemote.mute();
        System.out.print("\n");
        ((TV) device).display();
    }
}
