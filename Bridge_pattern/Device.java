interface Device {
    boolean isEnabled();
    void enabled();
    void disabled();
    void setVolume(int volume);
    int getVolume();
    void setChannel(int channel);
    int getChannel();
}
