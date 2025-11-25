import java.time.LocalDate;
public class Exam {
    private int id;
    private String titre;
    private Cours cours;
    private LocalDate date;
    private int coefficient;
    public Exam(int id, String titre, Cours cours, LocalDate date, int coefficient) {
        this.id = id;
        this.titre = titre;
        this.cours = cours;
        this.date = date;
        this.coefficient = coefficient;
    }
}
