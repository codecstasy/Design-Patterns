package Memento_Pattern;

public class TV {
    private double size;
    private double price;
    private boolean USBSupport;

    public TV(double size, double price, boolean USBSupport) {
        this.size = size;
        this.price = price;
        this.USBSupport = USBSupport;
    }

    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isUSBSupport() {
        return USBSupport;
    }
    public void setUSBSupport(boolean USBSupport) {
        this.USBSupport = USBSupport;
    }
}
