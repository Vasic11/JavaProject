import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TransferQueue;

public class PitanjePovezivanje extends Pitanje{
    private List<String>prvaKolona = new ArrayList<>();
    private List<String>drugaKolona = new ArrayList<>();
    private int brojPraznihMesta;

    public PitanjePovezivanje(String tekstPitanja) {
        super(tekstPitanja);
    }

    @Override
    public boolean spremnoZaStampu() {
        if(prvaKolona.size()>=1 && drugaKolona.size()>=1)
            return true;
        else
            return false;
    }
}
