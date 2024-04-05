package Chat;

public class Proba {
    public static void main(String[] args) {


        Korisnik k1 = new Korisnik("Mijhalo", "MikiBekac123456", "LepoVreme123");
        Korisnik k2 = new Korisnik("Beka", "BekaLeptici951", "Sambakero7548");
        Korisnik k3 = new Korisnik("Lala", "LalaLupic4567", "LikovnoMiva5823");
        Korisnik k4 = new Korisnik("Cikoli", "CikoCaka48735", "Cojulok56546");
        Korisnik k5 = new Korisnik("Cikoli", "CikoCaka48735", "Cojulok56546");

        CreateKorisnika cr = new CreateKorisnika();
        cr.dodavanjeKorisnika(k1,"LepoVreme123");
        cr.dodavanjeKorisnika(k2,"Sambakero7548");
        cr.dodavanjeKorisnika(k3,"LikovnoMiva5823");
        cr.dodavanjeKorisnika(k4,"Cojulok56546");
        cr.dodavanjeKorisnika(k5,"Cojulok56546");
        cr.prikazKorinika();


        /*Proba2 p2 = new Proba2();
        p2.dodavanjeKorisnika(k1,"LepoVreme123");
        p2.dodavanjeKorisnika(k2,"Sambakero7548");
        p2.dodavanjeKorisnika(k3,"LikovnoMiva5823");
        p2.dodavanjeKorisnika(k4,"Cojulok56546");
        p2.prikazKorinika();
    */
    }



}
