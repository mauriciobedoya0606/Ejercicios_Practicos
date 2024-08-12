package punto1;

public class MainInmutable {
    public static void main(String[] args) {

        // Creacion para la comparacion de instacion en la clase inmutable
        PersonaInmutable person1 = new PersonaInmutable("John", "Doe", "30");
        PersonaInmutable person2 = new PersonaInmutable("Jane", "Doe", "25");
        PersonaInmutable person3 = new PersonaInmutable("John", "Doe", "30");


        // Comparar instancias con equals
        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.equals(person3): " + person1.equals(person3));


    }
}