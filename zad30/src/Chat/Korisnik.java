package Chat;

import java.util.Objects;

public class Korisnik {
    private String prikazanoIme;
    private String korisnickoIme;
    private String lozinka;

    public Korisnik(String prikazanoIme, String korisnickoIme, String lozinka) {
        this.prikazanoIme = prikazanoIme;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }
    public void napisiPoruku(Chat chat, String poruka){
        if(chat.mozeNapisatiPoruku(this))
            chat.dodajPoruku(this,poruka);
    }

    public String getPrikazanoIme() {
        return prikazanoIme;
    }

    public void setPrikazanoIme(String prikazanoIme) {
        this.prikazanoIme = prikazanoIme;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Korisnik korisnik)) return false;
        return Objects.equals(getPrikazanoIme(), korisnik.getPrikazanoIme()) && Objects.equals(getKorisnickoIme(), korisnik.getKorisnickoIme()) && Objects.equals(getLozinka(), korisnik.getLozinka());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrikazanoIme(), getKorisnickoIme(), getLozinka());
    }
}
