import java.util.Objects;

public class Korisnik {
    private String ime;
    private String prezime;
    private String godRodjenja;

    public Korisnik(String ime, String prezime, String godRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.godRodjenja = godRodjenja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getGodRodjenja() {
        return godRodjenja;
    }

    public void setGodRodjenja(String godRodjenja) {
        this.godRodjenja = godRodjenja;
    }
    public void createEmail(){
        System.out.println(this.ime.toLowerCase().charAt(0) + this.prezime.toLowerCase() + this.prezime + "@gmail.com");
    }
    public void infoKorinsik(){
        System.out.println("Ime: " + this.ime + ", Prezime: " + this.prezime + ", Godina rodjenja: " + this.godRodjenja);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Korisnik korisnik)) return false;
        return Objects.equals(getIme(), korisnik.getIme()) && Objects.equals(getPrezime(), korisnik.getPrezime()) && Objects.equals(getGodRodjenja(), korisnik.getGodRodjenja());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIme(), getPrezime(), getGodRodjenja());
    }
}
