public class Employe {

    private int numSecu;
    private String nom;
    private String prenom;
    private int echelon;
    private double base;
    private double nbHeures;

    public Employe(int numSecu, String nom, String prenom, int echelon, double base, double nbHeures) {
        this.numSecu = numSecu;
        this.nom = nom;
        this.prenom = prenom;
        this.echelon = echelon;
        this.base = base;
        this.nbHeures = nbHeures;
    }

    @Override
    public String toString() {
        return "Employe {" +
                "Numéro de Sécu : " + numSecu +
                ", Nom : " + nom + '\'' +
                ", Prénom : " + prenom + '\'' +
                ", Echelon : " + echelon +
                ", Base : " + base +
                ", Nombre d'heures : " + nbHeures +
                ", Salaire brut : " + salaireBrut() + " €" +
                ", Salaire net : " + salaireNet() + " €" +
                '}';
    }

    public double salaireBrut() {
        double resultat;
        return  resultat = base * nbHeures;
    }

    public double salaireNet() {
        double resultat;
        return resultat = salaireBrut() * 80 / 100;
    }
}