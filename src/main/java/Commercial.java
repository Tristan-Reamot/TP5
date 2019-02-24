public abstract class Commercial extends Employe {

    private double chiffreAffaires;
    private double tauxCommission;

    public Commercial(int numSecu, String nom, String prenom, int echelon, double base, double nbHeures, double chiffreAffaires, double tauxCommission) {
        super(numSecu, nom, prenom, echelon, base, nbHeures);
        this.chiffreAffaires = chiffreAffaires;
        this.tauxCommission = tauxCommission;
    }

    public void negocierTransaction(){
        System.out.println("Je négocie une transaction !");
    }

    @Override
    public double salaireBrut() {
        double resultat;
        return resultat = this.getBase() + 100 + chiffreAffaires * tauxCommission;
    }

}