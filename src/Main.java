public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("idk1", "idk2", "idk3");
        Desktop desktop = new Desktop("idk4", "idk5", "idk6", 5.5);
        Laptop laptop = new Laptop("idk7", "idk8", "idk9", 60, 10.5);

        System.out.println(computer);
        System.out.println(desktop);
        System.out.println(laptop);
    }
}