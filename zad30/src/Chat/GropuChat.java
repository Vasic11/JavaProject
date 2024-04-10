package Chat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GropuChat implements Chat{
    private List<String>poruke = new ArrayList<>();
    private List<Korisnik>grupa = new ArrayList<>();
    private List<Korisnik>posiljaoci = new ArrayList<>();

    public GropuChat() {
    }
    public void dodajUGrupu(Korisnik korisnik){
        if(!grupa.contains(korisnik))
            grupa.add(korisnik);
    }
    public void ukloniIzGrupe(Korisnik korisnik){
        grupa.remove(korisnik);
    }

    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {
        if(grupa.contains(korisnik))
            for (Korisnik list: grupa)
                if (list.equals(korisnik))
                    return true;
        return false;
    }

    @Override
    public void dodajPoruku(Korisnik korisnik, String poruka) {
        posiljaoci.add(korisnik);
        poruke.add(poruka);
    }

    public List<String> getPoruke() {
        return poruke;
    }

    public void setPoruke(List<String> poruke) {
        this.poruke = poruke;
    }

    public List<Korisnik> getGrupa() {
        return grupa;
    }

    public void setGrupa(List<Korisnik> grupa) {
        this.grupa = grupa;
    }

    public List<Korisnik> getPosiljaoci() {
        return posiljaoci;
    }

    public void setPosiljaoci(List<Korisnik> posiljaoci) {
        this.posiljaoci = posiljaoci;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GropuChat gropuChat)) return false;
        return Objects.equals(getPoruke(), gropuChat.getPoruke()) && Objects.equals(getGrupa(), gropuChat.getGrupa()) && Objects.equals(getPosiljaoci(), gropuChat.getPosiljaoci());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoruke(), getGrupa(), getPosiljaoci());
    }
}
