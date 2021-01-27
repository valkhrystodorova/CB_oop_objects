package task1;

public class Main {
    public static void main(String[] args) {
Animal cat1 = new Animal("Snowflake", 5, true);
Animal bear1 = new Animal("Pooh", 8, true);
        System.out.println(cat1);
        System.out.println(bear1);
        System.out.println(cat1.equals(bear1));
        System.out.println(cat1.hashCode());
        System.out.println(bear1.hashCode());

    }
}
