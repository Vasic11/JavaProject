import java.util.ArrayList;

public class Fakultet {
    private String fakultet;
    private ArrayList<Student>prvaStudent = new ArrayList<>();
    private ArrayList<Student>drugaStudent = new ArrayList<>();
    private ArrayList<Student>trecaStudent = new ArrayList<>();
    private ArrayList<Student>cetvrtaStudent = new ArrayList<>();
    private ArrayList<Student>masterStudent = new ArrayList<>();
    private ArrayList<Student>doktorStudent = new ArrayList<>();
    private ArrayList<Student>sviStudent = new ArrayList<>();

    public Fakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }
    public void dodajStudenta(Student student){
        if (student.getGodinaStudija()==GodinaStudija.PRVA) {
            prvaStudent.add(student);
            sviStudent.add(student);
        }
        else if (student.getGodinaStudija()==GodinaStudija.DRUGA) {
            drugaStudent.add(student);
            sviStudent.add(student);
        } else if (student.getGodinaStudija()==GodinaStudija.TRECA) {
            trecaStudent.add(student);
            sviStudent.add(student);
        } else if (student.getGodinaStudija()==GodinaStudija.CETVRTA) {
            cetvrtaStudent.add(student);
            sviStudent.add(student);
        }
        else if (student.getGodinaStudija()==GodinaStudija.MASTER){
            masterStudent.add(student);
            sviStudent.add(student);
        }
        else if (student.getGodinaStudija()==GodinaStudija.DOKTORAT){
            doktorStudent.add(student);sviStudent.add(student);
        }
        else
            System.out.println("Nije moguce dodati studenta.");
    }
    public void obrisiStudenta(Student student) {
        if (student.getGodinaStudija() == GodinaStudija.PRVA){
            prvaStudent.remove(student);
            sviStudent.remove(student);
        }
        else if (student.getGodinaStudija()==GodinaStudija.DRUGA) {
            drugaStudent.remove(student);
            sviStudent.remove(student);
        } else if (student.getGodinaStudija()==GodinaStudija.TRECA) {
            trecaStudent.remove(student);
            sviStudent.remove(student);
        } else if (student.getGodinaStudija()==GodinaStudija.CETVRTA) {
            cetvrtaStudent.remove(student);
            sviStudent.remove(student);
        }
        else if (student.getGodinaStudija()==GodinaStudija.MASTER){
            masterStudent.remove(student);
            sviStudent.remove(student);
        }
        else if (student.getGodinaStudija()==GodinaStudija.DOKTORAT){
            doktorStudent.remove(student);
            sviStudent.remove(student);
        }
        else
            System.out.println("Nije moguce izbrisati studenta.");
    }
    public void listaStudenta(){
        for (Student studenti: sviStudent)
            studenti.infoStudenta();
    }
    public void prvaStudenta(){
        for (Student studenti: prvaStudent)
            studenti.infoStudenta();
    }
    public void drugaStudenta(){
        for (Student studenti: drugaStudent)
            studenti.infoStudenta();
    }
    public void trecaStudenta(){
        for (Student studenti: trecaStudent)
            studenti.infoStudenta();
    }
    public void cetvrtaStudenta(){
        for (Student studenti: cetvrtaStudent)
            studenti.infoStudenta();
    }
    public void masterStudenta(){
        for (Student studenti: masterStudent)
            studenti.infoStudenta();
    }
    public void doktorStudenta(){
        for (Student studenti: doktorStudent)
            studenti.infoStudenta();
    }


}
