package task2;

import java.util.Objects;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
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

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter: " +
                "manufacturer = " + getManufacturer() +
                ", price = " + getPrice() +
                ", serial number = " + getSerialNumber() +
                ", speed = " + speed +
                ", mac = " + mac;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null
                || this.getClass() != o.getClass()
                || !super.equals(o)) {
            return false;
        } else {
            EthernetAdapter ethernetAdapter = (EthernetAdapter) o;
          return this.speed == ethernetAdapter.speed
                  && this.mac.equals(ethernetAdapter.mac);
        }
    }


    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 37 * result + speed;
        result = 37 * result + (mac != null ? mac.hashCode() : 0);
        return result;
    }
}
