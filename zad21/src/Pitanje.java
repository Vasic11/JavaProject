public abstract class Pitanje implements ZaStampanje {
    private String tekstPitanja;
    private int redniBroj;
    private int brojPoena;

    public Pitanje(String tekstPitanja) {
        this.tekstPitanja = tekstPitanja;
    }
    public String vratiZaStampu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int br = 0; br <= redniBroj; br++) {
            stringBuilder.append(br).append(". (").append(this.brojPoena).append(") ").append(this.tekstPitanja).append("\n");
        }
        return stringBuilder.toString();
    }

    public String getTekstPitanja() {
        return tekstPitanja;
    }

    public void setTekstPitanja(String tekstPitanja) {
        this.tekstPitanja = tekstPitanja;
    }

    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }
}
