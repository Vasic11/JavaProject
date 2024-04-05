
package Chat;

import java.util.ArrayList;
import java.util.List;

public class CreateKorisnika extends Korisnik{
    private List<String> korisnici = new ArrayList<>();

    public CreateKorisnika(String prikazanoIme, String korisnickoIme, String lozinka) {
        super(prikazanoIme, korisnickoIme, lozinka);
    }

    public CreateKorisnika() {
    }

    public void dodavanjeKorisnika(Korisnik korisnik, String lozinkaPonovi) {
        if (korisnik.getLozinka().equals(lozinkaPonovi) && korisnik.getLozinka().length() >= 8 && korisnik.getLozinka().matches(".*\\d.*") && korisnik.getLozinka().matches(".*[A-Za-z].*") && !korisnici.contains(korisnik.getPrikazanoIme()) && !korisnici.contains(korisnik.getLozinka())) {
            StringBuilder sb = new StringBuilder();
            sb.append(korisnik.getKorisnickoIme()).append(" " + korisnik.getLozinka());
            korisnici.add(sb.toString());
        }
        else
            System.out.println("Nije moguce dodati korisnika");
    }
    public boolean korisnikNaMestu(int a){
        if(korisnici.get(a)!=null) {
            ((Korisnik)korisnici).korisnikInfo();
            return true;
        }
        else return false;
    }
    public void korisnikInfo(){
        System.out.println(((Korisnik)korisnici).getKorisnickoIme() + " " +((Korisnik)korisnici).getLozinka());
    }
    public void prikazKorinika(){
        for (String lista:korisnici)
            System.out.println(lista);;
    }


}



