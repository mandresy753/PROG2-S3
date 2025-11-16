import java.util.Date;

public class Personnes {
    private String id;
    private String nom;
    private String prenom;
    private Date dob;
    private String email;
    private Long phone;

    public Personnes(String id, String nom, String prenom, Date dob, String email, Long phone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
    }
}
