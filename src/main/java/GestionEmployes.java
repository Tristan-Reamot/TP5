import java.sql.SQLOutput;

public class GestionEmployes {

    public static void main(String[] args){

        Employe riri = new CommercialBuilder()
                .setNumSecu(12345)
                .setNom("Alpha")
                .setPrenom("Riri")
                .setEchelon(2)
                .setBase(18)
                .setNbHeures(151)
                .setChiffreAffaires(500)
                .setTauxCommission(8.0)
                .createCommercial();

        Employe fifi = new FabricantBuilder()
                .setNumSecu(6789)
                .setNom("Beta")
                .setPrenom("Fifi")
                .setEchelon(1)
                .setBase(10)
                .setNbHeures(151)
                .setNbUnitesProduites(80)
                .setTauxCommissionUnite(7)
                .createFabricant();

        Employe loulou = new TechnicienBuilder()
                .setNumSecu(13579)
                .setNom("Delta")
                .setPrenom("Loulou")
                .setEchelon(3)
                .setBase(25)
                .setNbHeures(151)
                .createTechnicien();

        ((Commercial) riri).negocierTransaction();
        ((Fabricant) fifi).fabriquerProduit();
        ((Technicien) loulou).effectuerTacheTechnique();

        System.out.println(loulou);
        System.out.println(riri);
        System.out.println(fifi);

    }
}