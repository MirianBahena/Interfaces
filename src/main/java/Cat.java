import java.security.PublicKey;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String color, int age, String type) {
        super(name, color, age, type);

    }

    @Override
    public String talk() {
        String s = "el Gato " + this.getName() + " dice: " + "miauuu";
        return s;
    }

    public String toString() {
        String texto =
                "\n El nombre del Gato es: " + getName() +
                        "\n su edad es:" + getAge() +
                        "\n su color es: " + getColor() +
                        "\n su tipo es: " + getType();
        return texto;
    }
}
