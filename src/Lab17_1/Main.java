package Lab17_1;

public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Samsung", 120, "AB1234567CD");
        Device device2 = new Device("Samsung", 120, "AB1234567CD");

        System.out.println("device1.equals(device2): " + device1.equals(device2));
        System.out.println("device1.hashCode(): " + device1.hashCode());
        System.out.println("device2.hashCode(): " + device2.hashCode());


        Monitor monitor1 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        Monitor monitor2 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);

        System.out.println("monitor1.equals(monitor2): " + monitor1.equals(monitor2));
        System.out.println("monitor1.hashCode(): " + monitor1.hashCode());
        System.out.println("monitor2.hashCode(): " + monitor2.hashCode());


        EthernetAdapter adapter1 = new EthernetAdapter("Сетевой адаптер", 100, "XZ9876543WQ", 300, 132);
        EthernetAdapter adapter2 = new EthernetAdapter("Сетевой адаптер", 100, "XZ9876543WQ", 300, 123);

        System.out.println("adapter1.equals(adapter2): " + adapter1.equals(adapter2));
        System.out.println("adapter1.hashCode(): " + adapter1.hashCode());
        System.out.println("adapter2.hashCode(): " + adapter2.hashCode());

    }
}
