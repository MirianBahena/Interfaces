package AbstracAnimal;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String talk(){
        return "guauu";

    }
    public String toString(){
        return super.Name + " Es un perro " +
                " de color " + super.color +
                " tiene " + super.age +
                " años " + " y dice " + this.talk();

    }
}
