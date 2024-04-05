package Chat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GroupChat implements Chat {
    private List<String>poruke = new ArrayList<>();
    private List<Korisnik>grupa =  new ArrayList<>();
    private List<Korisnik>posiljaoc = new ArrayList<>();
    public GroupChat() {
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
            return true;
        else
            return false;
        /* Mislim da moze i na ovaj nacin da se proveri al ovaj gore nacin je brzi
            for(Korisnik lista:grupa)
                if(lista.eqals(korisnik)
                    return true
                else
                    return false
         */
    }

    @Override
    public void dodajPoruku(Korisnik korisnik, String poruka) {
        posiljaoc.add(korisnik);
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

    public List<Korisnik> getPosiljaoc() {
        return posiljaoc;
    }

    public void setPosiljaoc(List<Korisnik> posiljaoc) {
        this.posiljaoc = posiljaoc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroupChat groupChat)) return false;
        return Objects.equals(getPoruke(), groupChat.getPoruke()) && Objects.equals(getGrupa(), groupChat.getGrupa()) && Objects.equals(getPosiljaoc(), groupChat.getPosiljaoc());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoruke(), getGrupa(), getPosiljaoc());
    }
}
