public abstract class Computer extends Device {
    private String operatingSystem;

    public Computer(String model, String manufacturer, String operatingSystem) {
        super(model, manufacturer);

        this.operatingSystem = operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    @Override
    public String toString() {
        return super.toString() + ", operatingSystem=" + this.operatingSystem;
    }

    public abstract String getComputerType();

    public abstract int calculatePortabilityScore();
}
