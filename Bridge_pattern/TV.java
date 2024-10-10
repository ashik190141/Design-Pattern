public class TV implements Device{
    boolean on=false;
    int volume=30;
    int channel=13;
    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enabled() {
        on=true;
    }

    @Override
    public void disabled() {
        on=false;
    }

    @Override
    public void setVolume(int volume) {
        if(volume>100)volume=100;
        else if(volume<0)volume=0;
        else this.volume=volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setChannel(int channel) {
        this.channel=channel;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    void display(){
        if(on)System.out.println("TV is on");
        else System.out.println("TV is off");
        System.out.println("Volume is "+volume);
        System.out.println("Channel is "+channel);
    }
    
}
