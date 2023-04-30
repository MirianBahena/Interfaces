package AbstracAnimal;

public class PetStore {
    public static void main(String[] args) {
        Cat Garfield= new Cat("Garfield", "Naranja", 5);
        Cat Felix=new Cat("Felix", "Gris", 3);
        Dog Firulais= new Dog("Firulais", "Negro", 3);
        Rooster Claudio=new Rooster("Claudio", "Blanco", 5);


        System.out.println("Ejemplo de polimorfismo usando clases abstractas");
        System.out.println("invocando metodo toString");
        System.out.println(Garfield.toString());
        System.out.println(Felix.toString());
        System.out.println(Firulais.toString());
        System.out.println(Claudio.toString());


    }
}
