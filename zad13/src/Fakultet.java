import java.util.ArrayList;

public class Fakultet {
    private String nazivFakulteta;
    private ArrayList<Student> studenti = new ArrayList<>();

    public Fakultet(String nazivFakulteta) {
        this.nazivFakulteta = nazivFakulteta;
    }

    public void pregledListe(){
        for (Student s:studenti)
            s.infoStudent();
    }

    public void dodajStudenta(Student student) {
        studenti.add(student);
    }

    public void izbaciStudenta(Student student){
        studenti.remove(student);
    }
}
