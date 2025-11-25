public class Cours {
    private int id;
    private String label;
    private int credit;
    private Enseignants enseignant;
    public Cours(int id, String label, int credit, Enseignants enseignant) {
        this.id = id;
        this.label = label;
        this.credit = credit;
        this.enseignant = enseignant;
    }
}
