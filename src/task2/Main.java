package task2;

public class Main {
    public static void main(String[] args) {
        Device monitor1 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        Device adapter1 = new EthernetAdapter("Lenovo", 500, "AB1234567CD",  1000, "0050B65BCA6A");
        Device adapter2 = new EthernetAdapter("Lenovo", 500, "AB1234567CD",  1000, "0050B65BCA6A");
        System.out.println(monitor1);
        System.out.println(adapter1);
        System.out.println(adapter2);
        System.out.println(adapter1.equals(monitor1));
        System.out.println(adapter1.equals(adapter2));
        System.out.println(monitor1.hashCode());
        System.out.println(adapter1.hashCode());
        System.out.println(adapter2.hashCode());
    }
}
