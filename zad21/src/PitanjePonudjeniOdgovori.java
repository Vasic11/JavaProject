import java.util.ArrayList;
import java.util.List;

public class PitanjePonudjeniOdgovori extends Pitanje{
    private List<String>ponudjeniOdgovori = new ArrayList<>();

    public PitanjePonudjeniOdgovori(String tekstPitanja) {
        super(tekstPitanja);
    }

    @Override
    public boolean spremnoZaStampu() {
        if(ponudjeniOdgovori.size()>=2)
            return true;
        else
            return false;
    }
    public String vratiZaStampu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (String lista:ponudjeniOdgovori)
            stringBuilder.append(lista).append("\n");
        for (int br=0;br<=getRedniBroj();br++)
            stringBuilder.append(br).append(". (").append(this.getBrojPoena()).append(") ").append(this.getTekstPitanja()).append("\n");
        return stringBuilder.toString();
    }
    public void dodajOdgovor(String dodaj){

    }
}
