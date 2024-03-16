public class Knjiga {
    private String naslov;
    private double ocena;
    private  String autor;

    public Knjiga(String naslov, double ocena, String autor) {
        this.naslov = naslov;
        this.ocena = ocena;
        this.autor = autor;
        setOcena(ocena);


    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
        if (this.ocena>10){
            System.out.println("Presli ste granicu.");
        } else if (this.ocena<0) {
            System.out.println("Ispod granice je ocena.");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "naslov='" + naslov + '\'' +
                ", ocena=" + ocena +
                ", autor='" + autor + '\'' +
                '}';
    }
}