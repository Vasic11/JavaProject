//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Dog dog1 = new Dog("Mica","Golden Retriever");
    Dog dog2 = new Dog("Zica","Bulldog");

        System.out.println(dog1.getName() + " is a " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a " + dog2.getBreed());

        System.out.println("\nSet the new Breed of dog1 and new name of dog2:\n");

        dog1.setBreed("Labrador");
        dog2.setName("Mikica");

        System.out.println(dog1.getName() + " is a " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a " + dog2.getBreed());
    }
}