public class RepresentantBuilder {
    private int numSecu;
    private String nom;
    private String prenom;
    private int echelon;
    private double base;
    private double nbHeures;
    private double chiffreAffaires;
    private double tauxCommission;

    public RepresentantBuilder setNumSecu(int numSecu) {
        this.numSecu = numSecu;
        return this;
    }

    public RepresentantBuilder setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public RepresentantBuilder setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public RepresentantBuilder setEchelon(int echelon) {
        this.echelon = echelon;
        return this;
    }

    public RepresentantBuilder setBase(double base) {
        this.base = base;
        return this;
    }

    public RepresentantBuilder setNbHeures(double nbHeures) {
        this.nbHeures = nbHeures;
        return this;
    }

    public RepresentantBuilder setChiffreAffaires(double chiffreAffaires) {
        this.chiffreAffaires = chiffreAffaires;
        return this;
    }

    public RepresentantBuilder setTauxCommission(double tauxCommission) {
        this.tauxCommission = tauxCommission;
        return this;
    }

    public Representant createRepresentant() {
        return new Representant(numSecu, nom, prenom, echelon, base, nbHeures, chiffreAffaires, tauxCommission);
    }
}