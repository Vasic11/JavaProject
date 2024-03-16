//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Knjiga knjiga1 = new Knjiga("Na Drini cuprija",5,"Ivo Andric");
        System.out.println(knjiga1.toString());
        knjiga1.setOcena(88);
        knjiga1.setOcena(-5);
        knjiga1.setOcena(10);
        System.out.println(knjiga1.toString());
    }
}