package Chat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrivateChat implements Chat{
    private List<String> poruke = new ArrayList<>();
    private Korisnik k1;
    private Korisnik k2;
    private Korisnik prethodniPosiljalac;

    public PrivateChat(Korisnik k1, Korisnik k2) {
        this.k1 = k1;
        this.k2 = k2;
    }

    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {
        if(prethodniPosiljalac==null){
            korisnik = k1;
            prethodniPosiljalac = k1;
            return true;
        } else if (prethodniPosiljalac == k1) {
            korisnik=k2;
            prethodniPosiljalac=k2;
            return true;
        } else if (prethodniPosiljalac == k2) {
            korisnik = k1;
            prethodniPosiljalac =k1;
            return true;
        }
        return false;
    }

    @Override
    public void dodajPoruku(Korisnik korisnik, String poruka) {
        prethodniPosiljalac = korisnik;
        poruke.add(poruka);
    }

    public List<String> getPoruke() {
        return poruke;
    }

    public void setPoruke(List<String> poruke) {
        this.poruke = poruke;
    }

    public Korisnik getK1() {
        return k1;
    }

    public void setK1(Korisnik k1) {
        this.k1 = k1;
    }

    public Korisnik getK2() {
        return k2;
    }

    public void setK2(Korisnik k2) {
        this.k2 = k2;
    }

    public Korisnik getPrethodniPosiljalac() {
        return prethodniPosiljalac;
    }

    public void setPrethodniPosiljalac(Korisnik prethodniPosiljalac) {
        this.prethodniPosiljalac = prethodniPosiljalac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrivateChat that)) return false;
        return Objects.equals(getPoruke(), that.getPoruke()) && Objects.equals(getK1(), that.getK1()) && Objects.equals(getK2(), that.getK2()) && Objects.equals(getPrethodniPosiljalac(), that.getPrethodniPosiljalac());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoruke(), getK1(), getK2(), getPrethodniPosiljalac());
    }
}
