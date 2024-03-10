//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Michael",21);
        Person person2 = new Person("Lux",26);

        System.out.println(person1.getName()+" is " + person1.getAge()+" years old.");
        System.out.println(person2.getName()+" is " + person2.getAge()+" years old.");
    }
}