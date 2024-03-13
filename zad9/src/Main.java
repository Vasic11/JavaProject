//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Mihajlo","Vasic",54,Smer.RI,2023,8.5);
        System.out.println(student1.toString());
        System.out.println(student1.email());
    }
}