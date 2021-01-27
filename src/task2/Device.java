package task2;

import java.util.Objects;

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " +
                "manufacturer = " + manufacturer +
                ", price = " + price +
                ", serialNumber = " + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o.getClass() == this.getClass()) {
            Device device = (Device) o;
            boolean resManufacturer = device.manufacturer.equals(this.manufacturer);
            boolean resPrice = device.price == this.price;
            boolean resSN = device.serialNumber.equals(this.serialNumber);
            return resPrice && resSN && resManufacturer;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 37;
        result = 37 * result + Float.floatToIntBits(price);
        result = 37 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 37 * result + (serialNumber != null ? serialNumber.hashCode() : 0);

        return result;
    }
}
