package hw2;

/**
 * Created by Liberstina on 12.02.2015.
 */
public class Dog {
    //Создать класс Dog, который будет содержать 2 поля name и says.
    // В main( ) создать 2 экземпляра класса с name “spot” (says, “Ruff!”) и “scruffy” (says, “Wurf!”).
    // И распечатать поля объектов.
    String name;
    String says;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "spot";
        dog1.says = "Ruff!";
        dog2.name = "scruffy";
        dog2.says = "Wurf!";
        System.out.println(dog1.name + " says: " + dog1.says);
        System.out.println(dog2.name + " says: " + dog2.says);

    }

}
