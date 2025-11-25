/*private void ajouterHistorique(double ancienneValeur, double nouvelleValeur) {
        ChangeNote change = new ChangeNote(ancienneValeur, nouvelleValeur, Instant.now());
        historique.add(change);
    }*/

import java.time.Instant;

public class ChangeNote {
    private double nouvelleValeur;
    private Instant dateModification;
    private String motif; // petite phrase expliquant le changement

    public ChangeNote(double nouvelleValeur, Instant dateModification, String motif) {
        this.nouvelleValeur = nouvelleValeur;
        this.dateModification = dateModification;
        this.motif = motif;
    }

    public double getNouvelleValeur() {
        return nouvelleValeur;
    }

    public Instant getDateModification() {
        return dateModification;
    }

    public String getMotif() {
        return motif;
    }
}
