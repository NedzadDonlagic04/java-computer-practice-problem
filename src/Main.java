public class Main {
    public static void main(String[] args) {
        Device device = new Device("modelName", "manufacturerName");
        Laptop laptop = new Laptop("Ideapad S12", "Lenovo", "Windows", 50, 1.55);
        Netbook netbook = new Netbook("Ideapad S12", "Lenovo", "Windows", 50, 1.55);
        Mp3Player mp3Player = new Mp3Player("modelName", "manufacturerName", 5, 10);

        System.out.println(device);
        System.out.println(laptop);
        System.out.println(netbook);
        System.out.println(mp3Player);
        System.out.println();


    }
}