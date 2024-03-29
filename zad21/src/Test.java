import java.util.ArrayList;
import java.util.List;

public class Test implements ZaStampanje {
    private String naslov;
    private List<Pitanje>pitanja = new ArrayList<>();
    public Test() {
    }

    @Override
    public String vratiZaStampu() {
        String vraca = "Naslov: "+"\n";
        String vraca1 = "Ukupan broj poena: " + "\n";
        StringBuilder stringBuilder =new StringBuilder();
        for (Pitanje lista:pitanja)
            stringBuilder.append(lista).append("\n");
        return vraca + vraca1 + stringBuilder.toString();
    }

    @Override
    public boolean spremnoZaStampu() {
        if (naslov!=null && !naslov.isEmpty())
            return false;
        else
            return true;
    }
    public boolean dodajPitanje(Pitanje pitanje){
        return false;
    }
}
