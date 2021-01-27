package task2;

import java.util.Objects;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor: " +
                "manufacturer = " + getManufacturer() +
                ", price = " + getPrice() +
                ", serial number = " + getSerialNumber() +
                ", resolutionX = " + resolutionX +
                ", resolutionY=" + resolutionY;
    }

    @Override
    public boolean equals(Object o) {

       if (o ==null || o.getClass() != this.getClass() || !super.equals(o)){
           return false;}
           else{
           Monitor monitor = (Monitor) o;
                return monitor.getResolutionX() == this.getResolutionX()
                        && monitor.getResolutionY() == this.getResolutionY();
       }
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 37*result + resolutionX;
        result = 37 * result + resolutionY;
        return result;

    }
}
