public class Fabricant extends Employe {

    private int nbUnitesProduites;
    private double tauxCommissionUnite;

    public Fabricant(int numSecu, String nom, String prenom, int echelon, double base, double nbHeures, int nbUnitesProduites, double tauxCommissionUnite) {
        super(numSecu, nom, prenom, echelon, base, nbHeures);
        this.nbUnitesProduites = nbUnitesProduites;
        this.tauxCommissionUnite = tauxCommissionUnite;
    }

    public void fabriquerProduit(){
        System.out.println("Je fabrique un produit !");
    }

    @Override
    public double salaireBrut() {
        double resultat;
        return resultat = super.salaireBrut() + nbUnitesProduites * tauxCommissionUnite;
    }
}