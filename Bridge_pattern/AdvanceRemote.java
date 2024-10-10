public class AdvanceRemote extends BasicRemote{

    AdvanceRemote(Device device) {
        super(device);
    }
    void mute(){
        device.setVolume(0);
    }
}
