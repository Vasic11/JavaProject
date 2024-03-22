//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Student student1 = new Student("Miki", "Mikic","2023",Skola.GIMNAZIJA);
    Student student2 = new Student("Zika", "Zikic", "2158", Skola.EKONOMKA);
    Student student3 = new Student("Pera","Peric", "5698",Skola.ELEKTRO);
    Student student4 = new Student("Miki", "Mikic","2023",Skola.GIMNAZIJA);

    Fakultet faks1=new Fakultet("RAF");
    faks1.dodajStudenta(student1);
    faks1.dodajStudenta(student2);
    faks1.dodajStudenta(student3);
    faks1.pregledListe();
        System.out.println("***********************************************");
    faks1.izbaciStudenta(student2);
    faks1.pregledListe();
        System.out.println(student1.equals(student4));
        System.out.println(student1.hashCode());
        System.out.println(student4.hashCode());

        Account account1 = new Account("Vaske","Vaske123","Miki");
        Account account2 = new Account("Pera","Peric","PeraPeric123");
        Account account3 = new Account("Zika","Zikic","ZikaZikic567");

        Baza baza1 = new Baza("Vaske","Vaske123","BazaBazic587","Baza123");
        Baza baza2 = new Baza("Pera","Peric","BazaBazic587","Baza123");
        Baza baza3 = new Baza("Zika","Zikic","BazaBazic587","Baza123");
        account1.nalogInfo();
        baza1.dodajNalohg(account1,"Vaske","Vaske123");
        baza2.dodajNalohg(account2,"Pera","Peric");
        baza3.dodajNalohg(account3,"Zika","Zikic");
        baza1.pregledListe();
        




    }
}