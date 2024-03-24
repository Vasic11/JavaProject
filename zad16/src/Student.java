public class Student {
    private String ime;
    private String prezime;
    private String brojIndeksa;
    private GodinaStudija godinaStudija;

    public Student(String ime, String prezime, String brojIndeksa, GodinaStudija godinaStudija) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.godinaStudija = godinaStudija;
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

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public GodinaStudija getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(GodinaStudija godinaStudija) {
        this.godinaStudija = godinaStudija;
    }
    public void infoStudenta(){
        System.out.println("Ime: " + this.ime + " Prezime: " + this.prezime + " Broj indeksa: "  + this.brojIndeksa + " Godina studija: " + this.godinaStudija);
    }
}
