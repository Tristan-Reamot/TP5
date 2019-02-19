public class Technicien extends Employe {

    public Technicien(int numSecu, String nom, String prenom, int echelon, double base, double nbHeures) {
        super(numSecu, nom, prenom, echelon, base, nbHeures);
    }

    public void effectuerTacheTechnique() {
        System.out.println("J'effectue une tâche technique !");
    }

    @Override
    public double salaireBrut() {
        double resultat;
        return resultat = super.salaireBrut() + this.getEchelon() * 100;
    }
}