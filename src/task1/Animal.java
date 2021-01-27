package task1;
import java.util.Objects;
public class Animal {
    private String name;
    private int age;
    private boolean tale;
    public Animal(String name, int age, boolean tale) {
        this.name = name;
        this.age = age;
        this.tale = tale;
    }
    @Override
    public String toString() {
        return "Name:'" + name + '\'' +
                ", Age:" + age +
                ", Tale:" + (tale ? "yes" : "no");
    }
    @Override
    public boolean equals(Object o) {
        if (o != null && o.getClass() == this.getClass()) {
            Animal animal = (Animal) o;
            boolean resName = animal.name == this.name;
            boolean resAge = animal.age == this.age;
            boolean resTale = animal.tale == this.tale;
            return resAge && resTale && resName;
        }
        return false;
    }
    @Override
    public int hashCode() {
        int res = 37;
        res = 37 * res + (tale ? 1 : 0);
        res = 37 * res + age;
        res = 37 * res + (name != null ? name.hashCode() : 0);

        return res;
    }
}
