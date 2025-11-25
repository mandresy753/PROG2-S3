import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Notes {
    private Exam exam;
    private Etudiants etudiant;
    private double valeur;
    private List<ChangeNote> historique = new ArrayList<>();

    public Notes(Exam exam, Etudiants etudiant, double valeurInitiale) {
        this.exam = exam;
        this.etudiant = etudiant;
        this.valeur = valeurInitiale;
    }

    public Exam getExam() { return exam; }
    public Etudiants getEtudiant() { return etudiant; }
    public double getValeur() {
        if (!historique.isEmpty()) {
            return historique.get(historique.size() - 1).getNouvelleValeur();
        }
        return valeur;
    }
    public List<ChangeNote> getHistorique() { return historique; }

    public void modifierNote(double nouvelleValeur, String motif) {
        ChangeNote cn = new ChangeNote(nouvelleValeur, Instant.now(), motif);
        historique.add(cn);
        this.valeur = nouvelleValeur;
    }
}
