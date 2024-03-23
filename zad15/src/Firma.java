import java.util.ArrayList;

public class Firma {
    private String ime;
    private ArrayList<Musterija>poslujemo = new ArrayList<>();
    private ArrayList<Musterija>nePoslujemo = new ArrayList<>();

    public Firma(String ime) {
        this.ime = ime;
    }
    public void listaPoslovanja(){
        for(Musterija pos:poslujemo)
            pos.musterijaInfo();
    }
    public  void listaIzbacenih(){
        for(Musterija pos:nePoslujemo)
            pos.musterijaInfo();
    }
    public void dodajMusteriju(Musterija musterija){
        if(musterija.poslovanje()&&musterija.getStanjeRacuna()>5000.0){
            poslujemo.add(musterija);
        }
        else
            nePoslujemo.add(musterija);
    }

}
