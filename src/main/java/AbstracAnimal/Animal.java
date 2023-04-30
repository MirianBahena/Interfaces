package AbstracAnimal;

public abstract class Animal {
    protected String Name;
    protected String color;
    protected int age;

    public Animal() {
    }

    public Animal(String name, String color, int age) {
        Name = name;
        this.color = color;
        this.age = age;
    }

    public abstract  String talk();

}
