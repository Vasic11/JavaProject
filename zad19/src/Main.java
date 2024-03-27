//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Korisnik korisnik1 = new Korisnik("Mika","Mikic","1955");
    Korisnik korisnik2 = new Korisnik("Zika","Zikic","2013");
    Korisnik korisnik3 = new Korisnik("Pika","Pikic","1989");

    Account account = new Account();
    account.addKorinski(korisnik1);
    account.addKorinski(korisnik2);
    account.addKorinski(korisnik3);
    account.addKorinski(korisnik1);

    account.listKorisnik();
    account.listEmail();
    


    }
}