//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Autor autor1 = new Autor("Robert", "Dzordan",1948);
        System.out.println(autor1.brojGodina());
        System.out.println(autor1.toString());
        autor1.setIme("Bobert");
        System.out.println(autor1.toString());
    }
}