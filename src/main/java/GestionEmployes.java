import java.sql.SQLOutput;

public class GestionEmployes {

    public static void main(String[] args){

        Employe riri = new EmployeBuilder()
                .setNumSecu(12345)
                .setNom("Alpha")
                .setPrenom("Riri")
                .setEchelon(1)
                .setBase(10)
                .setNbHeures(151)
                .createEmploye();

        Employe fifi = new EmployeBuilder()
                .setNumSecu(6789)
                .setNom("Beta")
                .setPrenom("Fifi")
                .setEchelon(2)
                .setBase(15)
                .setNbHeures(151)
                .createEmploye();

        Employe loulou = new EmployeBuilder()
                .setNumSecu(13579)
                .setNom("Delta")
                .setPrenom("Loulou")
                .setEchelon(3)
                .setBase(20)
                .setNbHeures(151)
                .createEmploye();

        System.out.println(riri);
        System.out.println(fifi);
        System.out.println(loulou);
    }
}
