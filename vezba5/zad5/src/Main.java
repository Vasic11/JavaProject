//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Rectangle rec = new Rectangle(7,12);
        System.out.println("The area of the rectangle is " + rec.getArea());
        System.out.println("The perimeter of the rectangle is " + rec.getPerimeter());

        rec.setWidth(6);
        rec.setHeight(12);

        System.out.println("The area of the rectangle is " + rec.getArea());
        System.out.println("The perimeter of the rectangle is " + rec.getPerimeter());
    }
}