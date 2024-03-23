//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    TrafficLight light = new TrafficLight("red",30);
        System.out.println("The light is red: " + light.isRed());
        System.out.println("The light is red: " + light.isGreen());
        light.changeColor("green");
        System.out.println("The light is red: " + light.isRed());
        System.out.println("The light is red: " + light.isGreen());
    }
}