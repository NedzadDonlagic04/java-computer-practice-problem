public class Computer {
    private String model;
    private String manufacturer;
    private String operatingSystem;

    public Computer(String model, String manufacturer, String operatingSystem) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getModel() {
        return this.model;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    @Override
    public String toString() {
        return this.model + ", manufacturer=" + this.manufacturer + ",  operatingSystem=" + this.operatingSystem;
    }
}
