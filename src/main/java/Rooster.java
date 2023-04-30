public class Rooster extends Animal {
    public Rooster() {
    }

    public Rooster(String name, String color, int age, String type) {
        super(name, color, age, type);
    }
    @Override
    public String talk() {
        String s = "El Gallo "  + this.getName() + " dice: "  + "Kikiriki";
        return s;
    }

    public String toString(){
        String texto=
                "\n El nombre del gallo es: " + getName() +
                "\n su edad es:" + getAge() +
                "\n su color es: " + getColor() +
                "\n su tipo es: " + getType();
        return texto;
    }
}
