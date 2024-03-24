//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Student student1 = new Student("Zika","Zikic","55",GodinaStudija.PRVA);
    Student student2 = new Student("Pera","Peric","88",GodinaStudija.PRVA);
    Student student3 = new Student("Kica","Kicic","25",GodinaStudija.DRUGA);
    Student student4 = new Student("Ziza","Zizic","49",GodinaStudija.TRECA);
    Student student5 = new Student("Lola","Lolic","46",GodinaStudija.CETVRTA);
    Student student6 = new Student("Bika","Bikic","65",GodinaStudija.CETVRTA);
    Student student7 = new Student("Nika","Nikic","27",GodinaStudija.MASTER);
    Student student8 = new Student("Cika","Cikic","63",GodinaStudija.TRECA);
    Student student9 = new Student("Vera","Veric","19",GodinaStudija.DOKTORAT);

    Fakultet fakultet = new Fakultet("RAF");

    fakultet.dodajStudenta(student1);
    fakultet.dodajStudenta(student2);
    fakultet.dodajStudenta(student3);
    fakultet.dodajStudenta(student4);
    fakultet.dodajStudenta(student5);
    fakultet.dodajStudenta(student6);
    fakultet.dodajStudenta(student7);
    fakultet.dodajStudenta(student8);
    fakultet.dodajStudenta(student9);

    fakultet.listaStudenta();
    System.out.println("************");
    fakultet.prvaStudenta();
    System.out.println("************");
    fakultet.drugaStudenta();
    System.out.println("************");
    fakultet.trecaStudenta();
    System.out.println("************");
    fakultet.cetvrtaStudenta();
    System.out.println("************");
    fakultet.masterStudenta();
    System.out.println("************");
    fakultet.doktorStudenta();

    
    }
}