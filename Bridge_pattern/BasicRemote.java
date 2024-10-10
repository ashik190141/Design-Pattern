public class BasicRemote implements Remote{
    protected Device device;
    BasicRemote(Device device){
        this.device=device;
    }
    @Override
    public void tooglePower() {
        if(device.isEnabled())device.disabled();
        else device.enabled();
    }
    @Override
    public void channelup() {
        device.setChannel((device.getChannel())+5);
    }
    @Override
    public void channeldown() {
        device.setChannel((device.getChannel())-1);
    }
    @Override
    public void volumeup() {
        device.setVolume((device.getVolume())+1);
    }
    @Override
    public void volumedown() {
        device.setVolume((device.getVolume())-1);
    }
    public void setDevice(Device device) {
        this.device = device;
    }
}
