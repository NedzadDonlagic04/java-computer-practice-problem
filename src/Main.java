public class Main {
    public static void main(String[] args) {
        Desktop desktop = new Desktop("idk4", "idk5", "idk6", 5.5);
        Laptop laptop = new Laptop("idk7", "idk8", "idk9", 60, 10.5);

        System.out.println(desktop);
        System.out.println(desktop.getComputerType());
        System.out.println(desktop.calculatePortabilityScore());
        System.out.println();

        System.out.println(laptop);
        System.out.println(laptop.getComputerType());
        System.out.println(laptop.calculatePortabilityScore());
    }
}