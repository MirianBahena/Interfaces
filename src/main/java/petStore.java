public class petStore {
    public static void main(String[] args) {
        Cat Garfield= new Cat("Garfield", "Naranja", 5, "Gato" );
        Dog Firulais= new Dog("Firluais","Manchado", 3, "perro");
        Rooster Claudio= new Rooster("Claudio", "Blanco con rojo", 1,"Gallo" );

        System.out.println("Ejemplo de polimorfismo");
        System.out.println(Garfield.talk());
        System.out.println(Firulais.talk());
        System.out.println(Claudio.talk());


        System.out.println("Metodo toString " + Firulais.toString());
        System.out.println("Metodo toString " + Claudio. toString());
        System.out.println("Metodo toString " + Garfield.toString());


    }


}
