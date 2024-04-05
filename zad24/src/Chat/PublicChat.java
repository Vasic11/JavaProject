package Chat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PublicChat implements Chat {
    private List<String> poruke = new ArrayList<>();

    public PublicChat() {
    }


    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {
        return false;
    }

    @Override
    public void dodajPoruku(Korisnik korisnik, String poruka) {
        StringBuilder sb = new StringBuilder();
        sb.append("["+korisnik+"] ").append("==> ").append("["+poruka+"]");
        poruke.add(sb.toString());
    }

    public List<String> getPoruke() {
        return poruke;
    }

    public void setPoruke(List<String> poruke) {
        this.poruke = poruke;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PublicChat that)) return false;
        return Objects.equals(getPoruke(), that.getPoruke());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoruke());
    }
}
