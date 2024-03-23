import java.util.Random;

public class Musterija {
    private String ime;
    private String prezime;
    private double stanjeRacuna;
    private boolean posluje;

    public Musterija(String ime, String prezime, double stanjeRacuna) {
        this.ime = ime;
        this.prezime = prezime;
        this.stanjeRacuna = stanjeRacuna;
        poslovanje();
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

    public double getStanjeRacuna() {
        return stanjeRacuna;
    }

    public void setStanjeRacuna(double stanjeRacuna) {
        this.stanjeRacuna = stanjeRacuna;
    }
    public boolean poslovanje(){
        Random random = new Random();
        boolean posluje = random.nextBoolean();
        return posluje;
    }
    public void musterijaInfo(){
        System.out.println("Ime: " + this.ime + " Prezime: " + this.prezime + " Stanje racuna: " + this.stanjeRacuna);
    }
}
