import java.util.Date;

public class Etudiants extends Personnes{
    private String groupe;
    private String tuteur;
    public Etudiants(String id, String nom, String prenom, Date dob, String email,
                     Long phone, String groupe, String tuteur) {
        super(id, nom, prenom, dob, email, phone);
        this.groupe = groupe;
        this.tuteur = tuteur;
    }
}
