import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Stamparija {
    private List<ZaStampanje>zaStampanjes = new ArrayList<>();

    public Stamparija() {
    }
    public void dodajZaStampanje(ZaStampanje zaStampanje){

    }
    public void odstampajOdDo(int i, int a){
        Test test = new Test();
        if(test.spremnoZaStampu())
            for (;i<a;i++)
                System.out.println(zaStampanjes.get(i));
        else
            System.out.println("Nije spremno za stampu");
    }
}



