public class Student {
    private String ime;
    private String prezime;
    private int index;
    private Smer smer;
    private int godinaUpisa;

    private double prosek;



    private String generisiMejl(){
        return (this.ime.charAt(0) + this.prezime + this.index + this.godinaUpisa%100 + this.smer + "raf@.rs").toLowerCase();
    }

    public Student(String ime, String prezime, int index, Smer smer, int godinaUpisa, double prosek) {
        this.ime = ime;
        this.prezime = prezime;
        this.index = index;
        this.smer = smer;
        this.godinaUpisa = godinaUpisa;
        this.prosek = prosek;
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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Smer getSmer() {
        return smer;
    }

    public void setSmer(Smer smer) {
        this.smer = smer;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(int godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public double getProsek() {
        return prosek;
    }

    public void setProsek(double prosek) {
        this.prosek = prosek;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", index=" + index +
                ", smer=" + smer +
                ", godinaUpisa=" + godinaUpisa +
                ", prosek=" + prosek +
                '}';
    }
    public String email(){
        return generisiMejl();
    }
}
