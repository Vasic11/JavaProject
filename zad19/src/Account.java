import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private List<Korisnik> korisnici = new ArrayList<>();

    public Account() {

    }
    public void addKorinski(Korisnik korisnik){
        if (!korisnici.contains(korisnik))
            korisnici.add(korisnik);
        else
            System.out.println("Korisnik vec postoji.");
    }
    public void removeKorisnik(Korisnik korisnik){
        korisnici.remove(korisnik);
    }
    public void listKorisnik(){
        for (Korisnik list:korisnici)
            list.infoKorinsik();
    }
    public void listEmail(){
        for (Korisnik list:korisnici)
            list.createEmail();
    }

}
