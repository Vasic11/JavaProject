public class PitanjeSlobodanOdgovor extends Pitanje {
    private int brojLinija;

    public PitanjeSlobodanOdgovor(String tekstPitanja) {
        super(tekstPitanja);
    }

    @Override
    public boolean spremnoZaStampu() {
        if(brojLinija>0)
            return true;
        else
            return false;
    }
    public String vratiZaStampu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int  br= 0;br<=brojLinija;br++)
            stringBuilder.append(br).append("\n");
        return stringBuilder.toString();
    }

    public int getBrojLinija() {
        return brojLinija;
    }

    public void setBrojLinija(int brojLinija) {
        this.brojLinija = brojLinija;
    }
}
