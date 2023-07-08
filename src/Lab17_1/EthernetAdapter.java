package Lab17_1;

public class EthernetAdapter extends Device{
    private int speed;
    private int mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, int mac){
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMac() {
        return mac;
    }
    public void setMac(int mac) {
        this.mac = mac;
    }
}
