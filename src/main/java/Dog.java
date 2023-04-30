public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, String color, int age, String type) {
        super(name, color, age, type);
    }

    @Override
    public String talk() {
        String s = "El perro " + this.getName() + " dice: " + "Guauu";
        return s;
    }

    public String toString() {
        String texto =
                "\nEl nombre del perro es: " + getName() +
                "\n su edad es: " + getAge() + " años" +
                "\n su color es: " + getColor() +
                "\n su tipo es: " + getType();

        return texto;
    }
}
