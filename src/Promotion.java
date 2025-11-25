import java.util.ArrayList;
import java.util.List;

public class Promotion {
    private int id;
    private String nom;                       // Exemple : "L1 Informatique 2024"
    private List<Etudiants> etudiants;        // Liste des étudiants
    private List<Cours> cours;                // Liste des cours de la promotion

    public Promotion(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.etudiants = new ArrayList<>();
        this.cours = new ArrayList<>();
    }
}
