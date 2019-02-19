public class TechnicienBuilder {
    private int numSecu;
    private String nom;
    private String prenom;
    private int echelon;
    private double base;
    private double nbHeures;

    public TechnicienBuilder setNumSecu(int numSecu) {
        this.numSecu = numSecu;
        return this;
    }

    public TechnicienBuilder setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public TechnicienBuilder setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public TechnicienBuilder setEchelon(int echelon) {
        this.echelon = echelon;
        return this;
    }

    public TechnicienBuilder setBase(double base) {
        this.base = base;
        return this;
    }

    public TechnicienBuilder setNbHeures(double nbHeures) {
        this.nbHeures = nbHeures;
        return this;
    }

    public Technicien createTechnicien() {
        return new Technicien(numSecu, nom, prenom, echelon, base, nbHeures);
    }
}