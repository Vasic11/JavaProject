package Chat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Korisnik {
    private String prikazanoIme;
    private String korisnickoIme;
    private String lozinka;
    private List<String> korisnici = new ArrayList<>();

    public void dodavanjeKorisnika(Korisnik korisnik, String lozinkaPonovi) {
        if (this.lozinka.equals(lozinkaPonovi) && this.lozinka.length() >= 8 && this.lozinka.matches(".*\\d.*") && this.lozinka.matches(".*[A-Za-z].*") && !korisnici.contains(this.korisnickoIme) && !korisnici.contains(this.lozinka)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.korisnickoIme).append(" " + this.lozinka);
            korisnici.add(sb.toString());
        }
    }
    public boolean korisnikNaMestu(int a){
        if(korisnici.get(a)!=null) {
            korisnikInfo();
            return true;
        }
        else return false;
    }
    public void spisakKorisnika(){
        for(String lista:korisnici)
            lista.toString();
    }

    public Korisnik(String prikazanoIme, String korisnickoIme, String lozinka) {
        this.prikazanoIme = prikazanoIme;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }

    public Korisnik() {
    }

    public void napisiPoruku(Chat a, String poruka){
        //Proveri
        if(a.mozeNapisatiPoruku(this))
            a.dodajPoruku(this,poruka);
    }

    public void korisnikInfo(){
        System.out.println(korisnickoIme + " " + lozinka);
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

    @Override
    public String toString() {
        return "Korisnik{" +
                "korisnickoIme='" + korisnickoIme + '\'' +
                ", lozinka='" + lozinka + '\'' +
                '}';
    }


}
