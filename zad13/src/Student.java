import java.util.Objects;

public class Student {
    private String ime;
    private String prezime;
    private  String index;
    private Skola skola;

    public Student(String ime, String prezime, String index, Skola skola) {
        this.ime = ime;
        this.prezime = prezime;
        this.index = index;
        this.skola = skola;
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

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Skola getSkola() {
        return skola;
    }

    public void setSkola(Skola skola) {
        this.skola = skola;
    }

    public void infoStudent(){
        System.out.println("Ime: "+this.ime+ " Prezime: " + this.prezime + " Broj index-a: " + this.index + " Skola: " + this.skola);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", index='" + index + '\'' +
                ", skola=" + skola +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(getIme(), student.getIme()) && Objects.equals(getPrezime(), student.getPrezime()) && Objects.equals(getIndex(), student.getIndex()) && getSkola() == student.getSkola();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIme(), getPrezime(), getIndex(), getSkola());
    }
}
