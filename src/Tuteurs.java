import java.util.Date;

public class Tuteurs extends Personnes{
    private String description;
    public Tuteurs(String id, String nom, String prenom, Date dob, String email, Long phone) {
        super(id, nom, prenom, dob, email, phone);
    }
}