public class Mp3Player extends Device implements PortableDevice{
    private int batteryCapacity;
    private int memorySize;

    public Mp3Player(String model, String manufacturer, int batteryCapacity, int memorySize) {
        super(model, manufacturer);

        this.batteryCapacity = batteryCapacity;
        this.memorySize = memorySize;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getBatteryCapacity() {
        return this.batteryCapacity;
    }

    public int getMemorySize() {
        return this.memorySize;
    }

    @Override
    public String toString() {
        return super.toString() + ", batteryCapacity=" + batteryCapacity + ", memorySize=" + this.memorySize;
    }
}
