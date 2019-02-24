public class VendeurBuilder {
    private int numSecu;
    private String nom;
    private String prenom;
    private int echelon;
    private double base;
    private double nbHeures;
    private double chiffreAffaires;
    private double tauxCommission;

    public VendeurBuilder setNumSecu(int numSecu) {
        this.numSecu = numSecu;
        return this;
    }

    public VendeurBuilder setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public VendeurBuilder setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public VendeurBuilder setEchelon(int echelon) {
        this.echelon = echelon;
        return this;
    }

    public VendeurBuilder setBase(double base) {
        this.base = base;
        return this;
    }

    public VendeurBuilder setNbHeures(double nbHeures) {
        this.nbHeures = nbHeures;
        return this;
    }

    public VendeurBuilder setChiffreAffaires(double chiffreAffaires) {
        this.chiffreAffaires = chiffreAffaires;
        return this;
    }

    public VendeurBuilder setTauxCommission(double tauxCommission) {
        this.tauxCommission = tauxCommission;
        return this;
    }

    public Vendeur createVendeur() {
        return new Vendeur(numSecu, nom, prenom, echelon, base, nbHeures, chiffreAffaires, tauxCommission);
    }
}