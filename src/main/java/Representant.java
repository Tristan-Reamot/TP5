public class Representant extends Commercial {

    public Representant(int numSecu, String nom, String prenom, int echelon, double base, double nbHeures, double chiffreAffaires, double tauxCommission) {
        super(numSecu, nom, prenom, echelon, base, nbHeures, chiffreAffaires, tauxCommission);
    }

    @Override
    public double salaireBrut() {
        Employe tech = new TechnicienBuilder()
                .setNumSecu(0000)
                .setNom("Tech")
                .setPrenom("Tech")
                .setEchelon(getEchelon())
                .setBase(getBase())
                .setNbHeures(getNbHeures())
                .createTechnicien();
        double resultat = tech.salaireBrut();
        return resultat;
    }

}