package Chat;

import java.util.List;
import java.util.Objects;

public class Registracija {
    private List<Korisnik>registrovaniKorisnici;

    public Registracija() {;
    }
    public void registrujKorisnika(Korisnik korisnik, String potvrdiLozinku){
        if(korisnik.getLozinka().equals(potvrdiLozinku)&& !registrovaniKorisnici.contains(korisnik.getKorisnickoIme()) && korisnik.getLozinka().length()>=8 && korisnik.getLozinka().matches(".*[A-Za-z0-9].*"))
            registrovaniKorisnici.add(korisnik);
    }
    public  void izbaciKorinsikaIzListe(Korisnik korisnik){
        registrovaniKorisnici.remove(korisnik);
    }

    public List<Korisnik> getRegistrovaniKorisnici() {
        return registrovaniKorisnici;
    }

    public void setRegistrovaniKorisnici(List<Korisnik> registrovaniKorisnici) {
        this.registrovaniKorisnici = registrovaniKorisnici;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Registracija that)) return false;
        return Objects.equals(getRegistrovaniKorisnici(), that.getRegistrovaniKorisnici());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRegistrovaniKorisnici());
    }
}
