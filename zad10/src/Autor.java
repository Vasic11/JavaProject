public class Autor {
    private String ime;
    private String prezime;
    private  int godinaRodjenja;

    public Autor(String ime, String prezime, int godinaRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
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

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    public int brojGodina(){
        return 2024 - this.godinaRodjenja;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godinaRodjenja=" + godinaRodjenja +
                '}';
    }
}
