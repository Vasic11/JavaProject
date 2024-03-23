//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Musterija musterija1 = new Musterija("Mita","Mitic",5500.0);
    Musterija musterija2 = new Musterija("Brka","Brkic",345.0);
    Musterija musterija3 = new Musterija("Lola","Lolic",3899.0);
    Musterija musterija4 = new Musterija("Tara","Taric",9500.0);
    Musterija musterija5 = new Musterija("Zora","Zoric",7854.0);

    Firma firma=new Firma("MV");
    firma.dodajMusteriju(musterija1);
    firma.dodajMusteriju(musterija2);
    firma.dodajMusteriju(musterija3);
    firma.dodajMusteriju(musterija4);
    firma.dodajMusteriju(musterija5);

    firma.listaPoslovanja();
        System.out.println("************************");
        firma.listaIzbacenih();
    }
}