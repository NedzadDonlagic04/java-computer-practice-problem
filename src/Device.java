public class Device {
    private String model;
    private String manufacturer;

    public Device(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override
    public String toString() {
        return this.model + ", manufacturer=" + this.manufacturer;
    }
}
