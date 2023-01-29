public class Desktop extends Computer{
    private double caseHeight;

    public Desktop(String model, String manufacturer, String operatingSystem, double caseHeight) {
        super(model, manufacturer, operatingSystem);

        this.caseHeight = caseHeight;
    }

    public void setCaseHeight(double caseHeight) {
        this.caseHeight = caseHeight;
    }

    public double getCaseHeight() {
        return this.caseHeight;
    }

    @Override
    public String toString() {
        return super.toString() + ", caseHeight=" + this.caseHeight;
    }

    public String getComputerType() {
        return "desktop";
    }

    public int calculatePortabilityScore() {
        return (int) (5 + this.caseHeight / 30);
    }
}
