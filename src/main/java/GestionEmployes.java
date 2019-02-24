public class GestionEmployes {

    public static void main(String[] args){

        Employe riri = new VendeurBuilder()
                .setNumSecu(12345)
                .setNom("Alpha")
                .setPrenom("Riri")
                .setEchelon(2)
                .setBase(18)
                .setNbHeures(151)
                .setChiffreAffaires(500)
                .setTauxCommission(8.0)
                .createVendeur();

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

        Employe donald = new RepresentantBuilder()
                .setNumSecu(99999)
                .setNom("Gamma")
                .setPrenom("Donald")
                .setEchelon(3)
                .setBase(25)
                .setNbHeures(151)
                .setChiffreAffaires(500)
                .setTauxCommission(8.0)
                .createRepresentant();

        ((Vendeur) riri).negocierTransaction();
        ((Fabricant) fifi).fabriquerProduit();
        ((Technicien) loulou).effectuerTacheTechnique();
        ((Representant) donald).negocierTransaction();

        System.out.println(loulou);
        System.out.println(riri);
        System.out.println(fifi);
        System.out.println(donald);

    }

}