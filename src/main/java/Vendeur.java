public class Vendeur extends Commercial {

    public Vendeur(int numSecu, String nom, String prenom, int echelon, double base, double nbHeures, double chiffreAffaires, double tauxCommission) {
        super(numSecu, nom, prenom, echelon, base, nbHeures, chiffreAffaires, tauxCommission);
    }

    @Override
    public double salaireBrut() {
        double resultat;
        return resultat = super.salaireBrut();
    }

}