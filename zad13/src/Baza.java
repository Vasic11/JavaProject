import java.util.ArrayList;
import java.util.Objects;

public class Baza extends Account{

    private String baza;
    private ArrayList<Account>listaAcc= new ArrayList<>();

    public Baza(String username, String passwd, String nalog, String baza) {
        super(username, passwd, nalog);
        this.baza = baza;
    }

    public void pregledListe(){
        for (Account acc:listaAcc)
            acc.nalogInfo();
    }
    public void izbaciAcc(Account nalog){
        listaAcc.remove(nalog);
    }
    public void dodajNalohg(Account nalog,String username,String pass){
        if((this.getUsername().equals(username))&&(this.getPasswd().equals(pass))){
            if (!listaAcc.contains(nalog))
                listaAcc.add(nalog);
            else
                System.out.println("Nalog vec postoji.");
        }
        else
            System.out.println("Pogresno korisnicko ime ili password.");
    }

}
