import java.util.Date;

public class Enseignants extends Personnes{
    private String specialites;
    public Enseignants(String id, String nom, String prenom, Date dob, String email, Long phone, String specialites) {
        super(id, nom, prenom, dob, email, phone);
    }

}
