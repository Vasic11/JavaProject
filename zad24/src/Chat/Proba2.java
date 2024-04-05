package Chat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Proba2 {
    private List<String>korisnici = new ArrayList<>();

    public Proba2() {
    }
    public void dodavanjeKorisnika(Korisnik korisnik, String lozinkaPonovi) {
        if (korisnik.getLozinka().equals(lozinkaPonovi) && korisnik.getLozinka().length() >= 8 && korisnik.getLozinka().matches(".*\\d.*") && korisnik.getLozinka().matches(".*[A-Za-z].*") && !korisnici.contains(korisnik.getKorisnickoIme()) && !korisnici.contains(korisnik.getLozinka())) {
            StringBuilder sb = new StringBuilder();
            sb.append(korisnik.getKorisnickoIme()).append(" " + korisnik.getLozinka());
            korisnici.add((sb).toString());
        }
    }
    public void prikazKorinika(){
        for (String lista:korisnici)
            System.out.println(lista);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Proba2 proba2)) return false;
        return Objects.equals(korisnici, proba2.korisnici);
    }

    @Override
    public int hashCode() {
        return Objects.hash(korisnici);
    }
}
