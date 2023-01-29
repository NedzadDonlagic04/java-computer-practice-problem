public final class Netbook extends Laptop implements PortableDevice{
    public Netbook(String model, String manufacturer, String operatingSystem, int batteryCapacity, double weigh) {
        super(model, manufacturer, operatingSystem, batteryCapacity, weigh);
    }

    public String getComputerType() {
        return "netbook laptop computer";
    }

    public int calculatePortabilityScore() {
        return 1;
    }
}
